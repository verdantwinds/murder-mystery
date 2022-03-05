public class Suspect extends Person {

    private boolean isMurderer;

    public Suspect(String name, String description, Room location, boolean isMurderer) {
        super(name, description, location);
        this.isMurderer = isMurderer;
    }

    public boolean isMurderer() {
        return isMurderer;
    }
}
