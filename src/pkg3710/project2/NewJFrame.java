/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3710.project2;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
 *
 * @author nzayatz14
 */
public class NewJFrame extends javax.swing.JFrame {
    Game game = new Game();
    //private JFrameSupport support = new JFrameSupport();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {

        initComponents();
        this.getContentPane().setBackground(Color.white);
        btnCup1.setEnabled(false);
        btnCup2.setEnabled(false);
        btnCup3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ball1 = new javax.swing.JLabel();
        Cup1 = new javax.swing.JLabel();
        Cup2 = new javax.swing.JLabel();
        Cup3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        btnCup1 = new javax.swing.JButton();
        btnCup3 = new javax.swing.JButton();
        btnCup2 = new javax.swing.JButton();
        PlaceBet = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        WinPercentage = new javax.swing.JLabel();
        MoneyLeft = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLoad = new javax.swing.JMenuItem();
        mnuSave = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cup Game Bruh");

        Ball1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg3710/project2/ball.png"))); // NOI18N

        Cup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg3710/project2/imgres.jpg"))); // NOI18N
        Cup1.setText("1");

        Cup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg3710/project2/imgres.jpg"))); // NOI18N
        Cup2.setText("2");

        Cup3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg3710/project2/imgres.jpg"))); // NOI18N
        Cup3.setText("3");

