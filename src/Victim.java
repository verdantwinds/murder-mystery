public class Victim extends Person {

    private Weapon murderWeapon;

    public Victim(String name, String description, int x, int y, String imageURL, Weapon murderWeapon) {
        super(name, description, x, y, imageURL);
        this.murderWeapon = murderWeapon;
    }

    public static final Victim Tamzid = new Victim("Tamzid Khandoker", "Poor sod who died", 400, 100, "assets/tamzid.png", Weapon.MOUSE_CABLE);

}