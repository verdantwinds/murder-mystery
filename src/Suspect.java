public class Suspect extends Person {

    public static final Suspect JON = new Suspect("Jon Lewis","Head of School", 800,500,"jon.png",false);

    private boolean isMurderer;

    public Suspect(String name, String description, int x, int y, String imageURL, boolean isMurderer) {
        super(name, description, x, y, imageURL);
        this.isMurderer = isMurderer;
    }


    public boolean isMurderer() {
        return isMurderer;
    }
}
