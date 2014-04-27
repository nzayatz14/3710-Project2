/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg3710.project2;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author nzayatz14
 */
public class NewJFrame extends javax.swing.JFrame {

	JLabel cups[] = new JLabel[3];
	JButton buttons[] = new JButton[3];
	Game game;
	int cupPlaces[] = {1, 2, 3};
	Point p[] = new Point[3];

	//array to hold the 'fractions' of how fast the cups will move, the cups increase speed until the player reaches level 20 then the cups stay at the highest speed
	final int pixelsPerLevel[] = {1,11,6,13,7,3,8,17,9,19,2,21,11,23,12,5,13,27,14,29,3};
	final int cupPixelLevels[] = {1,10,5,10,5,2,5,10,5,10,1,10,5,10,5,2,5,10,5,10,1};
	
	//constants to hold the starting yAxis level of the cups, how quick the cups lift and how fast the balls lift
	final int yAxisCups = 43;
	final int liftCupInterval = 25;
	final int liftCupWait = 1000;
	final int displayBallTime = 3000;
	final int liftBallTime = 10;
	
	//integers hold hold many pixels each step in the timer will move the cup, how fast the timer is, and how much longer to pause to hold the cup up after a guess
	private int cupPixelTime = 1;
	private int pixelsPerMove = 3;
	private int pause = 0;
	
	int cupWithBall = -1;
	double bet = 0;

	/**
	 * Creates new form NewJFrame
	 */
	public NewJFrame() {
		initComponents();
		game = new Game();
		this.getContentPane().setBackground(Color.white);
		btnCup1.setEnabled(false);
		btnCup2.setEnabled(false);
		btnCup3.setEnabled(false);
		cups[0] = Cup1;
		cups[1] = Cup2;
		cups[2] = Cup3;
		buttons[0] = btnCup1;
		buttons[1] = btnCup2;
		buttons[2] = btnCup3;

		p[0] = Cup1.getLocation();
		p[1] = Cup2.getLocation();
		p[2] = Cup3.getLocation();

		updateWindow();
	}

	/*
	 * Creates a NewJFrame with a game as a parameter (in order to load a previous game)
	 */
	public NewJFrame(Game g) {
		initComponents();
		game = g;
		this.getContentPane().setBackground(Color.white);
		btnCup1.setEnabled(false);
		btnCup2.setEnabled(false);
		btnCup3.setEnabled(false);
		cups[0] = Cup1;
		cups[1] = Cup2;
		cups[2] = Cup3;
		buttons[0] = btnCup1;
		buttons[1] = btnCup2;
		buttons[2] = btnCup3;

		p[0] = Cup1.getLocation();
		p[1] = Cup2.getLocation();
		p[2] = Cup3.getLocation();

		updateWindow();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                                                    
	private void initComponents() {

		Cup1 = new javax.swing.JLabel();
		Cup2 = new javax.swing.JLabel();
		Cup3 = new javax.swing.JLabel();
		btnGo = new javax.swing.JButton();
		txtAmount = new javax.swing.JTextField();
		btnCup1 = new javax.swing.JButton();
		btnCup3 = new javax.swing.JButton();
		btnCup2 = new javax.swing.JButton();
		PlaceBet = new javax.swing.JLabel();
		Level = new javax.swing.JLabel();
		WinPercentage = new javax.swing.JLabel();
		MoneyLeft = new javax.swing.JLabel();
		Ball1 = new javax.swing.JLabel();
		balanceTxtField = new javax.swing.JTextField();
		levelField = new javax.swing.JTextField();
		winPercentField = new javax.swing.JTextField();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		mnuLoad = new javax.swing.JMenuItem();
		mnuSave = new javax.swing.JMenuItem();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Cup Game Bruh");

		Cup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("imgres.jpg"))); // NOI18N

