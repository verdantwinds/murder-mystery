import javax.swing.*;
import java.awt.*;

public class Door {

    private int x;
    private int y;
    private Image image;
    private Room room;

    public Door(int x, int y, Room room){
        ImageIcon ii = new ImageIcon("assets/door.png");
        image = ii.getImage().getScaledInstance(60,120,4);
        this.x = x;
        this.y = y;
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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
}
