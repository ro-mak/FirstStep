import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        setTitle("Hello World");
        JPanel panel = new JPanel();
        setSize(500,500);
        setVisible(true);
        TextArea textArea = new TextArea();
        textArea.setText("Hello World");
        panel.add(textArea);
        add(panel);
    }
}
