package com.mycompany.chatapppart1;
import org.junit.test;
import static org.junit.Assert*;
public class LoginTest{
 private Login login = new Login();
 @Test
 public void testValidUsername(){
  assertTrue(login.validateUsername("User123"));
}

@Test
 public void testInvalidUsernameTooShort(){
  assertFalse(login.validateUsername("Usr"));
}

@Test
 public void testValidPassword(){
  assertTrue(login.validatePassword("Pass@123"));
}

@Test
 public void testInvalidPasswordNoSpecialChar(){
  assertFalse(login.validatePassword("Pass@123"));
}

@Test
 public void testRegistrationSuccess(){
 assertTrue(login.register("JohnDoe","Secure@123","0821234567"));
}
@Test
public void testLoginSuccess(){
 login.register("Alice","Alice@456","0831112222");
 assertTrue(login.loginUser("Alice","Alice@456")):
}
@Test

public void testLoginFailWrongPassword(){
 login.register("Bob","Bob@789","0845556666");
 assertFalse(login.loginUser("Bob","WrongPass"));
}
}