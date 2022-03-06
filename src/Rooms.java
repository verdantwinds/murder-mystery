// Contains populated room objects, seperated for cleanliness.
public class Rooms {
    public static final Room PARK = new Room("Park","A lovely park","assets/park.png",
            new Suspect[]{Suspect.JON}, new Item[]{Item.knife}, new IWorldObject[]{}, null);
    public static final Room BEACH = new Room("Beach","A sandy beach","assets/beach.png",
            null, null, new IWorldObject[]{}, null);

    // Lab Table collisions
    private static final CollisionObject topLeft = new CollisionObject(147, 0, 74,365);
    private static final CollisionObject secondLeft = new CollisionObject(410, 0, 74,365);
    private static final CollisionObject secondRight = new CollisionObject(662, 0, 74,365);
    private static final CollisionObject farRight = new CollisionObject(920, 0, 74,365);

    private static final CollisionObject bottomFirst = new CollisionObject(660, 460, 538,97);
    private static final CollisionObject bottomSecond = new CollisionObject(660, 645, 538,97);

    private static final CollisionObject leftFirst = new CollisionObject(0, 463, 270,97);
    private static final CollisionObject leftSecond = new CollisionObject(0, 648, 270,47);

    private static final CollisionObject centralTop = new CollisionObject(392, 364, 105,140);
    private static final CollisionObject centralBottom = new CollisionObject(392, 753, 105,92);

    private static final IWorldObject[] labsObjects = new IWorldObject[]{topLeft, secondLeft,
            secondRight, farRight, bottomFirst, bottomSecond, leftFirst, leftSecond, centralTop,
            centralBottom};

    public static final Room LABS = new Room("Labs","The wonderful Jack Cole labs.","assets/lab" +
            ".png", new Suspect[]{Suspect.JON}, null, labsObjects,  new Door[]{new Door(1100, 0, BEACH), new Door(0,720, PARK)});

}
