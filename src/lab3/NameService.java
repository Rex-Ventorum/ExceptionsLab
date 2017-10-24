package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    private int maxNameLength;

    public NameService(){
        maxNameLength = 15;
    }
    
    public int getMaxNameLength() {
        return maxNameLength;
    }

    public void setMaxNameLength(int maxNameLength) {
        if(maxNameLength < 0) throw new IllegalArgumentException("You may not have a negtive Max Length");
        this.maxNameLength = maxNameLength;
    }
    
    public String extractLastName(String fullName) throws IllegalArgumentException,MaximumLengthException{
        String lastName = null;
        
        if(fullName == null || !fullName.matches("[a-zA-Z0-9]+ [a-zA-Z0-9]+")){
            throw new IllegalArgumentException("Full name must be two words seperacted by a space charcater!");
        }
               
        lastName = fullName.split(" ")[1];
        if(lastName.length() > maxNameLength){
            throw new MaximumLengthException();
        }
        
        return lastName;
    }
    
}
