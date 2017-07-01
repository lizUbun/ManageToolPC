package com.xlc.activity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;

public class BorrowList {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowList window = new BorrowList();
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
	public BorrowList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1630, 813);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u5E8F\u53F7\uFF1A    \u53D1\u653E\u4EBA\uFF1A    \u501F\u7528\u4EBA\uFF1A    \u501F\u7528\u65F6\u95F4\uFF1A    \u5171\u6709\u5DE5\u5177\u4EF6\u6570\uFF1A    \u5907\u6CE8\uFF1A    \u662F\u5426\u5DF2\u7ECF\u5F52\u8FD8\uFF1A    ");
		label.setBounds(15, 15, 975, 21);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(15, 51, 975, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(15, 122, 975, 40);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(15, 196, 975, 40);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(15, 269, 975, 40);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(15, 345, 975, 40);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(15, 419, 975, 40);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(15, 495, 975, 40);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(15, 566, 975, 40);
		frame.getContentPane().add(textField_7);
		
		JButton button = new JButton("");
		button.setBounds(1014, 0, 13, 757);
		frame.getContentPane().add(button);
		
		JTextArea pageNum = new JTextArea();
		pageNum.setEditable(false);
		pageNum.setBounds(15, 649, 125, 33);
		frame.getContentPane().add(pageNum);
		
		JButton lastPage = new JButton("\u4E0A\u4E00\u9875");
		lastPage.setBounds(186, 653, 123, 29);
		frame.getContentPane().add(lastPage);
		
		JButton nextPage = new JButton("\u4E0B\u4E00\u9875");
		nextPage.setBounds(348, 653, 123, 29);
		frame.getContentPane().add(nextPage);
		
		JButton button_1 = new JButton("\u67E5\u770B\u8BE6\u60C5");
		button_1.setBounds(520, 653, 123, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u786E\u8BA4\u63A5\u6536");
		button_2.setBounds(682, 653, 123, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\u5237\u65B0");
		button_3.setBounds(842, 653, 123, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\u8FD4\u56DE\u9996\u9875");
		button_4.setBounds(456, 697, 239, 45);
		frame.getContentPane().add(button_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\u501F\u7528\u5DE5\u5177\u8BE6\u60C5\uFF1A");
		textArea.setBounds(1042, 51, 551, 556);
		frame.getContentPane().add(textArea);
	}
}
