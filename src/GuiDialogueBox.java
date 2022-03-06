import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

// todo: add background
public class GuiDialogueBox extends JPanel {
    private JLabel dialogue;
    private Timer textUpdater = null;
    private static final int UPDATE_DELAY = 50;

    public GuiDialogueBox () {
        super();

        String img = "./assets/DialogueBoxSimple.png";
        ImageIcon icon = new ImageIcon(img);
        Image image = icon.getImage(); // transform it
        Image newimg = image.getScaledInstance(1200, 116,  java.awt.Image.SCALE_SMOOTH); // scale it
        // the smooth way
        icon = new ImageIcon(newimg);

        dialogue = new JLabel(icon);
        dialogue.setText("<html>Dialogue Text...<br>NewLine</html>");
        dialogue.setHorizontalTextPosition(JLabel.CENTER);
        dialogue.setVerticalTextPosition(JLabel.CENTER);


        this.add(dialogue);
        enterText("This is some example text...");
        //enterText("foo");
    }

    public void enterText (String text) {
        // The last character isn't displayed, and altering the end conditions causes an error
        // I can't be bothered fixing it, so we'll add an extra character to the end instead.
        String modifiedText = text + "</html>";

        // Handle call before prev. done
        if (textUpdater != null && textUpdater.isRunning()) {
            textUpdater.stop();
        }
        dialogue.setText("");

        var ref = new Object() {
            String currText = "";
            int currentPos = 0;
        };
        ref.currText = "<html>";
        textUpdater = new Timer(UPDATE_DELAY, e -> {
            if (ref.currentPos >= modifiedText.length()) {
                textUpdater.stop();
                return;
            }

            dialogue.setText(ref.currText);
            ref.currText = ref.currText + modifiedText.charAt(ref.currentPos);
            ref.currentPos++;

        });
        textUpdater.start();
    }
}
