package com.xlc.activity;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Longin {

	private JFrame frame;
	private JTextField passWord;
	private JTextField textField_1;
	public LookTool look;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Longin window = new Longin();
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
	public Longin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u767B\u9646\u4EBA\uFF1A");
		lblNewLabel.setBounds(74, 59, 81, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setBounds(74, 95, 81, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton sure = new JButton("\u786E\u8BA4");
		sure.setBounds(81, 149, 123, 29);
		frame.getContentPane().add(sure);
		
		JButton cancel = new JButton("\u53D6\u6D88");
		cancel.setBounds(255, 149, 123, 29);
		frame.getContentPane().add(cancel);
		
		passWord = new JTextField();
		passWord.setBounds(170, 56, 170, 27);
		frame.getContentPane().add(passWord);
		passWord.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 92, 170, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		passWord.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		sure.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(look == null){
					look = new LookTool();
					System.out.println("sure ... ");
				}
				
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
	}
}
