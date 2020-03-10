import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeCheckerGUI2 extends JFrame implements ActionListener{

private JLabel nameToCheckLabel;
private JLabel palCheckLabel;
private JTextField nameToCheckField;
private JTextField palCheckField;
private JButton checkButton;
JFrame frame;

GridBagConstraints layoutConstraint;
GridBagConstraints positionConstraint;

public void palBagLayout(){

    String nameToCheck = "bob";

    nameToCheckLabel = new JLabel("Check this name:");
    palCheckLabel = new JLabel("Name in reverse");

    nameToCheckField = new JTextField(15);
    nameToCheckField.setEditable(true);
    nameToCheckField.setText(nameToCheck);

    palCheckField = new JTextField(15);
    palCheckField.setEditable(false);

    frame = new JFrame("Palindrome Checker");

    frame.setLayout(new GridBagLayout());

    layoutConstraint = new GridBagConstraints();

    layoutConstraint.gridx = 0;
    layoutConstraint.gridy = 0;

    layoutConstraint.insets = new Insets(10, 10, 10, 10);

    frame.add(nameToCheckLabel, layoutConstraint);

    layoutConstraint = new GridBagConstraints();
    layoutConstraint.gridx = 1;
    layoutConstraint.gridy = 0;
    layoutConstraint.insets = new Insets(10, 10, 10, 10);
    frame.add(nameToCheckField, layoutConstraint);

    layoutConstraint = new GridBagConstraints();
    layoutConstraint.gridx = 1;
    layoutConstraint.gridy = 0;
    layoutConstraint.insets = new java.awt.Insets(10, 10, 10, 10);
    frame.add(palCheckLabel, layoutConstraint);

    layoutConstraint = new GridBagConstraints();
    layoutConstraint.gridx = 1;
    layoutConstraint.gridy = 0;
    layoutConstraint.insets = new java.awt.Insets(10, 10, 10, 10);
    frame.add(palCheckField, layoutConstraint);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.pack();

    frame.setVisible(true);
}

PalindromeCheckerGUI2()    {

setTitle("Palindrome Checker");

nameToCheckLabel = new JLabel("Check this name:");
palCheckLabel = new JLabel("Name in reverse");

nameToCheckField = new JTextField(15);
nameToCheckField.setEditable(true);
nameToCheckField.setText("Enter here!");

palCheckField = new JTextField(15);
palCheckField.setEditable(false);

checkButton = new JButton("Check!");
checkButton.addActionListener(this);

palCheckField = new JTextField(15);
palCheckField.setEditable(false);

setLayout(new GridBagLayout());
positionConstraint = new GridBagConstraints();

positionConstraint.gridx = 0;
positionConstraint.gridy = 0;
positionConstraint.insets = new Insets(10, 10, 10, 10);

add(nameToCheckLabel, positionConstraint);

positionConstraint.gridx = 1;
positionConstraint.gridy = 0;
positionConstraint.insets = new Insets(10, 10, 10, 10);
add(nameToCheckField, positionConstraint);

positionConstraint.gridx = 0;
positionConstraint.gridy = 1;
positionConstraint.insets = new Insets(10, 10, 10, 10);
add(palCheckLabel, positionConstraint);

positionConstraint.gridx = 1;
positionConstraint.gridy = 1;
positionConstraint.insets = new Insets(10, 10, 10, 10);
add(palCheckField, positionConstraint);

positionConstraint.gridx = 0;
positionConstraint.gridy = 2;
positionConstraint.insets = new Insets(10, 10, 10, 10);
add(checkButton, positionConstraint);
}

@Override
public void actionPerformed(ActionEvent event){
    StringBuilder userInput = new StringBuilder(nameToCheckField.getText().toString());
    StringBuilder palString = new StringBuilder(userInput);

    palString = userInput.reverse();

    palCheckField.setText(palString.toString());;

    if(backwardsString.toString().equals(userInput.reverse().toString()))   {

        JOptionPane.showMessageDialog(this, "This is a palindrome!");

    }   else    {

        JOptionPane.showMessageDialog(this, "This is NOT a palindrome!");

    } // end of else
} // End of actionPerformed

public static void main(String[] args) {
    PalindromeCheckerGUI2 test = new PalindromeCheckerGUI2();

    test.palBagLayout();
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    test.pack();
    test.setVisible(true);
    }
}