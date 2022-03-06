import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class GameBoard extends JPanel implements ActionListener {

    static final Border BORDER = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
    static final Border COMPOUND_BORDER = BorderFactory.createCompoundBorder(BORDER,BorderFactory.createRaisedBevelBorder());
    private Timer timer;
    private PlayerMoveable player;
    private ArrayList<Door> doors;
    private Room room;
    private static final boolean DISPLAY_HITBOXES = true;

    public GameBoard() {

        setBorder(COMPOUND_BORDER);
        setSize(1200,1000);
        addKeyListener(new MoveAdapter());
        setFocusable(true);
        setBackground(Color.WHITE);
        setDoubleBuffered(true);

        player = new PlayerMoveable(this);


        Rooms.LABS.setDoors(new Door[]{new Door(1100, 0, 680,490, Rooms.UPPER_HALL), new Door(0, 720, 750,490, Rooms.KITCHEN)});
        Rooms.KITCHEN.setDoors(new Door[]{new Door(740, 0,0, 720, Rooms.LABS), new Door(1050,0,600,790,Rooms.VERTICAL_HALL),
        new Door(0,50,0,0,null), new Door(1120,700,0,0,null)});
        Rooms.UPPER_HALL.setDoors(new Door[]{new Door(680,490,1100,0, Rooms.LABS), new Door(0,264,0,0,null), new Door(1150, 260,400,40,Rooms.VERTICAL_HALL)});
        Rooms.VERTICAL_HALL.setDoors(new Door[]{new Door(400,40,1100,260,Rooms.UPPER_HALL), new Door(690,160,520,750,Rooms.JON_OFFICE), new Door(600,790,1050,0,Rooms.KITCHEN)});
        this.room = Rooms.VERTICAL_HALL;
        Rooms.JON_OFFICE.setDoors(new Door[]{new Door(520,790,690,160,Rooms.VERTICAL_HALL)});

        room.roomDesc(Main.box);

        GameBoard that = this;
        addMouseListener(
                new MouseAdapter() {
                    //define functionality when mouse is clicked
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Point p = e.getPoint();
                        SwingUtilities.convertPointFromScreen(e.getPoint(),
                                that);
                        System.out.println(p);
                    }
                }

        );

        timer = new Timer(5, this);
        timer.start();
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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

        if(room.getDoors() != null ) {
            for (Door d : room.getDoors()) {
                g2d.drawImage(d.getImage(), d.getX(), d.getY(), this);
            }
        }
        if(room.getObjects() != null) {
            for (IWorldObject o : room.getObjects()) {
                drawHitbox(g2d, o);
            }
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
