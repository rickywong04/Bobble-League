import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements Runnable {


    private static JFrame frame = new JFrame();
    private static Container content;
    private JLabel chooseYourTeam;
    private JLabel startGame;
    final JLabel teamOneImage = new JLabel();
    final JLabel teamTwoImage = new JLabel();


    @Override
    public void run() {

        //Set the Frame
        frame.setVisible(true);
        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        content = frame.getContentPane();
        content.setLayout(null);
        frame.setLocationRelativeTo(null);


        //Add the "Choose Your Team" to the opening screen
        chooseYourTeam = new JLabel("Choose Your Team");
        chooseYourTeam.setFont(new Font("Arial",Font.BOLD,32));
        chooseYourTeam.setSize(300,100);
        chooseYourTeam.setLocation(500,35);
        content.add(chooseYourTeam);


        //Add Dropdown Menu for Team One
        String [] teams = {"Bad Cattitude", "Messy Messis", "B-Team","Troubles Bruin","Defenders Van Dijk"};
        final JComboBox<String> teamChoiceOne = new JComboBox<>(teams);
        teamChoiceOne.setSize(300,100);
        teamChoiceOne.setLocation(100,125);
        content.add(teamChoiceOne);





        //Displays image based on which is selected, default image Cat

        // Load the image file
        ImageIcon imageIcon = new ImageIcon("Bad Cattitude.png");
        Image image = (imageIcon.getImage()).getScaledInstance(250,250, Image.SCALE_SMOOTH);

        //Add image under the dropdown menu
        teamOneImage.setLocation(125,200);
        teamOneImage.setIcon(new ImageIcon(image));
        teamOneImage.setSize(250,250);
        content.add(teamOneImage);
        teamChoiceOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value=(String)teamChoiceOne.getSelectedItem();
                String imageName=value+ ".png";

                // Load the image file
                ImageIcon imageIcon = new ImageIcon(imageName);
                Image image = (imageIcon.getImage()).getScaledInstance(250,250, Image.SCALE_SMOOTH);

                //Add image under the dropdown menu
                teamOneImage.setLocation(125,200);
                teamOneImage.setIcon(new ImageIcon(image));
                teamOneImage.setSize(250,250);
                content.add(teamOneImage);
            }
        });



        //Add Dropdown Menu for Team Two
        final JComboBox<String> teamChoiceTwo = new JComboBox<>(teams);
        teamChoiceTwo.setSelectedIndex(1);

        teamChoiceTwo.setSize(300,100);
        teamChoiceTwo.setLocation(875,450);
        content.add(teamChoiceTwo);






        //Displays image based on which is selected, default image Messi

        // Load the image file
        ImageIcon imageIconTwo = new ImageIcon("Messy Messis.png");
        Image imageTwo = (imageIconTwo.getImage()).getScaledInstance(250,250, Image.SCALE_SMOOTH);

        //Add image under the dropdown menu
        teamTwoImage.setLocation(900,200);
        teamTwoImage.setIcon(new ImageIcon(imageTwo));
        teamTwoImage.setSize(250,250);
        content.add(teamTwoImage);
        teamChoiceTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value=(String)teamChoiceTwo.getSelectedItem();
                String imageNameTwo=value+ ".png";

                // Load the image file
                ImageIcon imageIconTwo = new ImageIcon(imageNameTwo);
                Image imageTwo = (imageIconTwo.getImage()).getScaledInstance(250,250, Image.SCALE_SMOOTH);

                //Add image under the dropdown menu
                teamTwoImage.setLocation(900,200);
                teamTwoImage.setIcon(new ImageIcon(imageTwo));
                teamTwoImage.setSize(250,250);
                content.add(teamTwoImage);

            }
        });


        //Add Start Game Capabilities
        startGame = new JLabel("Start Game");
        startGame.setFont(new Font("Arial", Font.PLAIN,30));
        startGame.setSize(200,250);
        startGame.setLocation(570,100);
        content.add(startGame);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Screen());
    }

}
