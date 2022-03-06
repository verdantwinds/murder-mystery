public class Victim extends Person {

    public Victim(String name, String description, int x, int y, String imageURL) {
        super(name, description, x, y, imageURL);
    }

    public static final Victim Tamzid = new Victim("Tamzid Khandoker", "Poor sod who died", 400, 100, "assets/tamzid.png");

}