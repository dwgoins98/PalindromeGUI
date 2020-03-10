import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.ArrayList;

public class NameInfo{

    public static boolean palindromChecker(String ... var) {

        boolean result = false;

// This confirms what the user put in is what is being checked

        System.out.println("Checking these names for palindromes...");
        System.out.println();
        System.out.println("---------------------------------------");

        for(String checkString : var)   {

            System.out.println(checkString);

        } // end of enhanced for loop

        System.out.println("---------------------------------------");
        System.out.println();

// This enhanced for loop steps through each variable that has been entered
        for(String checkString : var)   {

            /*
             * StringBuilder uses its own methods to reverse the string you want and make life much easier
             */

            StringBuilder originalString = new StringBuilder(checkString);
            StringBuilder backwardsString = new StringBuilder(originalString);

             /* 
              * This if-else statement compares the two strings to see if they are equal using .toString() and .equals().
              * If they are equal, then it is a palindrome. If they are not equal, the result will return false.
              */

            if(backwardsString.toString().equals(originalString.reverse().toString()))   {

                result =  true;

            }   else    {

                result = false;

            } // end of else
            
        } // end of enhanced for loop

        return result;

    } // end of palindromChecker

}

public class PalindromeCheckerGUI extends JFrame implements ActionListener  {
    private JTextField nameCheckField;                      // Holds the name to be checked
    private JTextField nameReverseField;                    // Holds the name in reverse
    private JTextField palindromeTrueField;                 // Holds the symbol for if it's a palindrome or not
    private JLabel tabelLabel;                              // Holds the table display
    private JLabel nameCheckLabel;                          // Label for name to be checked
    private JLabel nameReverseLabel;                        // Label for name in reverse
    private JLabel palindromeTrueLabel;                     // Label for the sy,bol for if it's a palindrome or not
    private JButton checkButton;                            // Triggers the program to check the palindrome
    private JButton quitButton;                             // Triggers termination of GUI
    private JTable palindromeTable;                         // Table tracks palindromes
    private static ArrayList<NameInfo> palindNameInfos;    // Array List of name objects

    PalindromeCheckerGUI() {

        String[] columnHeading = {"Name to check"};
        GridBagConstraints layoutConstraints;

        // The frame's title
        setTitle("Palindrom Checker");

        // Create the palindrome checker table
        tabelLabel = new JTable ("Name to check:");
        nameCheckLabel = new JTable ("Name in reverse");
        palindromeTrueLabel = new JTable("Palindrome?");

        // Text field for the user to put the name into
        nameCheckField = new JFormattedTextField(20);
        nameCheckField.setEditable(true);
        nameCheckField.setText("Put the name you want to check here!");

        // Check button
        checkButton = new JButton("Check!");
        checkButton.addActionListener(this);

        // Quit button
        quitButton = new JButton("Quit :(");
        checkButton.addActionListener(this);

        // Initialized the table here
        palindromeTable = new JTable(columnHeading);
        palindromeTable.setEnabled(false);                      // This way, the user can't add their name into the table

        // Adds the grid layout
        setLayout(new GridBagLayout());

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 10, 1, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        add(tableLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(1, 10, 0, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.gridwidth = 4;
        add(palindromeTable.getTableHeader(), layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(0, 10, 10, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 2;
        layoutConstraints.gridwidth = 4;
        add(palindromeTable, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 10, 1, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 3;
        layoutConstraints.gridwidth = 4;
        add(nameCheckLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(1, 10, 10, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 4;
        layoutConstraints.gridwidth = 4;
        add(nameCheckField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 10, 1, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 3;
        layoutConstraints.gridwidth = 4;
        add(nameReverseLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(1, 10, 10, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 4;
        layoutConstraints.gridwidth = 4;
        add(nameReverseField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 10, 1, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 3;
        layoutConstraints.gridwidth = 4;
        add(palindromeTrueLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(1, 10, 10, 0);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 4;
        layoutConstraints.gridwidth = 4;
        add(palindromeTrueField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(0, 10, 10, 5);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 4;
        layoutConstraints.gridy = 4;
        layoutConstraints.gridwidth = 4;
        add(checkButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(0, 5, 10, 10);
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 4;
        layoutConstraints.gridwidth = 4;
        add(quitButton, layoutConstraints);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        NameInfo name;
        String nameToCheck;

        JButton sourceEvent = (JButton) event.getSource();

        if(sourceEvent == checkButton){
            
        }

    } 

    public static void main(String[] args) {
        PalindromeCheckerGUI test = new PalindromeCheckerGUI();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.pack();
        test.setVisible(true);
    }

}