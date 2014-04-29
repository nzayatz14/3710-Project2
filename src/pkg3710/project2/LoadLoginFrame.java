/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg3710.project2;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.*;

/**
 *
 * @author greyson233
 */
public class LoadLoginFrame extends javax.swing.JFrame {
    Game g;
    JFrame frame;
    LoginSupport ls;
    /**
     * Creates new form LoginFrame
     */
    public LoadLoginFrame() {
        frame = new JFrame();
        frame.setVisible(false);
        ls = new LoginSupport();
        initComponents();
    }

    public LoadLoginFrame(JFrame j){
        frame = j;
        ls = new LoginSupport();
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

        this.addWindowListener(new WindowEventHandler());
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        buttonEnter.setText("Load Game");
        buttonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnterActionPerformed(evt);
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
                .addContainerGap(79, Short.MAX_VALUE))
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
    This fuction will read in a username and passowrd, verify both, and load a 
    game to a previously played state. User will enter thier username and 
    password. The funciton will read in both and verify that the username is 
    valid by chekcing with a list of all usernames taht havce been created. If 
    not valid, an error will be displayed. If valid, the funciton will open 
    their file "username".txt and verify that the password is correct. If not 
    correct, an error will be displayed and the apssword field will be cleared 
    for them ot reenter in taht password. If correct, the function will search 
    their file and load their previosuly saved info (accoutn balance, correct 
    guesses, total guesses, last level palyed). This info will be passed to 
    NewJFrame to contineu the game. 
    */
    private void buttonEnterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //intialize variables 
        String username = txtUsername.getText();
        char[] pass = txtPassword.getPassword();
        String password = String.valueOf(pass);
        
        Component ErrorFrame = null;
        Boolean userExists = false;
        BufferedReader br = null;

        String fileName = username + ".txt";
        String fileUsername = "";
        String filePassword = "";
                
        String balance = "";
        String level = "";
        String correct = "";
        String guesses = "";
        
        //check if username exists, call support function
        userExists = ls.userExists(username);
        
        //if found, do the following
        if (userExists==true){
            //get the password from the user's file
            filePassword = ls.getPassword(username);
            
            if(!password.equals(filePassword)){
                JOptionPane.showMessageDialog(ErrorFrame, "ERROR! Your passwords do not match, please try again", "Error", JOptionPane.ERROR_MESSAGE);

                //clear the text box
                txtPassword.setText("");
                txtPassword.requestFocus();
            }
            else if (password.equals(filePassword)){
                //JOptionPane.showMessageDialog(null, "Passwords match!");
                
                //read info from file and save to variables     
                try {
                    br = new BufferedReader(new FileReader(fileName));
                    fileUsername = br.readLine();
                    filePassword = br.readLine();
                    balance = br.readLine();
                    level = br.readLine();
                    correct = br.readLine();
                    guesses = br.readLine();
                    br.close();
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LoadLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LoadLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                } 
                
                //convert balance from a string to a double by parsing it
                double balance2;
                try {
                    balance2 = Double.parseDouble(balance);
                } catch (Exception ex) {
                    balance2 = -1.0;
                }
                
                //convert level from a string to an integer by parsing it
                int level2;
                try {
                    level2 = Integer.parseInt(level);
                } catch (Exception ex) {
                    level2 = -1;
                }
                
                //convert correct guesses from a string to an integer by parsing it
                int correct2;
                try {
                    correct2 = Integer.parseInt(correct);
                } catch (Exception ex) {
                    correct2 = -1;
                }
                
                //convert total guesses from a string to an integer by parsing it
                int guesses2;
                try {
                    guesses2 = Integer.parseInt(guesses);
                } catch (Exception ex) {
                    guesses2 = -1;
                }
                
                //pass this info to the appropriate class
                g = new Game(correct2, guesses2, level2, balance2);
                                    
                //connect to appropriate screen
                frame.setVisible(false);
                frame.dispose();
                new CupGame(g).setVisible(true);
                this.setVisible(false);
                this.dispose();
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

    class WindowEventHandler extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            //new NewJFrame().setVisible(true);
        }

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
            java.util.logging.Logger.getLogger(LoadLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                                          
    private javax.swing.JButton buttonEnter;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration                                      
}
