import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements Runnable {


    private static JFrame frame = new JFrame();
    private static Container content;


    @Override
    public void run() {
        frame.setVisible(true);
        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Screen());
    }

}
