import javax.swing.*;
import java.awt.*;

public class Person implements IWorldObject {

    protected String name;
    protected String description;
    protected Room location;
    protected int x;
    protected int y;
    protected int height = 100;
    protected int width = 100;

    protected Image image;

    public Person(String name, String description, int x, int y, String imageURL){
        this.name = name;
        this.description = description;
        this.x = x;
        this.y = y;
        ImageIcon ii = new ImageIcon("../"+imageURL);
        image = ii.getImage().getScaledInstance(width,height,4);
    }

    public Image getImage(){
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean isSolid() {
        return true;
    }

    @Override
    public int[] getSize() {
        return new int[] {width, height};
    }

    /**
     * Retrieve the position of the object with x, y coordinates
     */
    @Override
    public int[] getPosition() {
        return new int[]{this.getX(), this.getY()};
    }
}
