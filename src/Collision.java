/**
 * Collision utils
 */
public class Collision {
    public static boolean objectsOverlap (IWorldObject one, IWorldObject two) {
        int[] sizeOne = one.getSize();
        int[] sizeTwo = two.getSize();

        int oneMidpointX = getMidpoint(one)[0];
        int oneMidpointY = getMidpoint(one)[1];

        int twoMidpointX = getMidpoint(two)[0];
        int twoMidpointY = getMidpoint(two)[1];

        int distance = calcDistance(oneMidpointX, oneMidpointY, twoMidpointX, twoMidpointY);

        int filledDistanceX = (sizeOne[0] / 3) + (sizeTwo[0] / 3);
        int filledDistanceY = (sizeOne[1] / 3) + (sizeTwo[1] / 3);

        int filledDistance = (int) Math.floor(Math.hypot(filledDistanceX, filledDistanceY)) + 5;

        return distance <= filledDistance;

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
