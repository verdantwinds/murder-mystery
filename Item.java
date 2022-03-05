public class Item {

    protected String name;
    protected String description;
    protected boolean canPick;

    public Item(String name, String description, String image boolean canPick) {
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
}
