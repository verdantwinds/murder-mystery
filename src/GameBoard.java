import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GameBoard extends JPanel implements ActionListener {

    static final Border BORDER = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
    static final Border COMPOUND_BORDER = BorderFactory.createCompoundBorder(BORDER,BorderFactory.createRaisedBevelBorder());
    private Timer timer;
    private PlayerMoveable player;
    private ArrayList<Door> doors;
    private Room room;
    private static final boolean DISPLAY_HITBOXES = false;

    public GameBoard() {
        setBorder(COMPOUND_BORDER);
        setSize(1200,1000);
        addKeyListener(new MoveAdapter());
        setFocusable(true);
        setBackground(Color.WHITE);
        setDoubleBuffered(true);

        player = new PlayerMoveable(this);

        doors = new ArrayList<>();

        this.room = Room.LABS;

        room.roomDesc(Test.box);
        doors.add(new Door(1100,0, Room.BEACH));

        timer = new Timer(5, this);
        timer.start();
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;

        g2d.drawImage(room.getImage(),0,0 , 1200,890,this);

        if(room.getSuspects() != null) {
            for (Suspect s : room.getSuspects()) {
                g2d.drawImage(s.getImage(), s.getX(), s.getY(), this);
                drawHitbox(g2d, s);

            }
        }

        if(room.getInventory() != null){
            for(Item i: room.getInventory()) {
                g2d.drawImage(i.getImage(),i.getX(),i.getY(),this);
            }
        }


        for (Door d : doors) {
            g2d.drawImage(d.getImage(), d.getX(), d.getY(), this);
        }

        for (IWorldObject o : room.getObjects()) {
            drawHitbox(g2d, o);
        }

        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);

        drawHitbox(g2d, player);



        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();
    }


    private class MoveAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }

    private static void drawHitbox (Graphics2D g, IWorldObject obj) {
        if (DISPLAY_HITBOXES) {
            int[] midpoint = Collision.getMidpoint(obj);

            g.setColor(Color.RED);
            g.drawRect(midpoint[0] - 2, midpoint[1] - 2, 4, 4);
            g.drawRect(obj.getPosition()[0], obj.getPosition()[1], obj.getSize()[0],
                    obj.getSize()[1]);
        }

    }

}
