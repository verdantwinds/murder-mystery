import javax.swing.*;
import java.awt.*;

public class Person {

    protected String name;
    protected String description;
    protected Room location;
    protected int x;
    protected int y;
    protected Image image;

    public Person(String name, String description, int x, int y, String imageURL){
        this.name = name;
        this.description = description;
        this.x = x;
        this.y = y;
        ImageIcon ii = new ImageIcon(imageURL);
        image = ii.getImage().getScaledInstance(100,100,4);
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
}
