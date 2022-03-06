import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main extends JFrame {

    public static GuiDialogueBox box;
    private JPanel main;
    private Audio audio;

    public Main() {
//        JPanel main = new JPanel(new GridBagLayout());
//        main.setBackground(Color.gray);
//
        setSize(1200, 1000);

        try {
            audio = new Audio();
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


        startScreen();
        ImageIcon ii = new ImageIcon("assets/sherlock.png");
        setIconImage(ii.getImage());
//        add(new GameBoard());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setTitle("Sherlock Bones: The Jack Cole Mystery");
        setResizable(false);
        setVisible(true);
    }

    public Audio getAudio() {
        return audio;
    }

    public void mainPanel() {

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
        GameBoard gb = new GameBoard(this);
        main.add(gb,c);
        c.gridx=0;c.gridy=2;
        c.weightx=1;c.weighty=0;
        c.anchor = GridBagConstraints.SOUTH;
        c.insets = new Insets(-5,0,-5,0);
        c.fill = GridBagConstraints.BOTH;
        main.add(box,c);

        this.main = main;
        gb.requestFocus();
        add(main);
        validate();
    }

    public void startScreen() {
        ImageIcon ii = new ImageIcon("../assets/start.png");

        JPanel startP = new JPanel();
        startP.setBackground(Color.decode("#951f1f"));
        JLabel start = new JLabel(ii);
        startP.add(start);
        add(startP);
        JButton button = new JButton("START GAME");
        button.setSize(1200,200);
        button.setFont(new Font(Font.SERIF, Font.BOLD,50));
        button.setBackground(Color.decode("#c08585"));
        button.setForeground(Color.BLACK);
        startP.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(startP);
                mainPanel();
                main.requestFocus();
                validate();
            }
        });
        validate();
    }

    public void winScreen() {
        ImageIcon ii = new ImageIcon("../assets/win.png");
        remove(main);
        JPanel winP = new JPanel();
        JLabel win = new JLabel(ii);
        winP.add(win);
        add(winP);
        validate();
    }

    public static void main(String[] args) {
        new Main();
    }
}
