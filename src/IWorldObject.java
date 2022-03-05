import java.awt.*;

public interface IWorldObject {
    public boolean isSolid ();
    public int[] getSize ();

    /**
     * Retrieve the position of the object with x, y coordinates
     */
    public int[] getPosition ();
}
