package Extra.Playground;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage  {
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");

    //constructor
    WelcomePage(String userID) {

        welcomeLabel.setBounds(100,100,200,35);
        welcomeLabel.setFont(new Font(null, Font.BOLD,20));
        welcomeLabel.setText("Hello"+userID);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
