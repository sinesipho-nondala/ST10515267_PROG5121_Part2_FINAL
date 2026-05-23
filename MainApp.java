/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;//Package name may differ depending on your NetBeans setup

/**The class will:
 * Ask the user for input
 * Display messages to the user
 * Call the methods inside Login
 * @author Student
 */

import java.util.Scanner;
    
    public class MainApp{
        public static void main(String[] args)  {
            
            // Scanner allows the user to enter information
            Scanner input = new Scanner(System.in);
            
            // Create an object of the login class so we can call its methods
            Login login = new Login ();
            // --- REGISTRATION SECTION ---
       System.out.println("===USER REGISTRATION===");
       
       System.out.print("Enter a username: ");
       String username = input.nextLine();
       
       System.out.print("Enter a password: ");
       String password = input.nextLine();
       
       System.out.print("Enter your South African phone number (+27...): ");
       String phone = input.nextLine();
       
       // Call the registration method and store the message it returns
       String response = login.registerUser(username, password, phone);
       
       // Show the registration message 
       System.out.println(response);
       
       //---LOGIN SECTION---
       System.out.println("\n===USER LOGIN===");
       
       System.out.print("enter your username: ");
       String loginUsername = input.nextLine();
       
       System.out.print("Enter your password: ");
       String loginPassword = input.nextLine();
       
       // Call loginUser to check if details match the stored ones
       boolean loggedIn = login.loginUser(loginUsername, loginPassword);
      
       // Print out the correct login message
       String loginMessage = login.returnLoginStatus(loggedIn);
       System.out.println(loginMessage);
        
        //PART 2
        int messageCounter = 1;//Message number from loop counter
        boolean appRuning = true;
        while(appRuning){//MAIN APP LOOP
        System.out.println("\n=====MAIN MENU=====");
        System.out.println("1.Send New Message");
        System.out.println("2. View All Sent Messages");
        System.out.println("3. Total Message Sent");
        System.out.println("4. Logout");
        System.out.println("Enter choice");
        int menuChoice = input.nextInt();
        input.nextLine();
        switch (menuChoice){
            case 1:
        //FOR LOOP: Send multiple messages
        System.out.println("How many messages do you want to send?");
        int numOfMessages = input.nextInt();
        input.nextLine();
        for (int i = 0; i< numOfMessages;i++){//FOR LOOP
        System.out.println("\n--- MESSAGE" + messageCounter + "---");
        //get inputs
        System.out.print("Recipient number (+_[code][number]):");
        String recipient = input.nextLine();
        System.out.println("Message text (max 250 chars):");
        String text = input.nextLine();
        if (text.length()>250){
        text = text.substring(0,250);//Enter maximum length
        System.out.println("Text trimmed to 250 characters.");
        
    }
        //CREATE MESSAGE OBJECT
        Message newMsg = new Message(messageCounter, recipient,text);
        //Validate (call required methods)
        System.out.println("ID Valid:" + newMsg.checkMessageID());
        System.out.println("Recipient:" + newMsg .checkRecipientCell());
        System.out.println("Hash Generated:" + newMsg.createMessageHash());
        //Choose status: send / store/desregarded
        System.out.println("Action:[1=Send,2=Store(JSON),3=Disregarded:");
        int action = input.nextInt();
        input.nextLine();
        if (action==1){
        newMsg.setSentStatus("Sent");
        System.out.println("Message Sent!");
    } else if (action == 2){
        newMsg.storeMessage();//Call Method 7- JSON
        System.out.println("Message Stored as JSON");
    }else{
        newMsg.setSentStatus("Disregarded");
        System.out.println("Message Disregarded");
        
    }
        //DISPLAY FULL DETAILS
        newMsg.displayFullDetails();
        messageCounter++; //Increment counter
    
    }break;
            case 2:
        //Call printMessage()
        System.out.println(Message.printMessages());
        break;
            case 3:
        //Calll returnTotalMessage()
        int total = Message.returnTotalMessage();
        System.out.println("Total messages sent this session:" + total);
        break;
            case 4:
        appRuning = false;
        System.out.println("Invalid selection. Try again");
        }
    
        
        
      
        
    }
        input.close();
    }
       
    }
    
