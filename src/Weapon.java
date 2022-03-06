public class Weapon extends Item {
    public static final Weapon KNIFE = new Weapon("Knife", "A sharp kitchen knife with a wooden handle", "assets/Knife.png", 300, 300);
    public static final Weapon SWITCH_BLADE = new Weapon("Switch Blade", "A small pocket knife", "assets/SwitchBlade.png", 0, 0);
    public static final Weapon ROUNDERS_BAT = new Weapon("Rounders Bat", "A light wooden rounders bat", "assets/RoundersBat.png", 0, 0);
    public static final Weapon PIANO_WIRE = new Weapon("Piano Wire", "Wire from a piano", "assets/PianoWire.png", 0, 0);
    public static final Weapon PLASTIC_BAG = new Weapon("Plastic Bag", "A small bag for life", "assets/PlasticBag.png", 900, 600);
    public static final Weapon BLEACH = new Weapon("Bleach", "A bottle of toxic bleach", "assets/Bleach.png", 0, 0);
    public static final Weapon SCREWDRIVER = new Weapon("Screwdriver", "A sharp small screwdriver", "assets/Screwdriver.png", 0, 0);
    public static final Weapon CORK_SCREW = new Weapon("Cork Screw", "A small sharp tool for opening bottles", "assets/Corkscrew.png", 0, 0);
    public static final Weapon PEN = new Weapon("Pen", "A black fountain pen", "assets/Pen.png", 0, 0);
    public static final Weapon MOUSE_CABLE = new Weapon("Mouse Cable", "A computer mouse with a long cable", "assets/MouseCable.png", 1050, 250);


    public Weapon(String name, String description, String image, int x, int y) {
        super(name, description, image, true, x, y);
    }
}
