/**
 * Collision utils
 */
public class Collision {
    public static boolean objectsOverlap (IWorldObject one, IWorldObject two) {
        int xStart1 = one.getPosition()[0];
        int yStart1 = one.getPosition()[1];
        int xEnd1 = xStart1 + one.getSize()[0];
        int yEnd1 = yStart1 + one.getSize()[1];

        int xStart2 = two.getPosition()[0];
        int yStart2 = two.getPosition()[1];
        int xEnd2 = xStart2 + two.getSize()[0];
        int yEnd2 = yStart2 + two.getSize()[1];

        // This equation has been formally mathematically proven by someone much smarter than I
        // https://stackoverflow.com/questions/306316/determine-if-two-rectangles-overlap-each-other
        return (xStart1 < xEnd2 && xEnd1 > xStart2 &&
                yStart1 < yEnd2 && yEnd1 > yStart2);



    }

    private static int calcDistance (int xOne, int yOne, int xTwo, int yTwo) {
        return (int) Math.floor(Math.sqrt((yTwo - yOne) * (yTwo - yOne) + (xTwo - xOne) * (xTwo - xOne)));
    }

    public static int[] getMidpoint (IWorldObject obj) {
        int midpointX = obj.getPosition()[0] + (obj.getSize()[0] / 2);
        int midpointY = obj.getPosition()[1] + (obj.getSize()[1] / 2);
        return new int[]{midpointX, midpointY};
    }
}
