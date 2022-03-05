public class Person {

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

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }
}
