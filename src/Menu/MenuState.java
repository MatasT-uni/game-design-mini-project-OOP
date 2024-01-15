package Menu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Minatoaquaman.Model;

public class MenuState extends JPanel {
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, tutorialButtonPanel, ButtonLayoutareaPanel ,backButtonPanel,tutorialRadioButtonPanel,tutorialTextFieldPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Arial", Font.BOLD, 25);
	Font normalFont = new Font("Arial", Font.BOLD, 18);
	JButton startButton;
	JButton tutorialButton;
	JButton backButton;
	JTextArea mainTextArea;
	JRadioButton tutorialRadioButton;
	JTextField tutorialTextField;
	
	
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	backtomenu backtomenu = new backtomenu();
	
	public MenuState() {
		window = new JFrame();
		window.setSize(380,420);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(90,95,200,60);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("Minatoaquaman");
		titleNameLabel.setForeground(new Color(255,100,255));
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(90,150,200,50);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.BLACK);
		startButton.setForeground(new Color(255,100,255));
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		
		tutorialButtonPanel = new JPanel();
		tutorialButtonPanel.setBounds(90,200,200,50);
		tutorialButtonPanel.setBackground(Color.black);
		
		
		tutorialButton = new JButton("Tutorial");
		tutorialButton.setBackground(Color.BLACK);
		tutorialButton.setForeground(new Color(255,100,255));
		tutorialButton.setFont(normalFont);
		tutorialButton.addActionListener(tsHandler);
		
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		tutorialButtonPanel.add(tutorialButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		con.add(tutorialButtonPanel);
		window.setVisible(true);
		
	}
	public void TutorialScreen() {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		tutorialButtonPanel.setVisible(false);
		
		ButtonLayoutareaPanel = new JPanel();
		ButtonLayoutareaPanel.setBounds(90,15,200,60);
		ButtonLayoutareaPanel.setBackground(Color.black);
		
		tutorialRadioButtonPanel = new JPanel();
		tutorialRadioButtonPanel.setBounds(90,150,200,50);
		tutorialRadioButtonPanel.setBackground(Color.black);
		
		tutorialRadioButton = new JRadioButton("How to play game");
		tutorialRadioButton.setEnabled(false);
		tutorialRadioButton.setBackground(Color.BLACK);
		tutorialRadioButton.setForeground(new Color(255,100,255));
		tutorialRadioButton.setFont(normalFont);
		tutorialRadioButton.addActionListener(backtomenu);
		
		tutorialRadioButtonPanel.add(tutorialRadioButton);
		
		tutorialTextFieldPanel = new JPanel();
		tutorialTextFieldPanel.setBounds(90,200,200,50);
		tutorialTextFieldPanel.setBackground(Color.black);
		
		tutorialTextField = new JTextField("Space bar to 'Start' ");
		tutorialTextField.setEditable(false);
		tutorialTextField.setBackground(Color.BLACK);
		tutorialTextField.setForeground(new Color(255,100,255));
		tutorialTextField.setFont(normalFont);
		tutorialTextField.addActionListener(backtomenu);
		
		tutorialTextFieldPanel.add(tutorialTextField);
	
		
		backButtonPanel = new JPanel();
		backButtonPanel.setBounds(90,300,200,50);
		backButtonPanel.setBackground(Color.black);
		
		backButton = new JButton("Back");
		backButton.setBackground(Color.BLACK);
		backButton.setForeground(new Color(255,100,255));
		backButton.setFont(normalFont);
		backButton.addActionListener(backtomenu);
	
		backButtonPanel.add(backButton);
		
		
		con.add(tutorialRadioButtonPanel);
		con.add(tutorialTextFieldPanel);
		con.add(backButtonPanel);
		con.add(ButtonLayoutareaPanel);
		
			
	}
	
	public class TitleScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == startButton)
			{
				window.dispose();
				JFrame frame = new JFrame("My game");
				frame.add(new Model());
				frame.setVisible(true);
				frame.setSize(380,420);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			}
			
			TutorialScreen();
		}
	}
	public void backMenuState() {
		backButtonPanel.setVisible(false);
		ButtonLayoutareaPanel.setVisible(false);
		titleNamePanel.setVisible(true);
		startButtonPanel.setVisible(true);
		tutorialButtonPanel.setVisible(true);
		
		
	}
	public class backtomenu implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			backMenuState();
		}
	}
}


	


