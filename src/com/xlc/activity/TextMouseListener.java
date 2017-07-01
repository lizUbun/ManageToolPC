package com.xlc.activity;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;

public class TextMouseListener implements MouseListener {

	JTextArea jta = null;
	public TextMouseListener(JTextArea jta) {
		this.jta = jta;
	}
	@Override
	public void mouseClicked(MouseEvent e) {

		if(jta.getBackground() == Color.GREEN){
			jta.setBackground(Color.WHITE);
		}else{
			jta.setBackground(Color.GREEN);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
