import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Room {

    private String name;
    private String description;
    private Item[] inventory;
    private Door[] doors;

    // Other objects, like walls.
    private IWorldObject[] objects;

    private Suspect[] suspects;
    private Image image;

    public Room(String name, String description, String image, Suspect[] suspects,
                Item[] items, IWorldObject[] objects) {
        this.objects = objects;
        this.name = name;
        this.description = description;
        ImageIcon ii = new ImageIcon(image);
        this.image = ii.getImage().getScaledInstance(1200,1000,4);
        this.suspects = suspects;
        inventory = items;
        this.doors = doors;


    }

    public String getName() {
        return name;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public Door[] getDoors() {
        return doors;
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
        if(suspects != null) {
            for (IWorldObject obj : suspects) {
                if (check(target, obj)) {
                    return true;
                }
            }
        }

        if (objects != null) {
            for (IWorldObject obj : objects) {
                if (check(target, obj)) {
                    return true;
                }
            }
        }
        if(inventory != null) {
            for (IWorldObject obj : inventory) {
                if (check(target, obj)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check (IWorldObject one, IWorldObject two) {
        return Collision.objectsOverlap(one, two) && one.isSolid() && two.isSolid();
    }

    public IWorldObject[] getObjects() {
        return objects;
    }
}
