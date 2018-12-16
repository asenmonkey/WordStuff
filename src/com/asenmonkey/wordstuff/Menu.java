package com.asenmonkey.wordstuff;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;

	
	public static void openMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Word Stuff");
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 35, 568, 36);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(12, 13, 101, 16);
		frame.getContentPane().add(lblInput);
		
		JButton btnReverse = new JButton("Reverse ");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(WordStuff.reverseMessage(textField_1.getText()));
			}
		});
		btnReverse.setBounds(12, 128, 139, 25);
		frame.getContentPane().add(btnReverse);
		
		JButton btnWordCount = new JButton("Word Count");
		btnWordCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(Integer.toString(WordStuff.countWords(textField_1.getText())));
			}
		});
		btnWordCount.setBounds(441, 90, 139, 25);
		frame.getContentPane().add(btnWordCount);
		
		JButton btnCharCount = new JButton("Characters Count");
		btnCharCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Integer.toString(WordStuff.characterCount(textField_1.getText())));
			}
		});
		btnCharCount.setBounds(441, 128, 139, 25);
		frame.getContentPane().add(btnCharCount);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 353, 568, 36);
		frame.getContentPane().add(textField);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(12, 331, 101, 16);
		frame.getContentPane().add(lblOutput);
		
		JButton btnCountVowels = new JButton("Palindrome");
		btnCountVowels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Boolean.toString(WordStuff.Palindrome(textField_1.getText())));
			}
		});
		btnCountVowels.setBounds(12, 90, 139, 25);
		frame.getContentPane().add(btnCountVowels);
		
		JButton btnVowelsCount = new JButton("Count Vowels ");
		btnVowelsCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Integer.toString(WordStuff.vowelsCount(textField_1.getText())));
			}
		});
		btnVowelsCount.setBounds(441, 166, 139, 25);
		frame.getContentPane().add(btnVowelsCount);
	}
}
