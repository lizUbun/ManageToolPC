package com.xlc.activity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class SelectConfirm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField borrowTime;
	private JTextField borrower;
	private JTextField giver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectConfirm window = new SelectConfirm();
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
	public SelectConfirm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1203, 728);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u501F\u7528\u5DE5\u5177\u5217\u8868");
		label.setBounds(182, 15, 124, 38);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(15, 56, 460, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(15, 119, 460, 38);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(15, 185, 460, 38);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(15, 256, 460, 38);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(15, 330, 460, 38);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(15, 398, 460, 38);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(15, 470, 460, 38);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(15, 535, 460, 38);
		frame.getContentPane().add(textField_7);
		
		JTextArea pageNum = new JTextArea();
		pageNum.setEditable(false);
		pageNum.setBounds(25, 588, 140, 38);
		frame.getContentPane().add(pageNum);
		
		JButton lastPage = new JButton("\u4E0A\u4E00\u9875");
		lastPage.setBounds(188, 593, 123, 29);
		frame.getContentPane().add(lastPage);
		
		JButton nextPage = new JButton("\u4E0B\u4E00\u9875");
		nextPage.setBounds(352, 593, 123, 29);
		frame.getContentPane().add(nextPage);
		
		JButton button = new JButton("");
		button.setBounds(484, 0, 33, 672);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("\u501F\u7528\u65F6\u95F4\uFF1A");
		lblNewLabel.setBounds(572, 64, 90, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u501F\u7528\u4EBA\uFF1A");
		label_1.setBounds(572, 127, 90, 38);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u53D1\u653E\u4EBA\uFF1A");
		label_2.setBounds(572, 200, 90, 38);
		frame.getContentPane().add(label_2);
		
		borrowTime = new JTextField();
		borrowTime.setBounds(683, 60, 255, 45);
		frame.getContentPane().add(borrowTime);
		borrowTime.setColumns(10);
		
		borrower = new JTextField();
		borrower.setColumns(10);
		borrower.setBounds(683, 126, 255, 45);
		frame.getContentPane().add(borrower);
		
		giver = new JTextField();
		giver.setColumns(10);
		giver.setBounds(683, 197, 255, 45);
		frame.getContentPane().add(giver);
		
		JButton confirm = new JButton("\u786E\u8BA4\u501F\u51FA");
		confirm.setBounds(611, 275, 123, 29);
		frame.getContentPane().add(confirm);
		
		JButton cancel = new JButton("\u53D6\u6D88");
		cancel.setBounds(787, 275, 123, 29);
		frame.getContentPane().add(cancel);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE\u7EE7\u7EED\u501F");
		btnNewButton.setBounds(950, 275, 201, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
