public class Item {

    protected String name;
    protected String description;
    protected boolean canPick;

    public Item(String name, String description, boolean canPick) {
        this.name = name;
        this.description = description;
        this.canPick = canPick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCanPick() {
        return canPick;
    }

    public void setCanPick(boolean canPick) {
        this.canPick = canPick;
    }
}
