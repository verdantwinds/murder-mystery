import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameArea extends JFrame implements KeyListener{

    private JPanel gamePanel = new JPanel(new GridLayout(10,10));
    private JPanel[][] gameGrid = new JPanel[10][10];
    Player player;
    int currentX;
    int currentY;

    public GameArea(JFrame mainframe, Player player){
        this.player = player;
        mainframe.add(gamePanel);
        currentX = player.getX();
        currentY = player.getY();
        addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == KeyEvent.VK_UP) {
            gameGrid[currentX-1][currentY].add(player);
            gameGrid[currentX-1][currentY].validate();
            currentX--;
            player.setX(currentX);
        } else if(keyCode == KeyEvent.VK_DOWN) {
            gameGrid[currentX+1][currentY].add(player);
            gameGrid[currentX+1][currentY].validate();
            currentX++;
            player.setX(currentX);
        } else if(keyCode == KeyEvent.VK_LEFT) {
            gameGrid[currentX][currentY-1].add(player);
            gameGrid[currentX][currentY-1].validate();
            currentY--;
            player.setY(currentY);
        } else if(keyCode == KeyEvent.VK_RIGHT) {
            gameGrid[currentX][currentY+1].add(player);
            gameGrid[currentX][currentY+1].validate();
            currentY++;
            player.setY(currentY);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}