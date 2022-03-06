import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static GuiDialogueBox box;



    public Main() {
//        JPanel main = new JPanel(new GridBagLayout());
//        main.setBackground(Color.gray);
//
        setSize(1200, 1000);
        box = new GuiDialogueBox();
        JPanel main = new JPanel(new GridBagLayout());
        main.setSize(1200,1000);



        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;c.gridy=0;
        c.weightx=1;c.weighty=1;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0,0,0,0);
        c.fill = GridBagConstraints.BOTH;
        //setLayout(new GridLayout(2,1));
        main.add(new GameBoard(),c);
        c.gridx=0;c.gridy=2;
        c.weightx=1;c.weighty=0;
        c.anchor = GridBagConstraints.SOUTH;
        c.insets = new Insets(-5,0,-5,0);
        c.fill = GridBagConstraints.BOTH;
        main.add(box,c);
//
        add(main);
//        add(new GameBoard());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setTitle("Test Movement");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
