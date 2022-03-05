public class Victim extends Person {

    private Weapon murderWeapon;
    private Suspect murderer;

    public Victim(String name, String description, Room location, Weapon murderWeapon, Suspect murderer) {
        super(name, description, location);
        this.murderWeapon = murderWeapon;
        this.murderer = murderer;
    }

}
