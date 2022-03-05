import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    private String name;
    private String description;
    private ArrayList<Item> inventory;
    private ArrayList<Person> members;
    private Exit[] exits = new Exit[4];

    public Room(String name, String description, Exit[] exits) {
        this.name = name;
        this.description = description;
        this.exits = exits;
        inventory = new ArrayList<>();
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

    public Exit[] getExits() {
        return exits;
    }

    public Room getRoomInDirection(String direction) {
        for(Exit e: exits){
            if(e.getDirection().equals(direction)){
                return e.getRoom();
            }
        }
        return null;
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
