import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Create CreateLoginForm class to create login form
// Class extends JFrame to create a window where our components add
// Class implements ActionListener to perform an action on button click
class CreateLoginForm extends JFrame implements ActionListener {
    // Initialize button, panel, label, and text field
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    JTextField textField1, textField2;

    // Calling constructor
    CreateLoginForm() {
        // Create label for username
        userLabel = new JLabel("Username");
        // Create text field to get username from the user
        textField1 = new JTextField(15);

        // Create label for password
        passLabel = new JLabel("Password");
        // Create text field to get password from the user
        textField2 = new JPasswordField(15);

        // Create submit button
        b1 = new JButton("SUBMIT");

        // Create panel to put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel); // Set username label to panel
        newPanel.add(textField1); // Set text field to panel
        newPanel.add(passLabel); // Set password label to panel
        newPanel.add(textField2); // Set text field to panel
        newPanel.add(b1); // Set button to panel

        // Set border to panel
        add(newPanel, BorderLayout.CENTER);

        // Perform action on button click
        b1.addActionListener(this); // Add action listener to button
        setTitle("LOGIN FORM"); // Set title to the login form
    }

    // Define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae) {
        String userValue = textField1.getText(); // Get user entered username from the textField1
        String passValue = textField2.getText(); // Get user entered password from the textField2

        // // Check whether the credentials are authentic or not
        // if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {
        //     // If authentic, navigate user to a new page

        //     // Create instance of the NewPage
            
        //     // Make page visible to the user
        //     page.setVisible(true);

        //     // Create a welcome label and set it to the new page
        //     JLabel wel_label = new JLabel("Welcome: " + userValue);
        //     page.getContentPane().add(wel_label);
        // } else {
        //     // Show error message
        //     JOptionPane.showMessageDialog(null, "Please enter valid username and password");
        // }
    }
}

// Create the main class
class LoginFormDemo {
    // Main method start
    public static void main(String arg[]) {
        try {
            // Create instance of the CreateLoginForm
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(300, 150); // Set size of the frame
            form.setVisible(true); // Make form visible to the user
        } catch (Exception e) {
            // Handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
