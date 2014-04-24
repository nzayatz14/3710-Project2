/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3710.project2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author greyson233
 */
public class LoginSupport {
    BufferedReader br;
    BufferedWriter bw;
    String fileName;
    String fileUsername;
    String filePassword;
    String balance;
    String level;
    String correct;
    String guesses;
    Boolean userExists;
        
    //constructor
    public LoginSupport() {
        br = null;
        bw = null;
        fileName = "";
        fileUsername = "";
        filePassword = "";
        balance = "";
        level = "";
        correct = "";
        guesses = "";
        userExists = false;
    }
    
    /*
    This function takes the player's username as a string parameter and it 
    checks to see if that username exists in the file "users.txt" (checks to 
    see if this username has already been created or used). It opens the file
    "users.txt" and reads each line. If the username is found it returns true.
    If the passed username is not found the functin returns false.
    */
    public Boolean userExists(String username) {
        //see if username exists
        File file = new File("users.txt");
            //try catch in case the file does not exist
        Scanner in = null;
            try {
                in = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoadLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        //read the file, if the username is in the file, continue    
        while (userExists==false && in.hasNextLine())
        {
          String line = in.nextLine();
          if(line.equals(username)){
              userExists=true;
          }
        }
        
        return userExists;
    }
    
    /*
    This function takes the player's username as a string parameter and it 
    returns the password associated with this username. Using buffered reader, 
    this function opens the file associated with the passed username, which is
    user.txt, and reads in the username and password stored in this file. It 
    returns the password stored in this file.
    */
    public String getPassword(String username) {
        //get password stored in the player's file
        fileName = username + ".txt";
        
        //try, catch; save the file details
        try{
            br = new BufferedReader(new FileReader(fileName));
            fileUsername = br.readLine();
            filePassword = br.readLine();
            br.close();
        }catch(Exception ex){
            //System.out.println( "Text File Written To file" );
        }
        
        return filePassword;
    }
    
    /*
    This function takes a few different parameters (all strings) and writes 
    these passed items to a file, "user.txt". The parameters are the player's 
    filename (which is just user.txt), username, password, and game data 
    (balance, level, correct guesses, and total guesses). This function opens 
    the file "fileName" (whether it exists or not) and writes the following 
    items to that file (or overwrites what is existing in the file): username, 
    password, balance, level, correct guesses, and total guesses. Each item
    is separated on a new line. This function returns nothing. 
    */
    public void writeToFile(String fileName, String fileUsername, String filePassword, String balance, String level, String correct, String guesses) {
        //save session data (amount of money in account, score, level)
        //this will overwrite whatever is the file so the new game info will be saved over the old game info
        try{
            bw = new BufferedWriter(new FileWriter(fileName));
                //save username & password
            bw.write(fileUsername);
                bw.newLine();
            bw.write(filePassword);
                bw.newLine();

            //save the game's info
            bw.write(balance);
                bw.newLine();
            bw.write(level);
                bw.newLine();
            bw.write(correct);
                bw.newLine();
            bw.write(guesses);
                bw.newLine();
            bw.close();
        } catch (Exception ex){

        }
    }
    
}
