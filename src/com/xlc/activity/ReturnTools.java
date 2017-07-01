package com.xlc.activity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ReturnTools {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnTools window = new ReturnTools();
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
	public ReturnTools() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 963, 834);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u5E8F\u53F7\uFF1A");
		label.setBounds(15, 15, 81, 21);
		frame.getContentPane().add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(73, 16, 91, 21);
		frame.getContentPane().add(textArea);
		
		JLabel label_1 = new JLabel("\u501F\u7528\u65F6\u95F4\uFF1A");
		label_1.setBounds(15, 68, 96, 21);
		frame.getContentPane().add(label_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(104, 69, 155, 20);
		frame.getContentPane().add(textArea_1);
		
		textField = new JTextField();
		textField.setBounds(15, 104, 488, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(15, 177, 488, 42);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(15, 246, 488, 42);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(15, 324, 488, 42);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(15, 398, 488, 42);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(15, 479, 488, 42);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(15, 562, 488, 42);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(15, 640, 488, 42);
		frame.getContentPane().add(textField_7);
		
		JButton button = new JButton("");
		button.setBounds(514, 0, 15, 778);
		frame.getContentPane().add(button);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(15, 697, 127, 42);
		frame.getContentPane().add(textArea_2);
		
		JButton button_1 = new JButton("\u4E0A\u4E00\u9875");
		button_1.setBounds(170, 710, 123, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u4E0B\u4E00\u9875");
		button_2.setBounds(343, 710, 123, 29);
		frame.getContentPane().add(button_2);
		
		JLabel label_2 = new JLabel("\u9001\u56DE\u5DE5\u5177\u4EBA\uFF1A");
		label_2.setBounds(545, 15, 127, 21);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u63A5\u6536\u4EBA\uFF1A");
		label_3.setBounds(562, 68, 81, 21);
		frame.getContentPane().add(label_3);
		
		textField_8 = new JTextField();
		textField_8.setBounds(658, 12, 171, 27);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(658, 65, 171, 27);
		frame.getContentPane().add(textField_9);
		
		JLabel label_4 = new JLabel("\u5907\u6CE8\uFF1A");
		label_4.setBounds(573, 170, 81, 21);
		frame.getContentPane().add(label_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(658, 167, 171, 27);
		frame.getContentPane().add(textField_10);
		
		JButton button_3 = new JButton("\u786E\u8BA4\u5F52\u8FD8");
		button_3.setBounds(563, 264, 123, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\u53D6\u6D88\u5E76\u8FD4\u56DE");
		button_4.setBounds(746, 264, 123, 29);
		frame.getContentPane().add(button_4);
		
		JLabel label_5 = new JLabel("\u5F52\u8FD8\u65F6\u95F4\uFF1A");
		label_5.setBounds(555, 114, 99, 21);
		frame.getContentPane().add(label_5);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(658, 114, 171, 27);
		frame.getContentPane().add(textField_11);
	}

}
