package baedalFirst;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import baedalStore.StoreUI;

public class FisrtUI extends JFrame implements ActionListener{
	public static void main(String[] args) {
		FisrtUI ui = new FisrtUI();
	}

	private static final long serialVersionUID = 1L;
	Canvas canvas;
	JButton btnHan,btnJoong,btnIl,btnChi,btnPi,btnBo;
	JPanel panelNorth, panelCenter,panelSouth;
	ImageIcon icon;
	
	
	
	public FisrtUI() {
		init();
		
	}
	public void init(){
		this.setTitle("배달의기수");
		panelNorth = new JPanel();
		panelCenter = new JPanel();
		panelSouth = new JPanel();
		btnHan = new JButton("한식");
		btnHan.setIcon(new ImageIcon("src/image/Han.jpg"));
		btnJoong = new JButton("중식");
		btnJoong.setIcon(new ImageIcon("src/image/Joong.jpg"));
		btnIl = new JButton("일식");
		btnIl.setIcon(new ImageIcon("src/image/il.gif"));
		btnChi = new JButton("치킨");
		btnChi.setIcon(new ImageIcon("src/image/Chi.jpg"));
		btnPi = new JButton("피자");
		btnPi.setIcon(new ImageIcon("src/image/Pi.jpg"));
		btnBo = new JButton("보쌈,족발");
		btnBo.setIcon(new ImageIcon("src/image/Bo.gif"));
		btnHan.addActionListener(this);
		btnJoong.addActionListener(this);
		btnIl.addActionListener(this);
		btnChi.addActionListener(this);
		btnPi.addActionListener(this);
		btnBo.addActionListener(this);
		panelCenter.add(btnHan);
		panelCenter.add(btnJoong);
		panelCenter.add(btnIl);
		panelSouth.add(btnChi);
		panelSouth.add(btnPi);
		panelSouth.add(btnBo);
		panelNorth.setPreferredSize(new Dimension(200, 100));
		panelCenter.setPreferredSize(new Dimension(700, 350));
		panelSouth.setPreferredSize(new Dimension(700, 350));
		this.add(panelNorth, BorderLayout.NORTH);
		this.add(panelCenter, BorderLayout.CENTER);
		this.add(panelSouth, BorderLayout.SOUTH);
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
		if (temp.equals(btnHan)) {
			this.getContentPane().removeAll();
			this.repaint();
			StoreUI ui = new StoreUI();
		} else if (temp.equals(btnJoong)) {
			this.getContentPane().removeAll();
			this.repaint();
			StoreUI ui = new StoreUI();
		}else if (temp.equals(btnIl)) {
			this.getContentPane().removeAll();
			this.repaint();
			StoreUI ui = new StoreUI();
		}else if (temp.equals(btnChi)) {
			this.getContentPane().removeAll();
			this.repaint();
			StoreUI ui = new StoreUI();
		}else if (temp.equals(btnPi)) {
			this.getContentPane().removeAll();
			this.repaint();
			StoreUI ui = new StoreUI();
		}else if (temp.equals(btnBo)) {
			this.getContentPane().removeAll();
			this.repaint();
		}
		
	
		
	}

}
