import javax.swing.*;
import java.awt.*;

public class Door {

    private int x;
    private int y;
    private int exitX;
    private int exitY;
    private Image image;
    private Room room;

    public Door(int x, int y, int exitX, int exitY, Room room){
        ImageIcon ii = new ImageIcon("assets/door.png");
        image = ii.getImage().getScaledInstance(60,120,4);
        this.x = x;
        this.y = y;
        this.exitX = exitX;
        this.exitY = exitY;
        this.room = room;
    }

    public int getExitX() {
        return exitX;
    }

    public int getExitY() {
        return exitY;
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
