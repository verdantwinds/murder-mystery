import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class GuiEngine extends JFrame {
    public GuiEngine () {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            System.out.println("Exception occurred when setting look and feel: program may appear differently from expected on certain platforms!");
        }
        this.setTitle("STACS Murder Mystery"); //assign title
        this.setSize(new Dimension(750, 750)); //set dimension to 500x500
        this.setLocationRelativeTo(null); //appear in center of screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate program upon closing window
        this.setLayout(new FlowLayout()); // use flow layout


        this.add(new GuiDialogueBox());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GuiEngine e = new GuiEngine();
    }
}