		Cup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("imgres.jpg"))); // NOI18N

		Cup3.setIcon(new javax.swing.ImageIcon(getClass().getResource("imgres.jpg"))); // NOI18N

		btnGo.setText("Go!");
		btnGo.setToolTipText("");
		btnGo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnGoActionPerformed(evt);
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

		Ball1.setIcon(new javax.swing.ImageIcon(getClass().getResource("ball.png"))); // NOI18N

		balanceTxtField.setEditable(false);
		balanceTxtField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				balanceTxtFieldActionPerformed(evt);
			}
		});

		levelField.setEditable(false);
		levelField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				levelFieldActionPerformed(evt);
			}
		});

		winPercentField.setEditable(false);
		winPercentField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				winPercentFieldActionPerformed(evt);
			}
		});

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
				.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
						.add(115, 115, 115)
						.add(btnCup1)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.add(btnCup2)
						.add(140, 140, 140)
						.add(btnCup3)
						.add(80, 80, 80))
						.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
								.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
										.add(btnGo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(layout.createSequentialGroup()
												.add(PlaceBet)
												.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
												.add(txtAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
												.add(331, 331, 331))
												.add(layout.createSequentialGroup()
														.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
																.add(layout.createSequentialGroup()
																		.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
																				.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
																						.add(40, 40, 40)
																						.add(Cup1))
																						.add(layout.createSequentialGroup()
																								.add(58, 58, 58)
																								.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
																										.add(levelField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																										.add(layout.createSequentialGroup()
																												.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
																														.add(Level)
																														.add(MoneyLeft)
																														.add(WinPercentage))
																														.add(18, 18, 18)
																														.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
																																.add(winPercentField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																																.add(org.jdesktop.layout.GroupLayout.TRAILING, balanceTxtField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
																																.add(18, 18, 18)
																																.add(Cup2)
																																.add(18, 18, 18)
																																.add(Cup3))
																																.add(layout.createSequentialGroup()
																																		.add(131, 131, 131)
																																		.add(Ball1)))
																																		.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout.createSequentialGroup()
						.add(43, 43, 43)
						.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
								.add(Cup3)
								.add(Cup2)
								.add(Cup1))
								.add(18, 18, 18)
								.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
										.add(btnCup1)
										.add(btnCup3)
										.add(btnCup2))
										.add(29, 29, 29)
										.add(Ball1)
										.add(46, 46, 46)
										.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
												.add(PlaceBet, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.add(txtAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
												.add(btnGo)
												.add(19, 19, 19)
												.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
														.add(MoneyLeft)
														.add(balanceTxtField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(18, 18, 18)
														.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
																.add(Level)
																.add(levelField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																.add(18, 18, 18)
																.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
																		.add(WinPercentage)
																		.add(winPercentField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																		.add(83, 83, 83))
				);

		pack();
	}// </editor-fold>                                                

	//if exit is hit. close the program
	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	//if btnGo is hit
	private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {
		//get a double out of the text file for the wager
		Double wager;
		try {
			wager = Double.parseDouble(txtAmount.getText());
		} catch (Exception ex) {
			wager = -1.0;
		}

		//if the wager is valid, run the swaps, if not, print an error
		if (game.getPlayer().CheckWager(wager) == true) {
			//try to make the swaps
			bet = wager;
			btnGo.setEnabled(false);
			txtAmount.setEnabled(false);
			
			//set the speed of the cups with the level arrays
			int lvl = game.getLevel()-1;
			
			if(lvl<20){
				pixelsPerMove = pixelsPerLevel[lvl];
				cupPixelTime = cupPixelLevels[lvl];
			}else{
				pixelsPerMove = pixelsPerLevel[pixelsPerLevel.length-1];
				cupPixelTime = cupPixelLevels[cupPixelLevels.length-1];
			}
			
			placeAndMoveBallUp();
		} else {
			//if there is a problem with the wager, erase the input in the textBox and set the focus of the program to the text box
			txtAmount.setText("");
			txtAmount.requestFocus();
		}
	}

	private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {

	}

	//if the menu button "Load" is hit, create a new LoadLoginFrame
	private void mnuLoadActionPerformed(java.awt.event.ActionEvent evt) {
		new LoadLoginFrame(this).setVisible(true);
	}

	//if the menu button "Save" is hit, create a new SaveLoginFrame
	private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {
		new SaveLoginFrame(game).setVisible(true);
	}

	//if Cup1 button is hit
	private void btnCup1ActionPerformed(java.awt.event.ActionEvent evt) {
		boolean correct = game.guess(0, bet);
		liftCup(cupPlaces[0] - 1, correct);
	}

	//if Cup2 button is hit
	private void btnCup2ActionPerformed(java.awt.event.ActionEvent evt) {
		boolean correct = game.guess(1, bet);
		liftCup(cupPlaces[1] - 1, correct);
	}

	//if Cup3 button is hit
	private void btnCup3ActionPerformed(java.awt.event.ActionEvent evt) {
		boolean correct = game.guess(2, bet);
		liftCup(cupPlaces[2] - 1, correct);
	}

	private void balanceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void levelFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void winPercentFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//lifts the cup that is above the button the user clicked to make their guess
	//passes in the guess the user made (g) and if the guess was correct or not (correct)
	private void liftCup(int g, boolean correct) {
		//set all buttons so they cannot be clicked
		btnCup1.setEnabled(false);
		btnCup2.setEnabled(false);
		btnCup3.setEnabled(false);
		
		final int guess = g;
		final boolean right = correct;
		
		//timer that lifts the cup
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				
				//if the cup is not at the lifted position, continue to lift it
				if (cups[guess].getY() > 1) {
					cups[guess].setLocation(cups[guess].getX(), cups[guess].getY() - 1);
				//if the cup is in lifted position pause the cup for a little
				}else if (pause <liftCupInterval*100){
					pause+=liftCupInterval;
				//after the pause, call the function to lift the correct cup and cancel this timer
				} else {
					if(!right){
						liftCup(cupPlaces[game.getPlaceOfBall()]-1, true);
					}else{
						updateWindow();
						btnGo.setEnabled(true);
						txtAmount.setEnabled(true);
					}
					pause = 0;				
					this.cancel();
				}
			}
		}, liftCupWait, liftCupInterval);
	}

	//resets the window after the round by placing the cups in correct their spaces and clearing txtAmount
	//updates the users money, level, and win percentage after each round
	private void updateWindow() {
		//update data on screen
		levelField.setText(game.getLevel() + "");
		balanceTxtField.setText(game.getMoney() + "");
		winPercentField.setText(game.calculateWinPercentage() + "");
		
		//clear txtAmount and set cursor there
		txtAmount.setText("");
		txtAmount.requestFocus();

		//set cups back to initial y position
		for (int i = 0; i < cups.length; i++) {
			cups[i].setLocation(cups[i].getX(), yAxisCups);
		}

	}

	/*This function takes in the list of swaps to be made and the current swap being made. If there are
     still swaps to be made, the encoded number is decoded to show that Cup 'cupNum1' needs to be moved to 
     'a' and Cup 'cupNum2' needs to be moved to 'b'. After this is determined, the proper function is called
     in order to graphically make these swaps. If no more swaps need to be made, the option buttons are enabled
     in order to allow the user to guess where the ball is.*/
	public void swapGraphics(int sw[], int s) {
		if (sw.length > s) {
			int temp = sw[s];
			int cupNum1 = temp / 1000;
			temp = temp % 1000;
			int a = temp / 100;
			temp = temp % 100;
			int cupNum2 = temp / 10;
			temp = temp % 10;
			int b = temp;

			int swapTemp = cupPlaces[a];
			cupPlaces[a] = cupPlaces[b];
			cupPlaces[b] = swapTemp;

			makeSwapGraphically(cupNum1, cupNum2, sw, s, a, b);

		} else {
			btnCup1.setEnabled(true);
			btnCup2.setEnabled(true);
			btnCup3.setEnabled(true);
			Ball1.setLocation(buttons[game.getPlaceOfBall()].getX(), buttons[game.getPlaceOfBall()].getY() - 70);
		}
	}

	/* This function takes in the parameters of which cup is at position a and position b respectively.
    It also takes in the list of swaps to be made and the current swap being made. The function then 
    gets the x-coordinate of each cup at the beginning of the motions. Then the timer starts, for each
    tick of the timer, the parabola needed to be taken to make the swap is determined. After finding the
    parabola, a check is made to see if the cup is already at its final resting place or not. If it's not,
    each cup is moved to the next coordinate (x,y) in their respective parabola. Once the cup is at its
    final place, swapGraphics() is called to determine the next pair of cups to be swapped and the timer
    is cancelled. CUP1 ALWAYS IS THE HIGHER POSITION CUP, not higher number but higher position.*/
	public void makeSwapGraphically(int cupNum1, int cupNum2, int sw[], int s, int a, int b) {
		Timer time = new Timer();

		//get x coordinates of the cups from the array
		final int Cup1X = cups[cupNum1 - 1].getX();
		final int Cup2X = cups[cupNum2 - 1].getX();

		final int cupNumber1 = cupNum1 - 1;
		final int cupNumber2 = cupNum2 - 1;
		final int swa[] = sw;
		final int d = s;

		//cup cupNum1 goes to 'from' and cup cupNum2 goes to 'to'
		final int from = a + 1;
		final int to = b + 1;

		time.schedule(new TimerTask() {
			@Override
			public void run() {
				//while the cups are not in the correct position they are supposed to be in
				if (cups[cupNumber1].getX() > Cup2X) {
					//because cup1 is in the higher position, it is moved backwards and cup2 is moved forwards
					cups[cupNumber1].setLocation(cups[cupNumber1].getX() - pixelsPerMove, JFrameSupport.findCurve(to, from, cups[cupNumber1].getX() - pixelsPerMove));
					cups[cupNumber2].setLocation(cups[cupNumber2].getX() + pixelsPerMove, JFrameSupport.findCurve(from, to, cups[cupNumber2].getX() + pixelsPerMove));

					//set balls position to under the cup to follow the cups its under
					if (cupNumber1 == cupWithBall) {
						Ball1.setLocation(cups[cupNumber1].getLocation());
					} else if (cupNumber2 == cupWithBall) {
						Ball1.setLocation(cups[cupNumber2].getLocation());
					}
				} else {
					//reset the cups locations so the next swaps can be properly made
					cups[cupNumber1].setLocation(p[from-1]);
					cups[cupNumber2].setLocation(p[to-1]);
					
					//set balls position to under the cup to follow the cups its under
					if (cupNumber1 == cupWithBall) {
						Ball1.setLocation(cups[cupNumber1].getLocation());
					} else if (cupNumber2 == cupWithBall) {
						Ball1.setLocation(cups[cupNumber2].getLocation());
					}
					
					//call swap graphics to make the next swap
					swapGraphics(swa, d + 1);
					this.cancel();
				}
			}
		}, 0, cupPixelTime);
	}
	
	/*This function is used to place the ball initially and move the ball up.*/
	private void placeAndMoveBallUp() {
		Random r = new Random();

		//generate a random number under which position the ball will be and set the balls position
		final int place = r.nextInt(3);
		final int x;
		if (place == 0) {
			x = btnCup1.getX();
		} else if (place == 1) {
			x = btnCup2.getX();
		} else {
			x = btnCup3.getX();
		}
		
		Ball1.setLocation(x, btnCup1.getY() + 20);

		cupWithBall = cupPlaces[place] - 1;

		//timer to move the ball up to its location
		Timer displayBall = new Timer();
		displayBall.schedule(new TimerTask() {
			@Override
			public void run() {
				if (Ball1.getY() > yAxisCups) {
					Ball1.setLocation(Ball1.getX(), Ball1.getY() - 1);
				} else {
					//run the round from the round class and generate the swaps, each swap will be in the 
					//integer format "abcd"
					//Essentially: cup 'a' is moving to position 'b' and cup 'c' is moving to position 'd'
					int swaps[] = game.runRound(place);

					//call the first graphical swap with the array of swaps, beginning at position 0
					swapGraphics(swaps, 0);
					this.cancel();
				}
			}
		}, displayBallTime, liftBallTime);
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
	// Variables declaration - do not modify                                          
	private javax.swing.JLabel Ball1;
	private javax.swing.JLabel Cup1;
	private javax.swing.JLabel Cup2;
	private javax.swing.JLabel Cup3;
	private javax.swing.JLabel Level;
	private javax.swing.JLabel MoneyLeft;
	private javax.swing.JLabel PlaceBet;
	private javax.swing.JLabel WinPercentage;
	private javax.swing.JTextField balanceTxtField;
	private javax.swing.JButton btnCup1;
	private javax.swing.JButton btnCup2;
	private javax.swing.JButton btnCup3;
	private javax.swing.JButton btnGo;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JTextField levelField;
	private javax.swing.JMenuItem mnuLoad;
	private javax.swing.JMenuItem mnuSave;
	private javax.swing.JTextField txtAmount;
	private javax.swing.JTextField winPercentField;
	// End of variables declaration                                      
}
