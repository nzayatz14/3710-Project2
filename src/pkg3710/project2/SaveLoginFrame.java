/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3710.project2;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author greyson233
 */
public class SaveLoginFrame extends javax.swing.JFrame {
    Game game;
    /**
     * Creates new form LoginFrame
     */
    public SaveLoginFrame() {
        initComponents();
    }
    
    public SaveLoginFrame(Game g){
        game = g;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                                                    
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        txtUsername = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        buttonEnter = new javax.swing.JButton();
        newUserButton = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        labelUsername.setText("Username:");

        labelPassword.setText("Password:");

        txtPassword.setText("jPasswordField1");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        buttonEnter.setText("Save Game");
        buttonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnterActionPerformed(evt);
            }
        });

        newUserButton.setText("Create New User");
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEnter)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPassword)
                        .addComponent(txtUsername)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newUserButton)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUserButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                                                

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // take no action here
    }                                           

    @SuppressWarnings("empty-statement")
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // take no action here
    }                                           

    /*
    This fuction will read in a username and passowrd, verify both, and save a game to a user's file if it exists. User will enter thier username and password. The funciton will read in both and verify that the username is valid by chekcing with a list of all usernames taht havce been created. If username is not valid, an error will be displayed. If valid, the funciton will open their file "username".txt and verify that the password is correct. If not correct, an error will be displayed and the apssword field will be cleared for them ot reenter in taht password. If correct, the function will save their game info to thier accoutn (accoutn balance, correct guesses, total guesses, last level palyed). If the user click's "create new username" they will be directed to hte CreateNewUserFrame to create a new usernaem and password. 
    */
    private void buttonEnterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
        String username = txtUsername.getText();
        char[] pass = txtPassword.getPassword();
        Component ErrorFrame = null;
        Boolean userExists = false;
        BufferedWriter bw = null;

        //intialize variables
        String fileName = username + ".txt";
        String fileUsername = "";
        String filePassword = "";
        
        //get player's game info & set to variables
        Game g = new Game();
        double balance = g.getPlayer().getBalance();
        int level = g.getLevel();
        int correct = g.getCorrect();
        int guesses = g.getGuesses();
        //double winpercent = g.calculateWinPercentage();
        
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
        
        //if found, do the following
        if (userExists==true){
            //get password stored in the player's file
            //try, catch; save the file details
            try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            fileUsername = br.readLine();
            filePassword = br.readLine();
            br.close();
            }catch(Exception ex){
                //System.out.println( "Text File Written To file" );
            }

            //JOptionPane.showMessageDialog(ErrorFrame, filePassword, "Error", JOptionPane.ERROR_MESSAGE);
            String password = String.valueOf(pass);

            if(!password.equals(filePassword)){
                //txtPassword.setText("Correct login!");
                JOptionPane.showMessageDialog(ErrorFrame, "ERROR! Your passwords do not match, please try again", "Error", JOptionPane.ERROR_MESSAGE);
                //System.out.println("ERROR! Password is not correct. Please try again.");

                //clear the text box
                txtPassword.setText("");
                txtPassword.requestFocus();
            }
            else if (password.equals(filePassword)){
                //ask if user wants to continue from this last state or start a new game
                JOptionPane.showMessageDialog(null, "Passwords match!");

                //!!!save session data (amount of money in account, score)
                try{
                    //this will overwrite whatever is the file so the new game info will be saved over the old game info
                    bw = new BufferedWriter(new FileWriter(fileName));
                        //save username & password
                    bw.write(fileUsername);
                    bw.newLine();
                    bw.write(filePassword);
                    bw.newLine();
                
                        //save the game's info
                    bw.write((int) balance);
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
                
                //?connecct to appropriate screen
                    // close the game???
            }
        }
        //else, (username not found) display an error
        else{
                JOptionPane.showMessageDialog(ErrorFrame, "ERROR! The username you entered does not exist. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                //clear the text box
                txtPassword.setText("");
                txtUsername.setText("");
                txtUsername.requestFocus();
        }
    }                                           

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:

        //click create new user button, go to new page
        new CreateNewUser().setVisible(true);
        this.setVisible(false);
        this.dispose();

        /*
        //click create new user button, go to CreateNewUser.java page
        SaveLoginFrame.java = CreateNewUser.java;
        CreateNewUser.java.setVisible(true);
        SaveLoginFrame.this.setVisible(false);
        */
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaveLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                                          
    private javax.swing.JButton buttonEnter;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration                                      
}
