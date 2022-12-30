import javax.swing.*;
import java.awt.*;

public class Game extends JFrame implements Runnable {
    private static JFrame frame = new JFrame();
    private static Container content;


    @Override
    public void run() {
       gameStart();
    }

    public static void gameStart(){
        //Set the Frame
        frame.setVisible(true);
        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        content = frame.getContentPane();
        content.setLayout(null);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game());
    }
}
