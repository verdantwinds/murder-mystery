import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GameBoard extends JPanel implements ActionListener {

    private Timer timer;
    private PlayerMoveable player;
    private ArrayList<Door> doors;
    private Room room;

    public GameBoard() {

        addKeyListener(new MoveAdapter());
        setFocusable(true);
        setBackground(Color.WHITE);
        setDoubleBuffered(true);

        player = new PlayerMoveable(this);

        doors = new ArrayList<>();

        this.room = Room.PARK;


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

        g2d.drawImage(room.getImage(),0,0 ,this);

        if(room.getSuspects() != null) {
            for (Suspect s : room.getSuspects()) {
                g2d.drawImage(s.getImage(), s.getX(), s.getY(), this);

            }
        }

        for (Door d : doors) {
            g2d.drawImage(d.getImage(), d.getX(), d.getY(), this);
        }

        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);

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

}