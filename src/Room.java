import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Room {

    public static final Room PARK = new Room("Park","A lovely park","assets/park.png", new Suspect[]{Suspect.JON}, new Item[]{Item.knife});
    public static final Room BEACH = new Room("Beach","A sandy beach","assets/beach.png", null, null);

    private String name;
    private String description;
    private Item[] inventory;

    // Other objects, like walls.
    private ArrayList<IWorldObject> objects = new ArrayList<>();

    private Suspect[] suspects;
    private Image image;

    public Room(String name, String description, String image, Suspect[] suspects, Item[] items) {
        this.name = name;
        this.description = description;
        ImageIcon ii = new ImageIcon(image);
        this.image = ii.getImage().getScaledInstance(1200,1000,4);
        this.suspects = suspects;
        inventory = items;
    }

    public Image getImage() {
        return image;
    }

    public Suspect[] getSuspects() {
        return suspects;
    }

    public void roomDesc(GuiDialogueBox box){
        box.enterText(description);
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void removeItem(Item item) {
        ArrayList<Item> temp = new ArrayList<>(Arrays.asList(inventory));
        temp.remove(item);
        inventory = temp.toArray(new Item[0]);
    }

    // Checks if a given object collides with anything in the room
    public boolean checkAllCollisions(IWorldObject target) {
        for (IWorldObject obj : suspects) {
            if (check(target, obj)) {
                 return true;
            }
        }

        for (IWorldObject obj : objects) {
            if (check(target, obj)) {
                return true;
            }
        }
        for (IWorldObject obj : inventory) {
            if (check(target, obj)) {
                return true;
            }
        }

        return false;
    }

    private boolean check (IWorldObject one, IWorldObject two) {
        return Collision.objectsOverlap(one, two) && one.isSolid() && two.isSolid();
    }
}
