import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class theRealNicoleQuiz extends JFrame {

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
		startPage.setBounds(0, 241, 436, 22);
		panel.add(startPage);
		startPage.setLayout(null);
		
		JLabel title = new JLabel("The Nicole Quiz");
		title.setBounds(189, 50, 143, 14);
		startPage.add(title);
		
		JLabel description = new JLabel("How well do YOU know her?");
		description.setBounds(189, 81, 158, 14);
		startPage.add(description);
		
		JLabel startPrompt = new JLabel("Click \"START\" to find out!");
		startPrompt.setBounds(189, 110, 49, 14);
		startPage.add(startPrompt);
		
		JPanel firstQuestion = new JPanel();
		firstQuestion.setBounds(0, 220, 436, 43);
		panel.add(firstQuestion);
		firstQuestion.setLayout(null);
		
		JLabel question_1 = new JLabel("1. What is Nicole's favourite snack?");
		question_1.setBounds(185, 45, 217, 14);
		firstQuestion.add(question_1);
		
		JPanel secondQuestion = new JPanel();
		secondQuestion.setBounds(0, 201, 436, 62);
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
		
		
		
	}
}
