public class Victim extends Item {

    public Victim(String name, String description, int x, int y, String imageURL) {
        super(name, description, imageURL,false, x, y);
        image = image.getScaledInstance(200,200,4);
    }

    public static final Victim Tamzid = new Victim("Tamzid Khandoker", "Looks to have been dead since last night... There are ligature marks on his neck.", 688, 631, "assets/tamzid.png");


}