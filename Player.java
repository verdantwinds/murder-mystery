import java.util.ArrayList;

public class Player extends Person {

    private ArrayList<Item> inventory;
    int x;
    int y;

    public Player(String name, String description, Room location) {
        super(name, description, location);
        inventory = new ArrayList<>();
        inventory.add(new Item("Student ID","Your student ID card. Can be used to access rooms and buildings.", true));

    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
