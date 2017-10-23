package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        String msg = "";
        try{
            lastName = nameService.extractLastName(fullName);
            msg = "Your last name is: " + lastName;
        }catch(IllegalArgumentException iae){
            msg = iae.getMessage();
        }
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
