import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class theRealNicoleQuiz extends JFrame {
	int counter = 0;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					theRealNicoleQuiz frame = new theRealNicoleQuiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public theRealNicoleQuiz() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 436, 263);
		panel.add(startPage);
		startPage.setLayout(null);
		
		JLabel title = new JLabel("The Nicole Quiz");
		title.setFont(new Font("Tahoma", Font.BOLD, 22));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(80, 53, 267, 38);
		startPage.add(title);
		
		JLabel description = new JLabel("How well do YOU know her?");
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setFont(new Font("Tahoma", Font.ITALIC, 19));
		description.setBounds(67, 90, 312, 23);
		startPage.add(description);
		
		JLabel startPrompt = new JLabel("Click \"START\" to find out!");
		startPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		startPrompt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		startPrompt.setBounds(106, 173, 241, 23);
		startPage.add(startPrompt);
		
		JPanel firstQuestion = new JPanel();
		firstQuestion.setBounds(0, 0, 436, 263);
		panel.add(firstQuestion);
		firstQuestion.setLayout(null);
		
		JLabel question_1 = new JLabel("1. What is Nicole's favourite snack?");
		question_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		question_1.setHorizontalAlignment(SwingConstants.CENTER);
		question_1.setBounds(44, 55, 347, 38);
		firstQuestion.add(question_1);
		
		JPanel secondQuestion = new JPanel();
		secondQuestion.setBounds(0, 0, 436, 263);
		panel.add(secondQuestion);
		secondQuestion.setLayout(null);
		
		JLabel question_2 = new JLabel("2. What was Nicole's turtle's name?");
		question_2.setHorizontalAlignment(SwingConstants.CENTER);
		question_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		question_2.setBounds(55, 66, 345, 23);
		secondQuestion.add(question_2);
		
		JPanel thirdQuestion = new JPanel();
		thirdQuestion.setBounds(0, 0, 436, 263);
		panel.add(thirdQuestion);
		thirdQuestion.setLayout(null);
		
		JLabel question_3 = new JLabel("3. What does Nicole fear most?");
		question_3.setHorizontalAlignment(SwingConstants.CENTER);
		question_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		question_3.setBounds(50, 65, 350, 37);
		thirdQuestion.add(question_3);
		
		JPanel fourthQuestion = new JPanel();
		fourthQuestion.setBounds(0, 0, 436, 263);
		panel.add(fourthQuestion);
		fourthQuestion.setLayout(null);
		
		JLabel question_4 = new JLabel("4. What is Nicole's last name?");
		question_4.setHorizontalAlignment(SwingConstants.CENTER);
		question_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		question_4.setBounds(53, 46, 346, 46);
		fourthQuestion.add(question_4);
		
		JPanel fifthQuestion = new JPanel();
		fifthQuestion.setBounds(0, 0, 436, 263);
		panel.add(fifthQuestion);
		fifthQuestion.setLayout(null);
		
		JLabel question_5 = new JLabel("5. What is Nicole's favourite way of getting around?");
		question_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		question_5.setHorizontalAlignment(SwingConstants.CENTER);
		question_5.setBounds(21, 47, 405, 43);
		fifthQuestion.add(question_5);
		
		JPanel scorePage = new JPanel();
		scorePage.setBounds(0, 0, 436, 263);
		panel.add(scorePage);
		scorePage.setLayout(null);
		
		JLabel yay = new JLabel("You finished the quiz! Yay!");
		yay.setHorizontalAlignment(SwingConstants.CENTER);
		yay.setFont(new Font("Tahoma", Font.BOLD, 18));
		yay.setBounds(34, 35, 355, 31);
		scorePage.add(yay);
		
		JLabel displayScore = new JLabel("You scored:");
		displayScore.setFont(new Font("Tahoma", Font.PLAIN, 15));
		displayScore.setBounds(90, 77, 85, 31);
		scorePage.add(displayScore);
		
		JLabel scoreFraction = new JLabel("0");
		scoreFraction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scoreFraction.setBounds(179, 82, 22, 21);
		scorePage.add(scoreFraction);
		
		JLabel outOfFraction = new JLabel("/5");
		outOfFraction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		outOfFraction.setBounds(193, 82, 45, 21);
		scorePage.add(outOfFraction);
		
		JLabel markDisplay = new JLabel("Mark:");
		markDisplay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		markDisplay.setBounds(90, 119, 45, 21);
		scorePage.add(markDisplay);
		
		JLabel markPercent = new JLabel("0");
		markPercent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		markPercent.setBounds(145, 119, 69, 21);
		scorePage.add(markPercent);
		
		JLabel finalAdvice = new JLabel("");
		finalAdvice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		finalAdvice.setBounds(90, 151, 273, 74);
		scorePage.add(finalAdvice);
		
		// HERE'S WHERE THE BUTTONS BEGIN!
		// button that takes you to the first question
		JButton start = new JButton("START");
		start.setFont(new Font("Tahoma", Font.BOLD, 16));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startPage.setVisible(false);
				firstQuestion.setVisible(true);
			}
		});
		start.setBounds(135, 124, 158, 38);
		startPage.add(start);
		
		// Q1
		JButton goldfish = new JButton("Goldfish");
		goldfish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		goldfish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		goldfish.setBounds(80, 106, 141, 29);
		firstQuestion.add(goldfish);
		
		JButton dimes = new JButton("Dimes");
		dimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		dimes.setBounds(80, 146, 141, 29);
		firstQuestion.add(dimes);
		
		JButton gummyWorms = new JButton("Gummy Worms");
		gummyWorms.setFont(new Font("Tahoma", Font.PLAIN, 16));
		gummyWorms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		gummyWorms.setBounds(231, 104, 141, 32);
		firstQuestion.add(gummyWorms);
		
		JButton paint = new JButton("Paint"); // RIGHT ANSWER
		paint.setFont(new Font("Tahoma", Font.PLAIN, 16));
		paint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=counter+1;
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		paint.setBounds(231, 146, 141, 29);
		firstQuestion.add(paint);
		
		// Q2
		JButton michelangelo = new JButton("Michelangelo");
		michelangelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		michelangelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		michelangelo.setBounds(69, 100, 147, 35);
		secondQuestion.add(michelangelo);
		
		JButton beethoven = new JButton("Beethoven");
		beethoven.setFont(new Font("Tahoma", Font.PLAIN, 16));
		beethoven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		beethoven.setBounds(69, 146, 147, 35);
		secondQuestion.add(beethoven);
		
		JButton jerry = new JButton("Jerry ");
		jerry.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		jerry.setBounds(226, 100, 147, 35);
		secondQuestion.add(jerry);
		
		JButton barry = new JButton("Barry"); // RIGHT ANSWER
		barry.setFont(new Font("Tahoma", Font.PLAIN, 16));
		barry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=counter+1;
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		barry.setBounds(232, 146, 141, 35);
		secondQuestion.add(barry);
		
		// Q3
		JButton boogeyMan = new JButton("Boogey Man");
		boogeyMan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boogeyMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		boogeyMan.setBounds(45, 113, 164, 31);
		thirdQuestion.add(boogeyMan);
		
		JButton wetSocks = new JButton("Wet socks"); //RIGHT ANSWER
		wetSocks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wetSocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=counter+1;
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		wetSocks.setBounds(45, 155, 164, 31);
		thirdQuestion.add(wetSocks);
		
		JButton bowTiePasta = new JButton("Bow tie pasta");
		bowTiePasta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bowTiePasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		bowTiePasta.setBounds(219, 113, 164, 31);
		thirdQuestion.add(bowTiePasta);
		
		JButton wrinkledTShirt = new JButton("Wrinkled t-shirts");
		wrinkledTShirt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wrinkledTShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		wrinkledTShirt.setBounds(219, 155, 164, 31);
		thirdQuestion.add(wrinkledTShirt);
		
		// Q4
		JButton delosRelos = new JButton("Delos Relos");
		delosRelos.setFont(new Font("Dialog", Font.PLAIN, 16));
		delosRelos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		delosRelos.setBounds(73, 94, 143, 35);
		fourthQuestion.add(delosRelos);
		
		JButton reyes = new JButton("Reyes");
		reyes.setFont(new Font("Dialog", Font.PLAIN, 16));
		reyes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		reyes.setBounds(73, 140, 143, 35);
		fourthQuestion.add(reyes);
		
		JButton delosReyes = new JButton("Delos Reyes"); // RIGHT ANSWER
		delosReyes.setFont(new Font("Dialog", Font.PLAIN, 16));
		delosReyes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=counter+1;
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		delosReyes.setBounds(226, 94, 143, 35);
		fourthQuestion.add(delosReyes);
		
		JButton dallasTexas = new JButton("Dallas Texas");
		dallasTexas.setFont(new Font("Dialog", Font.PLAIN, 16));
		dallasTexas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		dallasTexas.setBounds(226, 140, 143, 35);
		fourthQuestion.add(dallasTexas);
		
		// Q5
		JButton crabWalking = new JButton("Crab walking"); // RIGHT ANSWER
		crabWalking.setFont(new Font("Tahoma", Font.PLAIN, 14));
		crabWalking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=counter+1;
				int totalMark = (counter/5)*100;
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
				scoreFraction.setText(String.valueOf(counter));
				markPercent.setText(String.valueOf(totalMark + "%"));
				
				/*
				if (totalMark == 100){
					finalAdvice.setText(String.valueOf("You know Nicole so well! Great Job!"));}
				else if (totalMark == 80) {
					finalAdvice.setText(String.valueOf("Nice job!"));}
				else {
					finalAdvice.setText(String.valueOf("This is awkward."));}
					*/
			}
		});
		crabWalking.setBounds(68, 91, 150, 37);
		fifthQuestion.add(crabWalking);
		
		JButton millenniumFalcon = new JButton("Millennium Falcon");
		millenniumFalcon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		millenniumFalcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
			}
		});
		millenniumFalcon.setBounds(68, 139, 150, 37);
		fifthQuestion.add(millenniumFalcon);
		
		JButton unicycle = new JButton("Unicycle");
		unicycle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		unicycle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
			}
		});
		unicycle.setBounds(228, 91, 150, 37);
		fifthQuestion.add(unicycle);
		
		JButton piggyBackRides = new JButton("Piggy back rides");
		piggyBackRides.setFont(new Font("Tahoma", Font.PLAIN, 14));
		piggyBackRides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
			}
		});
		piggyBackRides.setBounds(228, 139, 150, 37);
		fifthQuestion.add(piggyBackRides);
		
		// Ensure that all JPanels except startPage are visible
		firstQuestion.setVisible(false);
		secondQuestion.setVisible(false);
		thirdQuestion.setVisible(false);
		fourthQuestion.setVisible(false);
		fifthQuestion.setVisible(false);
		scorePage.setVisible(false);
	}
}
