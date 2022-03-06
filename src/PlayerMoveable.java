import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PlayerMoveable implements IWorldObject {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private GameBoard board;

    private final int height = 80;
    private final int width = 80;

    private boolean accuse = false;
    private boolean correctSuspect = false;
    private boolean correctWeapon = false;

    private ArrayList<Item> inventory;

    public PlayerMoveable(GameBoard board) {
        ImageIcon ii = new ImageIcon("assets/test.png");
        image = ii.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);
        x = 550;
        y = 300;
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
                        board.setRoom(d.getRoom());
                        board.getRoom().roomDesc(Main.box);
                        x = d.getExitX();
                        y = d.getExitY();
                        accuse = false;
                        return;

                    }
                }
            }
        }

        if(board.getRoom().getSuspects() != null) {
            for (Suspect s : board.getRoom().getSuspects()) {
                if (x >= s.getX() -150 && x <= s.getX() + 150 ) {
                    if (y >= s.getY() -150&& y <= s.getY() + 150) {
                        s.startDialogue(Main.box);
                        return;

                    }
                }
            }
        }

        if(board.getRoom().getInventory() != null) {
            for (Item i : board.getRoom().getInventory()) {

                if (x >= i.getX() - 25 && x <= i.getX() + 100) {
                    if (y >= i.getY() -25 && y <= i.getY() + 100) {
                        if(i instanceof Victim) {
                            System.out.println("victim");
                            Main.box.enterText(i.getDescription());
                        } else {
                            inventory.add(i);
                            board.getRoom().removeItem(i);
                            Main.box.enterText("Added " + i.getName() + " to inventory.");
                        }
                        return;

                    }
                }
            }
        }

    }

    public void askQuestions() {
        StringBuilder sb = new StringBuilder();
        sb.append("1. Where were you at the time of the murder?<br>");
        sb.append("2. What's the weather like today?<br>");
        sb.append("3. What was your relationship to the victim like?<br>");
        if(inventory.contains(Item.cereal)){
            sb.append("4. Cereal first, or milk first?<br>");
        }
        Main.box.enterText(sb.toString());
    }

    public void checkInventory() {
        if(inventory.size() == 0){
            Main.box.enterText("Inventory is currently empty.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<html>Inventory: ");
        for(int i = 0; i < inventory.size(); i++){
            if (i == inventory.size() - 1){
                sb.append(inventory.get(i).getDescription());
            } else if(i%2 == 0){
                sb.append(inventory.get(i).getDescription()).append("<br>");
            } else {
                sb.append(inventory.get(i).getDescription()).append(" ");
            }

        }
        sb.append("</html>");
        String invText = sb.toString();
        Main.box.enterText(invText);
    }

    public void accusation() {
        accuse = true;
        if(board.getRoom().equals(Rooms.SUS_ROOM)) {
            if(!correctSuspect) {
                Main.box.enterText("Choose a suspect: 1. Ruth 2. Özgür 3. Saleem 4. Ian 5. Edwin. 6. Jon 7. Tristan");
            } else {
                Main.box.enterText("Choose a weapon: 1. Bleach 2. Mouse Cable 3. Pen 4. Plastic Bag 5. Knife");
            }
        }
    }

    public void accuseSuspect(int i) {
        if(!correctSuspect){
            System.out.println("right place");
            if(i == 6) {
                Main.box.enterText("Correct! Jon is the murderer... but how did he do it? Press SPACE again to choose...");
                correctSuspect = true;
            } else {
                Main.box.enterText("That doesn't seem to add up...");
            }
        }
         else {
            if(i == 2) {
                Main.box.enterText("The mouse cable! That makes perfect sense!");
                correctWeapon = true;
            } else {
                Main.box.enterText("That doesn't seem to add up...");
            }
        }
    }

    public void questionOne() {
        if(board.getRoom().getSuspects() != null) {
            for (Suspect s : board.getRoom().getSuspects()) {
                if (x >= s.getX() - 100 && x <= s.getX() + 100) {
                    if (y >= s.getY() - 100 && y <= s.getY() + 100) {
                        s.q1Dialogue(Main.box);
                        return;

                    }
                }
            }
        }
    }

    public void questionTwo() {
        if(board.getRoom().getSuspects() != null) {
            for (Suspect s : board.getRoom().getSuspects()) {
                if (x >= s.getX() - 100 && x <= s.getX() + 100) {
                    if (y >= s.getY() - 100 && y <= s.getY() + 100) {
                        s.q2Dialogue(Main.box);
                        return;

                    }
                }
            }
        }
    }

    public void questionThree() {
        if(board.getRoom().getSuspects() != null) {
            for (Suspect s : board.getRoom().getSuspects()) {
                if (x >= s.getX() - 100 && x <= s.getX() + 100) {
                    if (y >= s.getY() - 100 && y <= s.getY() + 100) {
                        s.q3Dialogue(Main.box);
                        return;

                    }
                }
            }
        }
    }

    public void questionFour() {

        if(inventory.contains(Item.cereal) && board.getRoom().getSuspects() != null) {
            for (Suspect s : board.getRoom().getSuspects()) {
                if (x >= s.getX() - 100 && x <= s.getX() + 100) {
                    if (y >= s.getY() - 100 && y <= s.getY() + 100) {
                        s.q4Dialogue(Main.box);
                        return;

                    }
                }
            }
        }
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

        if(key == KeyEvent.VK_1) {
            if(accuse){
                accuseSuspect(1);
            } else {
                questionOne();
            }
        }

        if(key == KeyEvent.VK_2) {
            if(accuse){
                accuseSuspect(2);
            } else {

                questionTwo();
            }
        }

        if(key == KeyEvent.VK_3) {
            if(accuse){
                accuseSuspect(3);
            } else {
                questionThree();
            }
        }

        if(key == KeyEvent.VK_4) {
            if(accuse){
                accuseSuspect(4);
            } else {
                questionFour();
            }
        }

        if(key == KeyEvent.VK_5 ) {
            if(accuse){
                accuseSuspect(5);
            }
        }

        if(key == KeyEvent.VK_6 ) {
            System.out.println("press 6");
            if(accuse && !correctSuspect){
                accuseSuspect(6);
            }
        }

        if(key == KeyEvent.VK_7) {
            if(accuse && !correctSuspect){
                accuseSuspect(7);
            }
        }

        if(key == KeyEvent.VK_SPACE) {
            accusation();
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

    public boolean checkWin() {
        return correctSuspect && correctWeapon;
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
