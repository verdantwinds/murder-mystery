public class CollisionObject implements IWorldObject{
    private final int xPos;
    private final int yPos;

    private final int width;
    private final int height;

    public CollisionObject (int xPos, int yPos, int width, int height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean isSolid() {
        return true;
    }

    @Override
    public int[] getSize() {
        return new int[]{width, height};
    }

    /**
     * Retrieve the position of the object with x, y coordinates
     */
    @Override
    public int[] getPosition() {
        return new int[]{xPos, yPos};
    }
}
