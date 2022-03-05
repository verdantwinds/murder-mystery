import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class PlayerMoveable implements IWorldObject {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private GameBoard board;

    private final int height = 100;
    private final int width = 100;

    private ArrayList<Item> inventory;

    public PlayerMoveable(GameBoard board) {
        ImageIcon ii = new ImageIcon("assets/test.png");
        image = ii.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);
        x = 40;
        y = 60;
        inventory = new ArrayList<>();
        this.board = board;
    }


    public void move() {
        if (board.getRoom().checkAllCollisions(this)) {
            return;
        }
        if(x+dx <= 1100 & x+dx >= 0) {

            x += dx;
        }
        if(y+dy <= 775 & y+dy >= 0) {
            y += dy;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void interact() {

        if(board.getRoom().getDoors() != null) {
            for (Door d : board.getRoom().getDoors()) {
                if (x >= d.getX() - 50 && x <= d.getX() + 50) {
                    if (y >= d.getY() - 50 && y <= d.getY() + 50) {
                        Room holder = d.getRoom();
                        board.setRoom(holder);
                        board.getRoom().roomDesc(Test.box);
                        return;

                    }
                }
            }
        }

        if(board.getRoom().getSuspects() != null) {
            for (Suspect s : board.getRoom().getSuspects()) {
                if (x >= s.getX() - 100 && x <= s.getX() + 100) {
                    if (y >= s.getY() - 100 && y <= s.getY() + 100) {
                        s.startDialogue(Test.box);
                        return;

                    }
                }
            }
        }

        if(board.getRoom().getInventory() != null) {
            for (Item i : board.getRoom().getInventory()) {

                if (x >= i.getX() - 20 && x <= i.getX() + 20) {
                    if (y >= i.getY() - 20 && y <= i.getY() + 20) {
                        inventory.add(i);
                        board.getRoom().removeItem(i);
                        Test.box.enterText("Added " + i.getName() + " to inventory.");
                        return;

                    }
                }
            }
        }

    }

    public void askQuestions() {
        Test.box.enterText(
                "<html>1. Where were you at the time of the murder?<br>" +
                "2. Cereal first, or milk first?<br>" +
                        "3. What's the weather like today?<br>" +
                        "4. What was your relationship to the victim like?</html>");
    }

    public void checkInventory() {
        if(inventory.size() == 0){
            Test.box.enterText("Inventory is currently empty.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<html>Inventory: ");
        for(Item i: inventory){
            sb.append(i.getName()).append(" ");
        }
        sb.append("</html>");
        String invText = sb.toString();
        Test.box.enterText(invText);
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN|| key == KeyEvent.VK_S ) {
            dy = 2;
        }

        if (key == KeyEvent.VK_E) {
            interact();
        }

        if(key == KeyEvent.VK_Q) {
            askQuestions();
        }

        if(key == KeyEvent.VK_I) {
            checkInventory();
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT|| key == KeyEvent.VK_A) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT|| key == KeyEvent.VK_D) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP|| key == KeyEvent.VK_W) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN|| key == KeyEvent.VK_S ) {
            dy = 0;
        }
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
     * Includes the delta, so that it can be applied prior to moves.
     */
    @Override
    public int[] getPosition() {
        return new int[]{x + dx, y + dy};
    }
}
