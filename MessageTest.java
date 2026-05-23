/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.mycompany.chatapppart1.Message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;



/**
 *
 * @author Student
 */
public class MessageTest {
    
    @Test
    public void testMessageLengthValid(){
    Message msg = new Message(1,"+27821234567","Test message");
    // ID is always 10 digits - should return TRUE
    assertTrue(msg.checkMessageID());
    }
    
//TEST 2: checkRecipientCell()
    @Test
    public void testCheckRecipientCell(){
        Message validMsg = new Message(2,"+27821234567", "Valid number" );
      Message invalidMsg = new Message(3,"0821234567","No country code");  
      assertEquals("SUCCESS: Valid international number", validMsg.checkRecipientCell());
      assertEquals("FAIlURE:Invalid format - use + [code][number]",invalidMsg.checkRecipientCell());
    }
    //TEST 3: checkHash()
    @Test
    public void testCreateMessageHash(){
        Message msg = new Message(4,"+27821234567","Hello World");
        String hash =msg.createMessageHash();
        assertNotNull(hash);
        assertTrue(hash.contains("-HASH"));
        assertEquals(hash,msg.getMessageHash());
        
        
    }
    //TEST 4: 
    @Test
    public void testSentMessage(){
        Message msg = new Message(5,"+27821234567","Test status");
        assertEquals("Disregarded", msg.sentMessage());//Default status
        msg.setSentStatus("Sent");
        assertEquals("Sent",msg.sentMessage());//after change
        
            
        
    }
    //TEST 5:
    @Test
    public void testPrintMessage(){
        new Message(6,"+27821111111","First test message");
        new Message(7,"+27822222222","Second test message");
        String output = Message.printMessages();
        assertTrue(output.contains("Msg#6"));
        assertTrue(output.contains("Msg#7"));
        
    }
    //TEST 6:
    @Test
    public void testReturnTotalMessages(){
     int before = Message.returnTotalMessage();
     new Message(8,"27823333333","Count test message");
     int after = Message.returnTotalMessage();
     assertEquals(before + 1,after);
    }
    //TEST 7:
    @Test public void testStoreMessage(){
        //Create test message
        Message msg = new Message(9,"+27824444444","Test JSON save");
        //Call the method we are testing
        msg.storeMessage();
        //Check if file was created
        File jsonFile = new File("message_9.json");
        assertTrue(jsonFile.exists(),"JSON file was NOT created!" );
       
        //Clean up test file
        if (jsonFile.exists()){
            jsonFile.delete();
        }
    }
    
    }
    

    
    