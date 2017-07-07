import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window();
            }
        });
    }
}
