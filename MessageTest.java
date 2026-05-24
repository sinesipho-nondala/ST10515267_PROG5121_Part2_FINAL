package com.mycompany.chatapppart1;
import org.junit.Test;
import static  org.junit.Assert*;
public class MessageTest{

@Test 
 public void testMessageIdUnique(){
 Message m1 = new
 Message("0821234567","Hello World");
  Message m2 = new
Message("0821234567","Hello Again");
 assertNotEquals(m1.getMessage(),m2.getMessage());
 
@Test
 public void testHashIsGenerated(){
  Message m = new
Message("0839998877","Test Message");
 assertNotNull(m.getHash());
 assertFalse(m.getHash().isEmpty());
}

@Test
public void testRecipientCorrect(){
 String num = "0841112233";
 Message m = new Message(num,"Hi there");
  assertEquals(num,m.getRecipient());
}
@Test
public void testMessageTextCorrect(){
  String text = "This is a test";
  Message m = new
Message("0855556666",text);
 assertEquals(text,my.getMessageText());
  }
}


