package Extra.Playground;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;



public class LoginPage  implements ActionListener{
    //instances of the objects 
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel= new JLabel();

    //this is to create a copy of our hashmap 
    HashMap<String,String> logininfo = new HashMap<String ,String>();

     //constructor that accepts hashmaps
     LoginPage(HashMap<String, String> loginInfoOriginal) {
         
        logininfo = loginInfoOriginal;
        //adding our components
        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.BOLD,25));

        userIDField.setBounds(125,100,200,30);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        //we need to add an action listener for this button
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null); //we dont want a layout manager
        frame.setVisible(true);

     }

// class to handle actions
    @Override
    public void actionPerformed(ActionEvent e) {
        //let's work on the actions of the reset button
        if (e.getSource() ==resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
        //let's work on the login action
        if (e.getSource() == loginButton) {
            //create a new variable of a user
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            
            //checking if fields are empty 
            if(logininfo.containsKey(userID)) {
                //verifying if the password is correct
                if (logininfo.get(userID).equals(password)){
                    //this means the credentials are verified
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful.");
                    //this is gonna be the next page 
                   frame.dispose();
                   
                    WelcomePage welcomePage = new WelcomePage(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password.");
                }     
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("user name not found");
            }
        }
    }


}
