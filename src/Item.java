import javax.swing.*;
import java.awt.*;

public class Item implements IWorldObject {

    public static final Item knife = new Item("Knife", "A sharp kitchen knife with a wooden handle", "./assets/Knife.png", true, 500,500);
    public static final Item cereal = new Item("Cereal", "A box of Corn Flakes", "cornflakes.png",true, 0, 0);
    protected String name;
    protected String description;
    protected boolean canPick;
    protected Image image;
    protected int x;
    protected int y;

    public Item(String name, String description, String image, boolean canPick, int x, int y) {
        this.name = name;
        this.description = description;
        this.canPick = canPick;
        ImageIcon ii = new ImageIcon(image);
        this.image = ii.getImage().getScaledInstance(100,100,4);

        this.x = x;
        this.y = y;
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