        jButton1.setText("Go!");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        btnCup1.setText("Cup 1");
        btnCup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCup1ActionPerformed(evt);
            }
        });

        btnCup3.setText("Cup 3");
        btnCup3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCup3ActionPerformed(evt);
            }
        });

        btnCup2.setText("Cup 2");
        btnCup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCup2ActionPerformed(evt);
            }
        });

        PlaceBet.setText("Place Bet:");

        Level.setText("Level:");

        WinPercentage.setText("Win Percentage:");

        MoneyLeft.setText("Money Left:");

        jMenu1.setText("File");

        mnuLoad.setText("Load");
        mnuLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLoadActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLoad);

        mnuSave.setText("Save");
        mnuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSave);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.META_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(124, 124, 124)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(WinPercentage)
                            .add(Level)
                            .add(MoneyLeft)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(106, 106, 106)
                        .add(Cup1)))
                .add(18, 18, 18)
                .add(Cup2)
                .add(18, 18, 18)
                .add(Cup3)
                .addContainerGap(100, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Ball1)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .add(btnCup1)
                            .add(154, 154, 154)
                            .add(btnCup2)
                            .add(173, 173, 173)
                            .add(btnCup3)
                            .add(157, 157, 157))
                        .add(layout.createSequentialGroup()
                            .add(243, 243, 243)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(layout.createSequentialGroup()
                                    .add(PlaceBet)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(txtAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(357, 357, 357)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(43, 43, 43)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(Cup2)
                        .add(Cup3))
                    .add(Cup1))
                .add(32, 32, 32)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnCup1)
                    .add(btnCup2)
                    .add(btnCup3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Ball1)
                .add(49, 49, 49)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(PlaceBet, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .add(25, 25, 25)
                .add(MoneyLeft)
                .add(18, 18, 18)
                .add(Level)
                .add(18, 18, 18)
                .add(WinPercentage)
                .add(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        Ball1.setVisible(true);
        Random r = new Random();
        final int place = r.nextInt(3);
        //int swaps[] = game.runRound(place);
        
        final int x;
        if(place == 0)
                x = btnCup1.getX();
        else if (place == 1)
                x = btnCup2.getX();
        else
                x = btnCup3.getX();;
        
        Ball1.setLocation(x,btnCup1.getY()+20);
        
        int swaps[] = game.runRound(place);
        swapGraphics(swaps,0);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed

    }//GEN-LAST:event_txtAmountActionPerformed

    private void mnuLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLoadActionPerformed
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_mnuLoadActionPerformed

    private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuSaveActionPerformed

    private void btnCup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCup1ActionPerformed
        btnCup1.setEnabled(false);
        btnCup2.setEnabled(false);
        btnCup3.setEnabled(false);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_btnCup1ActionPerformed

    private void btnCup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCup2ActionPerformed
        btnCup1.setEnabled(false);
        btnCup2.setEnabled(false);
        btnCup3.setEnabled(false);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_btnCup2ActionPerformed

    private void btnCup3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCup3ActionPerformed
        btnCup1.setEnabled(false);
        btnCup2.setEnabled(false);
        btnCup3.setEnabled(false);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_btnCup3ActionPerformed

    public void swap1and2(int cupNumber1, int cupNumber2, int sw[], int s) {
        Timer time = new Timer();
        final int Cup1X = Cup1.getX();
        final int Cup3X = Cup3.getX();
        final int Cup2X = Cup2.getX();
        final int cupNum1 = cupNumber1;
        final int cupNum2 = cupNumber2;
        final int swa[] = sw;
        final int d = s;

        time.schedule(new TimerTask() {
            @Override
            public void run() {
                if (cupNum1 == 1 && cupNum2 == 2) {
                    if (Cup1.getX() > Cup2X) {
                        Cup1.setLocation(Cup1.getX() - 1, JFrameSupport.curve2to1(Cup1.getX() - 1));
                        Cup2.setLocation(Cup2.getX() + 1, JFrameSupport.curve1to2(Cup2.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 1 && cupNum2 == 3) {
                    if (Cup1.getX() > Cup3X) {
                        Cup1.setLocation(Cup1.getX() - 1, JFrameSupport.curve2to1(Cup1.getX() - 1));
                        Cup3.setLocation(Cup3.getX() + 1, JFrameSupport.curve1to2(Cup3.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 2 && cupNum2 == 3) {
                    if (Cup2.getX() > Cup3X) {
                        Cup2.setLocation(Cup2.getX() - 1, JFrameSupport.curve2to1(Cup2.getX() - 1));
                        Cup3.setLocation(Cup3.getX() + 1, JFrameSupport.curve1to2(Cup3.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 2 && cupNum2 == 1) {
                    if (Cup2.getX() > Cup1X) {
                        Cup2.setLocation(Cup2.getX() - 1, JFrameSupport.curve2to1(Cup2.getX() - 1));
                        Cup1.setLocation(Cup1.getX() + 1, JFrameSupport.curve1to2(Cup1.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 3 && cupNum2 == 1) {
                    if (Cup3.getX() > Cup1X) {
                        Cup3.setLocation(Cup3.getX() - 1, JFrameSupport.curve2to1(Cup3.getX() - 1));
                        Cup1.setLocation(Cup1.getX() + 1, JFrameSupport.curve1to2(Cup1.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 3 && cupNum2 == 2) {
                    if (Cup3.getX() > Cup2X) {
                        Cup3.setLocation(Cup3.getX() - 1, JFrameSupport.curve2to1(Cup3.getX() - 1));
                        Cup2.setLocation(Cup2.getX() + 1, JFrameSupport.curve1to2(Cup2.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                }

            }
        }, 0, 1);
        
    }

    public void swap1and3(int cupNumber1, int cupNumber2, int sw[], int s) {
        Timer time = new Timer();
        final int Cup1X = Cup1.getX();
        final int Cup3X = Cup3.getX();
        final int Cup2X = Cup2.getX();
        final int cupNum1 = cupNumber1;
        final int cupNum2 = cupNumber2;
        final int swa[] = sw;
        final int d = s;

        time.schedule(new TimerTask() {
            @Override
            public void run() {
                if (cupNum1 == 1 && cupNum2 == 2) {
                    if (Cup1.getX() > Cup2X) {
                        Cup1.setLocation(Cup1.getX() - 1, JFrameSupport.curve3to1(Cup1.getX() - 1));
                        Cup2.setLocation(Cup2.getX() + 1, JFrameSupport.curve1to3(Cup2.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 1 && cupNum2 == 3) {
                    if (Cup1.getX() > Cup3X) {
                        Cup1.setLocation(Cup1.getX() - 1, JFrameSupport.curve3to1(Cup1.getX() - 1));
                        Cup3.setLocation(Cup3.getX() + 1, JFrameSupport.curve1to3(Cup3.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 2 && cupNum2 == 3) {
                    if (Cup2.getX() > Cup3X) {
                        Cup2.setLocation(Cup2.getX() - 1, JFrameSupport.curve3to1(Cup2.getX() - 1));
                        Cup3.setLocation(Cup3.getX() + 1, JFrameSupport.curve1to3(Cup3.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 2 && cupNum2 == 1) {
                    if (Cup2.getX() > Cup1X) {
                        Cup2.setLocation(Cup2.getX() - 1, JFrameSupport.curve3to1(Cup2.getX() - 1));
                        Cup1.setLocation(Cup1.getX() + 1, JFrameSupport.curve1to3(Cup1.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 3 && cupNum2 == 1) {
                    if (Cup3.getX() > Cup1X) {
                        Cup3.setLocation(Cup3.getX() - 1, JFrameSupport.curve3to1(Cup3.getX() - 1));
                        Cup1.setLocation(Cup1.getX() + 1, JFrameSupport.curve1to3(Cup1.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 3 && cupNum2 == 2) {
                    if (Cup3.getX() > Cup2X) {
                        Cup3.setLocation(Cup3.getX() - 1, JFrameSupport.curve3to1(Cup3.getX() - 1));
                        Cup2.setLocation(Cup2.getX() + 1, JFrameSupport.curve1to3(Cup2.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                }

            }
        }, 0, 1);
    }

    public void swap2and3(int cupNumber1, int cupNumber2, int sw[], int s) {
        Timer time = new Timer();
        final int Cup1X = Cup1.getX();
        final int Cup3X = Cup3.getX();
        final int Cup2X = Cup2.getX();
        final int cupNum1 = cupNumber1;
        final int cupNum2 = cupNumber2;
        final int swa[] = sw;
        final int d = s;

        time.schedule(new TimerTask() {
            @Override
            public void run() {
                if (cupNum1 == 1 && cupNum2 == 2) {
                    if (Cup1.getX() > Cup2X) {
                        Cup1.setLocation(Cup1.getX() - 1, JFrameSupport.curve3to2(Cup1.getX() - 1));
                        Cup2.setLocation(Cup2.getX() + 1, JFrameSupport.curve2to3(Cup2.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 1 && cupNum2 == 3) {
                    if (Cup1.getX() > Cup3X) {
                        Cup1.setLocation(Cup1.getX() - 1, JFrameSupport.curve3to2(Cup1.getX() - 1));
                        Cup3.setLocation(Cup3.getX() + 1, JFrameSupport.curve2to3(Cup3.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 2 && cupNum2 == 3) {
                    if (Cup2.getX() > Cup3X) {
                        Cup2.setLocation(Cup2.getX() - 1, JFrameSupport.curve3to2(Cup2.getX() - 1));
                        Cup3.setLocation(Cup3.getX() + 1, JFrameSupport.curve2to3(Cup3.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 2 && cupNum2 == 1) {
                    if (Cup2.getX() > Cup1X) {
                        Cup2.setLocation(Cup2.getX() - 1, JFrameSupport.curve3to2(Cup2.getX() - 1));
                        Cup1.setLocation(Cup1.getX() + 1, JFrameSupport.curve2to3(Cup1.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 3 && cupNum2 == 1) {
                    if (Cup3.getX() > Cup1X) {
                        Cup3.setLocation(Cup3.getX() - 1, JFrameSupport.curve3to2(Cup3.getX() - 1));
                        Cup1.setLocation(Cup1.getX() + 1, JFrameSupport.curve2to3(Cup1.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                } else if (cupNum1 == 3 && cupNum2 == 2) {
                    if (Cup3.getX() > Cup2X) {
                        Cup3.setLocation(Cup3.getX() - 1, JFrameSupport.curve3to2(Cup3.getX() - 1));
                        Cup2.setLocation(Cup2.getX() + 1, JFrameSupport.curve2to3(Cup2.getX() + 1));
                    } else {
                        swapGraphics(swa,d+1);
                        this.cancel();
                    }
                }

            }
        }, 0, 1);
    }

    public void swapGraphics(int sw[], int s) {
        if(sw.length>s){
            int temp = sw[s];
            int cupNum1 = temp / 1000;
            temp = temp % 1000;
            int a = temp / 100;
            temp = temp % 100;
            int cupNum2 = temp / 10;
            temp = temp % 10;
            int b = temp;
            //System.out.println(cupNum1 + " " + a + " " + cupNum2 + " " + b);
            if (a == 0 && b == 1) {
                swap1and2(cupNum1, cupNum2, sw, s);
            } else if (a == 0 && b == 2) {
                swap1and3(cupNum1, cupNum2, sw, s);
            } else {
                swap2and3(cupNum1, cupNum2, sw, s);
            }
        }else{
            btnCup1.setEnabled(true);
            btnCup2.setEnabled(true);
            btnCup3.setEnabled(true);
        }
    }

    private void placeAndMoveBallUp(){
        Random r = new Random();
        final int place = r.nextInt(3);
        final int x;
        if(place == 0)
                x = btnCup1.getX();
        else if (place == 1)
                x = btnCup2.getX();
        else
                x = btnCup3.getX();;
        
        Ball1.setLocation(x,btnCup1.getY()+20);
        Timer time = new Timer();
        
        System.out.println(place + " " + Ball1.getLocation());
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                if(Ball1.getY()>(Cup1.getY()-Ball1.getHeight()+Cup1.getHeight())){
                    Ball1.setLocation(x, Ball1.getY()-1);
                   // System.out.println(Ball1.getLocation());
                }else{
                    Ball1.setVisible(false);
                    int swaps[] = game.runRound(place);
                    swapGraphics(swaps,0);
                    this.cancel(); 
                }
            }
        }, 2000, 4);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ball1;
    private javax.swing.JLabel Cup1;
    private javax.swing.JLabel Cup2;
    private javax.swing.JLabel Cup3;
    private javax.swing.JLabel Level;
    private javax.swing.JLabel MoneyLeft;
    private javax.swing.JLabel PlaceBet;
    private javax.swing.JLabel WinPercentage;
    private javax.swing.JButton btnCup1;
    private javax.swing.JButton btnCup2;
    private javax.swing.JButton btnCup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuLoad;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
