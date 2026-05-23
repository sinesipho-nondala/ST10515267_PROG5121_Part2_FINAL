/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;

/**This class will contain:
 * All your validation methods
 * Your registration logic
 * Your login logic
 * @author Student
 */
public class Login {
    String username;
    String password;
    String phoneNumber;
    
    // This is used to check the useraname
    public boolean checkUserName(String username){
        return username.contains("_")&& username.length()<=5;
    }
        // This is used to check the password
        public boolean checkPasswordComplexity(String password){
           // Assume nothing is correct yet, hence we say "false"
            boolean hasCapital = false;
            boolean hasNumber = false;
            boolean hasSpecial = false;
            // Go through every single letter in the password,one by one
            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);
                //if your character is Uppercase than it is correct
                if (Character.isUpperCase(c)){
                    hasCapital = true;
                } else if (Character.isDigit(c)){
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(c)){//Password has special character or number
                    hasSpecial = true;
                }
            }
            return password.length()>=8 && hasCapital && hasNumber && hasSpecial;//If your password meets all the rules than it will return.
        
    }
        public boolean checkCellPhoneNumber(String phone){
            return phone.startsWith("+27") && phone.length() <= 12;
        }
    //return the username and password if incorrect
    public boolean  loginUser(String username, String password){
    return this.username.equals(username) && this.password.equals(password);
    }
    public String returnLoginStatus(boolean success){
    if (success) {
     return "Welcome"  + username + "it is great to see you again." ; 
    } else {
        return "Username or passsword incorrect, please try again.";
    }  
    
    }
    public String registerUser(String username,String password,String phoneNumber){
        
    if (!checkUserName(username)){
        return "Username is not formatted; please ensure that your username contains an underscore and is no more than five characters in length";}
    
    if (!checkPasswordComplexity(password)){
        return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
    }
    if (!checkCellPhoneNumber(phoneNumber)){
        return "Cell phone number incorrectly formatted or does not contain international code.";
    }
    this.username = username;
    this.password = password;
    this.phoneNumber = phoneNumber;
    return "User registered successfully.";
    }
}
    
