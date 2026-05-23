/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.chatapppart1.Login;
/**
 *
 * 
 * @author Student
 */
public class LoginTest {
    public LoginTest(){
    }
    @Test
    
            public void testCheckUserNameCorrect(){// This will check if the username is correct.The results wont show in LoginTest.
    Login login = new Login();
    boolean result = login.checkUserName("ab_1");//Before the user can login the system will check whether the username follows the rules.
    assertTrue(result);//It will return the correct result 
    }
        @Test 
        public void testCheckUserNameIncorrect(){ //If the username does not follow the rules than the result will be false.
            Login login = new Login();
            boolean result = login.checkUserName("abc_123");
            assertFalse(result);//It will return the incorrect result
        }
        @Test
        public void testCheckPasswordCorrect(){//This will check the password if its correct or true
            Login login = new Login();// Making something that follows the Login rules.
            boolean result =
                    login.checkPasswordComplexity("Password#1");//type in the password
            assertTrue(result);//the results will show that its correct
            
        }
        @Test
        public void testCheckPasswordIncorrect(){// This will see if the input is incorrect
            Login login = new Login();
            boolean result = login.checkPasswordComplexity("pass");// Type in the password
            assertFalse(result);// The password is incorrect
                    
        }
        @Test
        public void testCheckPhoneNumberCorrect(){ //This will check whether the password is correct or follows the set rules.
           Login login = new Login();
           boolean result = login.checkCellPhoneNumber("27812345678");//Type in your cellphone number 
           assertTrue(result);//The cellphone number is correct
                   
        }
        @Test
        public void testCheckPhoneNumberIncorrect(){//Checks if the cellphone number is incorrect
            Login login = new Login();
            boolean result = login.checkCellPhoneNumber("0812345678");//Type in the cellphone number
            assertFalse(result);//The cellphone number is incorrect
        }
}

