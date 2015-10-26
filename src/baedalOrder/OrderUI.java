package baedalOrder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OrderUI extends JFrame implements ActionListener {
	protected JButton b1, b2, b3, b4, b5, b6, b7, b8;
	protected JPanel jpSouth, jpNorth, jpTop;
	
	public static void main(String[] args) {
		OrderUI ui = new OrderUI();
	}
	
	
	
	
	public OrderUI() {
		/*
		 * ImageIcon[] temp = new ImageIcon[8]; for (int i = 1; i < 9; i++) {
		 * temp[i]= new ImageIcon("src/한식종류/i.png"); }
		 */
		
		
		
		jpNorth = new JPanel();
	
		ImageIcon top1ButtonIcon = new ImageIcon("src/OrderUI/image/han/1.png");
		ImageIcon top2ButtonIcon = new ImageIcon("src/OrderUI/image/han/2.png");
		ImageIcon top3ButtonIcon = new ImageIcon("src/OrderUI/image/han/3.png");
		ImageIcon top4ButtonIcon = new ImageIcon("src/OrderUI/image/han/4.png");

		jpSouth = new JPanel();
		ImageIcon bot5ButtonIcon = new ImageIcon("src/OrderUI/image/han/5.png");
		ImageIcon bot6ButtonIcon = new ImageIcon("src/OrderUI/image/han/6.png");
		ImageIcon bot7ButtonIcon = new ImageIcon("src/OrderUI/image/han/7.png");
		ImageIcon bot8ButtonIcon = new ImageIcon("src/OrderUI/image/han/8.png");

		
		b1 = new JButton(top1ButtonIcon);
		b1.setPreferredSize(new Dimension(300, 212));
		b1.setVerticalTextPosition(AbstractButton.TOP);
		b1.setHorizontalTextPosition(AbstractButton.CENTER);
		b1.setMnemonic(KeyEvent.VK_A);
		b1.setActionCommand("able");

		b2 = new JButton(top2ButtonIcon);
		b2.setPreferredSize(new Dimension(300, 212));
		b2.setVerticalTextPosition(AbstractButton.TOP);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		b2.setMnemonic(KeyEvent.VK_B);
		b2.setActionCommand("able2");

		b3 = new JButton(top3ButtonIcon);
		// Use the default text position of CENTER, TRAILING (RIGHT).
		b3.setPreferredSize(new Dimension(300, 212));
		b3.setVerticalTextPosition(AbstractButton.TOP);
		b3.setHorizontalTextPosition(AbstractButton.CENTER);
		b3.setMnemonic(KeyEvent.VK_C);
		b3.setActionCommand("able3");
		/* b3.setActionCommand("enable"); */
		/* b3.setEnabled(false); */

		b4 = new JButton(top4ButtonIcon);
		b4.setPreferredSize(new Dimension(300, 212));
		b4.setVerticalTextPosition(AbstractButton.TOP);
		b4.setHorizontalTextPosition(AbstractButton.CENTER);
		b4.setMnemonic(KeyEvent.VK_D);
		b4.setActionCommand("able4");

		/* FlowLayout fa = new FlowLayout(FlowLayout.RIGHT); */
		b5 = new JButton(bot5ButtonIcon);
		b5.setPreferredSize(new Dimension(300, 212));
		b5.setVerticalTextPosition(AbstractButton.BOTTOM);
		b5.setHorizontalTextPosition(AbstractButton.CENTER);
		b5.setMnemonic(KeyEvent.VK_E);
		b5.setActionCommand("able5");

		b6 = new JButton(bot6ButtonIcon);
		b6.setPreferredSize(new Dimension(300, 212));
		b6.setVerticalTextPosition(AbstractButton.BOTTOM);
		b6.setHorizontalTextPosition(AbstractButton.CENTER);
		b6.setMnemonic(KeyEvent.VK_E);
		b6.setActionCommand("able6");

		b7 = new JButton(bot7ButtonIcon);
		b7.setPreferredSize(new Dimension(300, 212));
		b7.setVerticalTextPosition(AbstractButton.BOTTOM);
		b7.setHorizontalTextPosition(AbstractButton.CENTER);
		b7.setMnemonic(KeyEvent.VK_E);
		b7.setActionCommand("able7");

		b8 = new JButton(bot8ButtonIcon);
		b8.setPreferredSize(new Dimension(300, 212));
		b8.setVerticalTextPosition(AbstractButton.BOTTOM);
		b8.setHorizontalTextPosition(AbstractButton.CENTER);
		b8.setMnemonic(KeyEvent.VK_E);
		b8.setActionCommand("able8");

		// Listen for actions on buttons 1 and 3.
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);

		/*
		 * b1.setToolTipText("Click this button to disable the middle button.");
		 * b2.setToolTipText(
		 * "This middle button does nothing when you click it.");
		 * b3.setToolTipText("Click this button to enable the middle button.");
		 */

		// Add Components to this container, using the default FlowLayout.
		jpNorth.add(b1);
		jpNorth.add(b2);
		jpNorth.add(b3);
		jpNorth.add(b4);
		jpSouth.add(b5);
		jpSouth.add(b6);
		jpSouth.add(b7);
		jpSouth.add(b8);

		this.add(jpNorth, BorderLayout.NORTH);
		this.add(jpSouth, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Display the window.
		
		this.pack();
		this.setBounds(100, 50, 1400, 800);
		this.setTitle("배달의 기수");
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "able":
			b1.setEnabled(false);
			break;
		case "able2":
			b2.setEnabled(false);
			/*b1.setEnabled(true);*/
			break;
		case "able3":
			b3.setEnabled(false);
			break;
		case "able4":
			b4.setEnabled(false);
			break;
		case "able5":
			b5.setEnabled(false);
			break;
		case "able6":
			b6.setEnabled(false);
			break;
		case "able7":
			b7.setEnabled(false);
			break;
		case "able8":
			b8.setEnabled(false);
			break;

		default:
			break;
		}
	}

	/** Returns an ImageIcon, or null if the path was invalid. *//*
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = StoreUI.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("파일의 경로가 잘못 되었습니다. : " + path);
			return null;
		}
	}*/


}