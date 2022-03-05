// Contains populated room objects, seperated for cleanliness.
public class Rooms {
    public static final Room PARK = new Room("Park","A lovely park","assets/park.png",
            new Suspect[]{Suspect.JON}, new Item[]{Item.knife}, new IWorldObject[]{});
    public static final Room BEACH = new Room("Beach","A sandy beach","assets/beach.png",
            null, null, new IWorldObject[]{});

    // Lab Table collisions
    private static final CollisionObject topLeft = new CollisionObject(147, 0, 74,365);
    private static final CollisionObject secondLeft = new CollisionObject(410, 0, 74,365);
    private static final CollisionObject secondRight = new CollisionObject(662, 0, 74,365);
    private static final CollisionObject farRight = new CollisionObject(920, 0, 74,365);
    private static final IWorldObject[] labsObjects = new IWorldObject[]{topLeft, secondLeft,
            secondRight, farRight};

    public static final Room LABS = new Room("Labs","The wonderful Jack Cole labs.","assets/lab" +
            ".png", new Suspect[]{Suspect.JON}, null, labsObjects);

}
