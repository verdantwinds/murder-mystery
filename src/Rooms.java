// Contains populated room objects, seperated for cleanliness.
public class Rooms {



//    public static final Room PARK = new Room("Park","A lovely park","assets/park.png",
//            new Suspect[]{Suspect.JON}, new Item[]{Item.knife}, new IWorldObject[]{}, null);
//    public static final Room BEACH = new Room("Beach","A sandy beach","assets/beach.png",
//            null, null, new IWorldObject[]{}, null);

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



    public static Room LABS = new Room("Labs", "The wonderful Jack Cole labs.", "assets/lab" +
            ".png", new Suspect[]{Suspect.JON}, new Item[]{Weapon.MOUSE_CABLE}, labsObjects);

    // Kitchen collisions
    private static final CollisionObject kitchenTop = new CollisionObject(240, 195, 120,95);
    private static final CollisionObject kitchenTopBar = new CollisionObject(128, 285, 346,35);
    private static final CollisionObject kitchenCounter = new CollisionObject(125, 415, 350,115);
    private static final CollisionObject kitchenSofa = new CollisionObject(158, 526, 270,97);

    private static final CollisionObject tableOne = new CollisionObject(25, 785, 55,61);
    private static final CollisionObject tableTwo = new CollisionObject(147, 785, 55,61);
    private static final CollisionObject tableThree = new CollisionObject(270, 785, 55,61);

    private static final CollisionObject bigTable = new CollisionObject(369, 746, 315,100);
    private static final CollisionObject kitchenWall = new CollisionObject(733, 355, 145,488);

    public static Room KITCHEN = new Room("Kitchen", "The kitchen/lobby hybrid that meets you when you enter Jack Cole.",
            "assets/kitchen.png", new Suspect[]{Suspect.RUTH, Suspect.OZ},
            new Item[]{Weapon.KNIFE, Weapon.PLASTIC_BAG}, new IWorldObject[] {kitchenTop,
            kitchenCounter, kitchenSofa, tableOne, tableTwo, tableThree, bigTable, kitchenWall,
            kitchenTopBar});


}
