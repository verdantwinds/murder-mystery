import java.util.ArrayList;

public class Player extends Person {

    private ArrayList<Item> inventory;

    public Player(String name, String description, Room location) {
        super(name, description, location);
        inventory = new ArrayList<>();
        inventory.add(new Item("Student ID","Your student ID card. Can be used to access rooms and buildings.", true));

    }
}
