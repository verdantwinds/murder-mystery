import javax.swing.*;

public class Person extends JLabel {

    protected String name;
    protected String description;
    protected Room location;

    public Person(String name, String description, Room location){
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room getRoom() {
        return location;
    }

    public void setRoom(Room location) {
        this.location = location;
    }
}
