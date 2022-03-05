import javax.swing.*;

public class Test extends JFrame {

    public Test() {
        add(new GameBoard());
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
