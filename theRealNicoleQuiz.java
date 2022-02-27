import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class theRealNicoleQuiz extends JFrame {

	private JPanel contentPane;
	int counter = 0;

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
		title.setBounds(189, 50, 143, 14);
		startPage.add(title);
		
		JLabel description = new JLabel("How well do YOU know her?");
		description.setBounds(189, 81, 158, 14);
		startPage.add(description);
		
		JLabel startPrompt = new JLabel("Click \"START\" to find out!");
		startPrompt.setBounds(189, 138, 49, 14);
		startPage.add(startPrompt);
		
		JPanel firstQuestion = new JPanel();
		firstQuestion.setBounds(0, 0, 436, 263);
		panel.add(firstQuestion);
		firstQuestion.setLayout(null);
		
		JLabel question_1 = new JLabel("1. What is Nicole's favourite snack?");
		question_1.setBounds(185, 45, 217, 14);
		firstQuestion.add(question_1);
		
		JPanel secondQuestion = new JPanel();
		secondQuestion.setBounds(0, 0, 436, 263);
		panel.add(secondQuestion);
		secondQuestion.setLayout(null);
		
		JLabel question_2 = new JLabel("2. What was Nicole's turtle's name?");
		question_2.setBounds(185, 49, 241, 14);
		secondQuestion.add(question_2);
		
		JPanel thirdQuestion = new JPanel();
		thirdQuestion.setBounds(0, 0, 436, 263);
		panel.add(thirdQuestion);
		thirdQuestion.setLayout(null);
		
		JLabel question_3 = new JLabel("3. What does Nicole fear most?");
		question_3.setBounds(188, 32, 189, 14);
		thirdQuestion.add(question_3);
		
		JPanel fourthQuestion = new JPanel();
		fourthQuestion.setBounds(0, 0, 436, 263);
		panel.add(fourthQuestion);
		fourthQuestion.setLayout(null);
		
		JLabel question_4 = new JLabel("4. What is Nicole's last name?");
		question_4.setBounds(207, 38, 49, 14);
		fourthQuestion.add(question_4);
		
		JPanel fifthQuestion = new JPanel();
		fifthQuestion.setBounds(0, 0, 436, 263);
		panel.add(fifthQuestion);
		fifthQuestion.setLayout(null);
		
		JLabel question_5 = new JLabel("5. What is Nicole's favourite way of getting around?");
		question_5.setBounds(171, 26, 49, 14);
		fifthQuestion.add(question_5);
		
		JPanel scorePage = new JPanel();
		scorePage.setBounds(0, 0, 436, 263);
		panel.add(scorePage);
		scorePage.setLayout(null);
		
		JLabel yay = new JLabel("You finished the quiz! Yay!");
		yay.setBounds(194, 28, 187, 14);
		scorePage.add(yay);
		
		JLabel displayScore = new JLabel("You scored:");
		displayScore.setBounds(194, 46, 49, 14);
		scorePage.add(displayScore);
		
		JLabel scoreFraction = new JLabel("0");
		scoreFraction.setBounds(194, 63, 49, 14);
		scorePage.add(scoreFraction);
		
		JLabel outOfFraction = new JLabel("/5");
		outOfFraction.setBounds(253, 63, 49, 14);
		scorePage.add(outOfFraction);
		
		// HERE'S WHERE THE BUTTONS BEGIN!
		// button that takes you to the first question
		JButton start = new JButton("START");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startPage.setVisible(false);
				firstQuestion.setVisible(true);
			}
		});
		start.setBounds(189, 104, 89, 23);
		startPage.add(start);
		
		// Q1
		JButton goldfish = new JButton("Goldfish");
		goldfish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		goldfish.setBounds(185, 70, 89, 23);
		firstQuestion.add(goldfish);
		
		JButton dimes = new JButton("Dimes");
		dimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		dimes.setBounds(185, 104, 89, 23);
		firstQuestion.add(dimes);
		
		JButton gummyWorms = new JButton("Gummy Worms");
		gummyWorms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		gummyWorms.setBounds(185, 138, 89, 23);
		firstQuestion.add(gummyWorms);
		
		JButton paint = new JButton("Paint"); // RIGHT ANSWER
		paint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		paint.setBounds(185, 172, 89, 23);
		firstQuestion.add(paint);
		
		// Q2
		JButton michelangelo = new JButton("Michelangelo");
		michelangelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		michelangelo.setBounds(185, 85, 89, 23);
		secondQuestion.add(michelangelo);
		
		JButton beethoven = new JButton("Beethoven");
		beethoven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		beethoven.setBounds(185, 119, 89, 23);
		secondQuestion.add(beethoven);
		
		JButton jerry = new JButton("Jerry ");
		jerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		jerry.setBounds(185, 153, 89, 23);
		secondQuestion.add(jerry);
		
		JButton barry = new JButton("Barry"); // RIGHT ANSWER
		barry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		barry.setBounds(185, 187, 89, 23);
		secondQuestion.add(barry);
		
		// Q3
		JButton boogeyMan = new JButton("Boogey Man");
		boogeyMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		boogeyMan.setBounds(198, 60, 89, 23);
		thirdQuestion.add(boogeyMan);
		
		JButton wetSocks = new JButton("Wet socks"); //RIGHT ANSWER
		wetSocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		wetSocks.setBounds(198, 94, 89, 23);
		thirdQuestion.add(wetSocks);
		
		JButton bowTiePasta = new JButton("Bow tie pasta");
		bowTiePasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		bowTiePasta.setBounds(198, 128, 89, 23);
		thirdQuestion.add(bowTiePasta);
		
		JButton wrinkledTShirt = new JButton("Wrinkled t-shirt");
		wrinkledTShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		wrinkledTShirt.setBounds(198, 162, 89, 23);
		thirdQuestion.add(wrinkledTShirt);
		
		// Q4
		JButton delosRelos = new JButton("Delos Relos");
		delosRelos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		delosRelos.setBounds(207, 62, 89, 23);
		fourthQuestion.add(delosRelos);
		
		JButton reyes = new JButton("Reyes");
		reyes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		reyes.setBounds(207, 96, 89, 23);
		fourthQuestion.add(reyes);
		
		JButton delosReyes = new JButton("Delos Reyes"); // RIGHT ANSWER
		delosReyes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		delosReyes.setBounds(207, 129, 89, 23);
		fourthQuestion.add(delosReyes);
		
		JButton dallasTexas = new JButton("Dallas Texas");
		dallasTexas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		dallasTexas.setBounds(207, 163, 89, 23);
		fourthQuestion.add(dallasTexas);
		
		// Q5
		JButton crabWalking = new JButton("Crab walking"); // RIGHT ANSWER
		crabWalking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
				scoreFraction.setText(String.valueOf(counter));
			}
		});
		crabWalking.setBounds(92, 51, 89, 23);
		fifthQuestion.add(crabWalking);
		
		JButton millenniumFalcon = new JButton("Millennium Falcon");
		millenniumFalcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
			}
		});
		millenniumFalcon.setBounds(92, 85, 89, 23);
		fifthQuestion.add(millenniumFalcon);
		
		JButton unicycle = new JButton("Unicycle");
		unicycle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
			}
		});
		unicycle.setBounds(191, 51, 89, 23);
		fifthQuestion.add(unicycle);
		
		JButton piggyBackRides = new JButton("Piggy back rides");
		piggyBackRides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				scorePage.setVisible(true);
			}
		});
		piggyBackRides.setBounds(191, 85, 89, 23);
		fifthQuestion.add(piggyBackRides);
		
		firstQuestion.setVisible(false);
		secondQuestion.setVisible(false);
		thirdQuestion.setVisible(false);
		fourthQuestion.setVisible(false);
		fifthQuestion.setVisible(false);
		scorePage.setVisible(false);
	}
}
