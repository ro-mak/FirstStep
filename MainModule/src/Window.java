import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello World");
        JPanel panel = new JPanel();
        setSize(500,500);
        setVisible(true);
        JTextArea textArea = new JTextArea();
        textArea.setText("Hello World");
        panel.add(textArea);
        add(panel);
    }
}
