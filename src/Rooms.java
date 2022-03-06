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

    // Upper hall collisions

    private static final CollisionObject uTop = new CollisionObject(0, 0, 1200,250);
    private static final CollisionObject uLeftBottom = new CollisionObject(0, 450, 620,390);
    private static final CollisionObject uRightMid = new CollisionObject(0, 585, 1200,255);
    private static final CollisionObject uRightBottom = new CollisionObject(780, 450, 420,390);
    public static final Room UPPER_HALL = new Room("Upper hallway","The hallway that leads to other hallways, and the labs.",
            "assets/upper_hall.png", null, new Item[]{Item.CARD},new IWorldObject[]{uTop,
            uLeftBottom, uRightMid, uRightBottom});

    private static final CollisionObject vLeftTop = new CollisionObject(0, 0, 400,845);
    private static final CollisionObject vLeftBottom = new CollisionObject(0, 450, 565,395);
    private static final CollisionObject vRight = new CollisionObject(730, 0, 465,845);

    public static final Room VERTICAL_HALL = new Room("Vertical hallway","The hallway that connects you to the kitchen, Jon's office and another hallway.",
            "assets/vertical_hall.png",null,null,new IWorldObject[]{vLeftTop, vLeftBottom, vRight});

    private static final CollisionObject jLeft = new CollisionObject(0, 0, 70,850);
    private static final CollisionObject jTop = new CollisionObject(0, 0, 1200,150);
    private static final CollisionObject jRight = new CollisionObject(1110, 150, 80,850);
    private static final CollisionObject jBed = new CollisionObject(975, 500, 115,270);
    private static final CollisionObject jTable = new CollisionObject(90, 285, 230,85);
    public static final Room JON_OFFICE = new Room("Jon's office","Jon's magnificent office.",
            "assets/jon_office.png",null,null,new IWorldObject[]{jLeft, jTop, jRight, jBed, jTable});

    public static final Room WEST_HALL = new Room("West hall","The west hall that connects you to the kitchen, the meeting room, and another hallway.",
            "assets/west_hall.png",null,null,null);
    public static final Room SUS_ROOM = new Room("Meeting room", "A suspicious meeting room.", "assets/sus_room.png", null,null,null);
    public static final Room OUTSIDE = new Room("Outside","The area outside of the Jack Cole", "assets/outside.png",null,null, null);

}
