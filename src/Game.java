import javax.swing.*;
import java.awt.*;

public class Game extends JFrame implements Runnable {
    private static JFrame frame = new JFrame();
    private static Container content;
    static Player player;

    public Game (Player player){
        Game.player=player;
    }
    @Override
    public void run() {
       gameStart(player);
    }

    public static void gameStart(Player player){
        //Set the Frame
        frame.setVisible(true);
        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        content = frame.getContentPane();
        content.setLayout(null);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game(player));
    }
}
