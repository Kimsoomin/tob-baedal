package baedalMenu;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;


import javax.swing.*;

import baedalOrder.OrderUI;

public class MenuUI extends JFrame implements ActionListener {
	public static void main(String[] args) {
		MenuUI ui = new MenuUI();

	}

	private static final long serialVersionUID = 1L;
	MenuUIPanel pan;
	
	public MenuUI() {
		init();
	}

	private void init() {
		// 부품준비!
		this.setTitle("배달의 기수");
		pan = new MenuUIPanel();
		this.add(pan);
		// 조합!
		this.setBounds(100, 50, 1400, 800);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = this.getSize();
		int xpos = (int) (screen.getWidth()/2-frm.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp = (JButton) e.getSource();
		pan = new MenuUIPanel();
		if (temp.equals(pan.btnget1)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		} else if (temp.equals(pan.btnget2)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		} else if (temp.equals(pan.btnget3)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		}else if (temp.equals(pan.btnget4)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		}else if (temp.equals(pan.btnget5)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		}else if (temp.equals(pan.btnget6)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		}else if (temp.equals(pan.btnget7)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		}else if (temp.equals(pan.btnget8)) {
			this.getContentPane().removeAll();
			this.repaint();
			OrderUI ui = new OrderUI();
		}
	} 
}