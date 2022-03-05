import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    public static final Room PARK = new Room("Park","A lovely park","assets/park.png", new Suspect[]{Suspect.JON});
    public static final Room BEACH = new Room("Beach","A sandy beach","assets/beach.png", null);

    private String name;
    private String description;
    private ArrayList<Item> inventory;
    private Suspect[] suspects;
    private Image image;

    public Room(String name, String description, String image, Suspect[] suspects) {
        this.name = name;
        this.description = description;
        ImageIcon ii = new ImageIcon(image);
        this.image = ii.getImage().getScaledInstance(1200,1000,4);
        this.suspects = suspects;
        inventory = new ArrayList<>();
    }

    public Image getImage() {
        return image;
    }

    public Suspect[] getSuspects() {
        return suspects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }


    public void addToRoom(Item item){
        inventory.add(item);
    }

    public Item removeFromRoom(Item item){
        Item temp;
        temp = inventory.get(inventory.indexOf(item));
        inventory.remove(item);
        return temp;
    }
}
