/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author L117student
 */
public class EmployeeTest {
    
    private Employee e;
    
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
        e = new Employee();
    }
    
    @After
    public void tearDown() {
        
    }

    @Test(expected = IllegalArgumentException.class)
    public void firstNameNullShouldThrowException(){
        e.setFirstName(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void firstNameEmptyStringShouldThrowException(){
        e.setFirstName("");
    }
    
    @Test
    public void firstNameValidShouldBeAllowed(){
        String[] validNames = {
            "Bob", "Boooooooobbbbbbbbbbbbbbyyyyyyyyy", "B", "1234","54","B O B",
            "BOB!", "BoB"
        };
        String failValue = null;
        try{
            for(String testMe : validNames){
                failValue = testMe;
                e.setFirstName(testMe);
            }
        }catch(Exception ex){
            fail("Illegal Value: " + failValue);
        }
    }
    
    @Test
    public void firstNameLengthShouldBeEven(){
        e.setFirstName("Pete");
        assertTrue(e.isFirstNameEvenLength());
    }
    
    @Test
    public void firstNameLengthFalseIfUneven(){
        e.setFirstName("Bob");
        assertFalse(e.isFirstNameEvenLength());
    }
}
