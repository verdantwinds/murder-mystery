public class Weapon extends Item {
    public static final Weapon KNIFE = new Weapon("Knife", "A sharp kitchen knife with a wooden handle");
    public static final Weapon SWITCH_BLADE = new Weapon("Switch Blade", "A small pocket knife")
    public Weapon(String name, String description) {
        super(name, description, true);
    }
}
