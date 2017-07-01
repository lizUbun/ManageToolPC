package com.xlc.activity;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class LookTool {

	private JFrame frame;
	private JTextField searchContent;
	private JTextField test1;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextArea textArea;
	private MouseListener mouseListener;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private JTextArea textArea_4;
	private JTextArea textArea_5;
	private JTextArea textArea_6;
	private JTextArea textArea_7;
	private JButton nextPage;
	private JButton lastPage;
	private JTextField pageNum;
	private JButton imag;
	private JButton addToCar;
	private JButton confirmSelect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LookTool window = new LookTool();
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
	public LookTool() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(600, 100, 1207, 723);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		searchContent = new JTextField();
		searchContent.setBounds(15, 15, 287, 27);
		frame.getContentPane().add(searchContent);
		searchContent.setColumns(10);
		
		JButton search = new JButton("\u641C\u7D22");
		search.setBounds(317, 14, 123, 29);
		frame.getContentPane().add(search);
		
		textArea = new JTextArea();
		textArea.setBounds(15, 68, 453, 24);
		textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		mouseListener = new TextMouseListener(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(15, 107, 453, 24);
		frame.getContentPane().add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(15, 146, 453, 24);
		frame.getContentPane().add(textArea_2);
		
		textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setBounds(15, 185, 453, 24);
		frame.getContentPane().add(textArea_3);
		
		textArea_4 = new JTextArea();
		textArea_4.setEditable(false);
		textArea_4.setBounds(15, 224, 453, 24);
		frame.getContentPane().add(textArea_4);
		
		textArea_5 = new JTextArea();
		textArea_5.setEditable(false);
		textArea_5.setBounds(15, 263, 453, 24);
		frame.getContentPane().add(textArea_5);
		
		textArea_6 = new JTextArea();
		textArea_6.setEditable(false);
		textArea_6.setBounds(15, 302, 453, 24);
		frame.getContentPane().add(textArea_6);
		
		textArea_7 = new JTextArea();
		textArea_7.setEditable(false);
		textArea_7.setBounds(15, 341, 453, 24);
		frame.getContentPane().add(textArea_7);
		
		nextPage = new JButton("\u4E0B\u4E00\u9875");
		nextPage.setBounds(345, 417, 123, 29);
		frame.getContentPane().add(nextPage);
		
		lastPage = new JButton("\u4E0A\u4E00\u9875");
		lastPage.setBounds(200, 417, 123, 29);
		frame.getContentPane().add(lastPage);
		
		pageNum = new JTextField();
		pageNum.setEditable(false);
		pageNum.setEnabled(false);
		pageNum.setBounds(60, 418, 96, 27);
		frame.getContentPane().add(pageNum);
		pageNum.setColumns(10);
		
		imag = new JButton("");
		imag.setBounds(528, 28, 412, 355);
		frame.getContentPane().add(imag);
		
		addToCar = new JButton("加入选择清单");
		addToCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addToCar.setBounds(33, 495, 185, 29);
		frame.getContentPane().add(addToCar);
		
		confirmSelect = new JButton("\u6DFB\u52A0\u5B8C\u6210");
		confirmSelect.setBounds(290, 495, 123, 29);
		frame.getContentPane().add(confirmSelect);
//		
//		textField_0 = new JTextField();
//		textField_1 = new JTextField();
//		textField_2 = new JTextField();
//		textField_3 = new JTextField();
//		textField_4 = new JTextField();
//		textField_5 = new JTextField();
//		textField_6 = new JTextField();
//		textField_7 = new JTextField();
//		ArrayList<JTextField> textList = new ArrayList();
//		textList.add(textField_0);
//		textList.add(textField_1);
//		textList.add(textField_2);
//		textList.add(textField_3);
//		textList.add(textField_4);
//		textList.add(textField_5);
//		textList.add(textField_6);
//		textList.add(textField_7);
//		int x0 = 15;
//		int y0 = 55;
//		int distence = 20;
//		for (int i = 0; i < textList.size(); i++) {
//			textList.get(i).setBounds(x0, y0 + i * 46 + i * distence, 537, 46);
//			frame.getContentPane().add(textList.get(i));
//			textList.get(i).setColumns(10);
//			textList.get(i).setFont(new Font(null, Font.PLAIN,20));
//		}
//		
//		textList.get(0).addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("click ... text list 0 ");
//			}
//		});
//		
//		
		textArea.addMouseListener(mouseListener);
		
		
	}
}
