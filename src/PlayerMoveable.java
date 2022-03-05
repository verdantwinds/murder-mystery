import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PlayerMoveable {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private GameBoard board;
    private ArrayList<Door> currentDoors;

    public PlayerMoveable(GameBoard board) {
        ImageIcon ii = new ImageIcon("test.png");
        image = ii.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
        x = 40;
        y = 60;
        this.board = board;
    }


    public void move() {
        if(x+dx <= 1100 & x+dx >= 0) {
            x += dx;
        }
        if(y+dy <= 875 & y+dy >= 0) {
            y += dy;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void enterRoom() {
        currentDoors = board.getDoors();
        for(Door d: currentDoors) {
            if (x >= d.getX()-20 && x <= d.getX()+20) {
                if (y >= d.getY() - 20 && y <= d.getY() + 20) {
                    Room holder = d.getRoom();
                    d.setRoom(board.getRoom());
                    board.setRoom(holder);

                    return;
                    //}
                }
            }
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            dx = -5;
        }

        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            dx = 5;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            dy = -5;
        }

        if (key == KeyEvent.VK_DOWN|| key == KeyEvent.VK_S ) {
            dy = 5;
        }

        if (key == KeyEvent.VK_E) {
            enterRoom();
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT|| key == KeyEvent.VK_A) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT|| key == KeyEvent.VK_D) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP|| key == KeyEvent.VK_W) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN|| key == KeyEvent.VK_S ) {
            dy = 0;
        }
    }
}
