package baedalMenu;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class MenuUI extends JFrame implements ActionListener {
	public static void main(String[] args) {
		MenuUI ui = new MenuUI();

	}

	private static final long serialVersionUID = 1L;
	Canvas Canvas;
	ImageIcon icon;
	JPanel panelNorth, panelSouth;
	JLabel lblBN;
	JButton btnPut1, btnPut2, btnPut3, btnPut4, btnPut5, btnPut6, btnPut7, btnPut8;
	JMenu menu;
	JMenuBar bar;
	BufferedReader in;
	List<JButton> btns;

	public MenuUI() {
		init();
	}

	private void init() {
		// 부품준비!
		this.setTitle("배달의 기수");
		btns = new ArrayList<JButton>();
		panelNorth = new JPanel();
		panelSouth = new JPanel();
		btnPut1 = new JButton(new ImageIcon("src/baedalMenu/hansic/1.jpg"));
		btnPut2 = new JButton(new ImageIcon("src/baedalMenu/hansic/2.jpg"));
		btnPut3 = new JButton(new ImageIcon("src/baedalMenu/hansic/3.jpg"));
		btnPut4 = new JButton(new ImageIcon("src/baedalMenu/hansic/4.jpg"));
		btnPut5 = new JButton(new ImageIcon("src/baedalMenu/hansic/5.jpg"));
		btnPut6 = new JButton(new ImageIcon("src/baedalMenu/hansic/6.jpg"));
		btnPut7 = new JButton(new ImageIcon("src/baedalMenu/hansic/7.png"));
		btnPut8 = new JButton(new ImageIcon("src/baedalMenu/hansic/8.png"));

		// 조합!
		

		btnPut1.addActionListener(this);
		btnPut2.addActionListener(this);
		btnPut3.addActionListener(this);
		btnPut4.addActionListener(this);
		btnPut5.addActionListener(this);
		btnPut6.addActionListener(this);
		btnPut7.addActionListener(this);
		btnPut8.addActionListener(this);
		panelNorth.add(btnPut1);
		panelNorth.add(btnPut2);
		panelNorth.add(btnPut3);
		panelNorth.add(btnPut4);
		panelSouth.add(btnPut5);
		panelSouth.add(btnPut6);
		panelSouth.add(btnPut7);
		panelSouth.add(btnPut8);

		this.add(panelNorth, BorderLayout.NORTH);
		this.add(panelSouth, BorderLayout.SOUTH);
		btnPut1.setPreferredSize(new Dimension(300, 212));
		btnPut2.setPreferredSize(new Dimension(300, 212));
		btnPut3.setPreferredSize(new Dimension(300, 212));
		btnPut4.setPreferredSize(new Dimension(300, 212));
		btnPut5.setPreferredSize(new Dimension(300, 212));
		btnPut6.setPreferredSize(new Dimension(300, 212));
		btnPut7.setPreferredSize(new Dimension(300, 212));
		btnPut8.setPreferredSize(new Dimension(300, 212));
		this.setBounds(100, 50, 1400, 800);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp = (JButton) e.getSource();
		if (temp.equals(btnPut1)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnPut2)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnPut3)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnPut4)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnPut5)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnPut6)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnPut7)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnPut8)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		}
	}
}