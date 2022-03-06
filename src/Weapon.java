public class Weapon extends Item {
    public static final Weapon KNIFE = new Weapon("Knife", "A sharp kitchen knife, freshly cleaned.", "assets/Knife.png", 300, 300);
    public static final Weapon PLASTIC_BAG = new Weapon("Plastic Bag", "A small plastic bag. Looks stretched out.", "assets/PlasticBag.png", 900, 700);
    public static final Weapon BLEACH = new Weapon("Bleach", "A bottle of toxic bleach. Still fairly full.", "assets/bleach.png", 402, 704);
    public static final Weapon PEN = new Weapon("Pen", "A black fountain pen. It looks well used.", "assets/fountainpen.png", 844, 252);
    public static final Weapon MOUSE_CABLE = new Weapon("Mouse Cable", "A computer mouse with a long cable. The cable looks worn.", "assets/MouseCable.png", 1050, 250);


    public Weapon(String name, String description, String image, int x, int y) {
        super(name, description, image, true, x, y);
    }
}
