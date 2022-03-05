public class Exit {
    private String direction;
    private Room room;

    public Exit(String direction, Room room) {
        this.direction = direction;
        this.room = room;
    }

    public String getDirection() {
        return direction;
    }

    public Room getRoom() {
        return room;
    }
}
