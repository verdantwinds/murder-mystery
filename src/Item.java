public class Item implements IWorldObject {

    protected String name;
    protected String description;
    protected boolean canPick;

    public Item(String name, String description, String image, boolean canPick) {
        this.name = name;
        this.description = description;
        this.canPick = canPick;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCanPick() {
        return canPick;
    }

    @Override
    public boolean isSolid() {
        return false;
    }

    // todo; Return Dimension
    @Override
    public int[] getSize() {
        return new int[]{0, 0};
    }

    /**
     * Retrieve the position of the object with x, y coordinates
     */
    // Todo: Return X/Y values.
    @Override
    public int[] getPosition() {
        return new int[]{0, 0};
    }
}
