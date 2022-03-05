import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Test extends JFrame {




    public Test() {
//        JPanel main = new JPanel(new GridBagLayout());
//        main.setBackground(Color.gray);
//
        JPanel main = new JPanel(new GridBagLayout());
        main.setSize(1200,1000);


        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;c.gridy=0;
        c.weightx=1;c.weighty=1;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(-10,0,0,0);
        c.fill = GridBagConstraints.BOTH;
        //setLayout(new GridLayout(2,1));
        main.add(new GameBoard(),c);
        c.gridx=0;c.gridy=1;
        c.weightx=1;c.weighty=0;
        c.anchor = GridBagConstraints.SOUTH;
        c.insets = new Insets(-10,0,0,0);
        c.fill = GridBagConstraints.BOTH;
        main.add(new GuiDialogueBox(),c);
//
        add(main);
//        add(new GameBoard());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 1000);
        setLocationRelativeTo(null);
        setTitle("Test Movement");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
