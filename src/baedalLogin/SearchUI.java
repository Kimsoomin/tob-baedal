package baedalLogin;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class SearchUI extends JFrame implements ActionListener,Runnable{

	
		private static final long serialVersionUID = 1L;
		
		public static void main(String[] args) {
			SearchUI search = new SearchUI();
	}
	public SearchUI() {
		Canvas canvas;
		BufferStrategy strategy;
		BufferedImage image;
		JPanel jp,jpIdsc,jpName,jpBirth,jpIde,jpPwsc,jpId,jpQue,jpAn,jpPwe;
		JButton btnIde, btnPwe;
		JLabel lblIdsc,lblName,lblBirth,lblPwsc,lblId,lblQue,lblAn;
		JTextField txtName, txtBirth, txtId, txtQue, txtAn;
		JComboBox combo;
	
		this.setTitle("배달의 기수");
		
		   JMenuBar menubar = new JMenuBar();
		   JMenu file = new JMenu("언제나,  어디서나,  우리는  배달의 기수");
		   menubar.add( file);
		   this.setJMenuBar( menubar);
		lblName = new JLabel("  이름      ");
		lblBirth = new JLabel("생년월일");
		lblId = new JLabel("     ID        ");
		lblQue = new JLabel("    질문      ");
		lblAn = new JLabel("   답변      ");
		txtName = new JTextField(11);
		txtBirth = new JTextField(11);
		txtId = new JTextField(11);
		txtQue = new JTextField(11);
		txtAn = new JTextField(11);
		btnIde = new JButton("확인");
		btnPwe = new JButton("확인");
		lblIdsc = new JLabel("ID찾기");
		lblPwsc = new JLabel("PW찾기");
		jp = new JPanel();
		jpIdsc = new JPanel();
		jpName = new JPanel();
		jpBirth = new JPanel();
		jpPwsc = new JPanel();
		jpId = new JPanel();
		jpQue = new JPanel();
		jpAn = new JPanel();
		jpIde = new JPanel();
		jpPwe = new JPanel();
		jp.setLayout(new GridLayout(9, 1));
		combo = new JComboBox();
		jpIdsc.add(lblIdsc);
		jpName.add(lblName);
		jpName.add(txtName);
		jpBirth.add(lblBirth);
		jpBirth.add(txtBirth);
		jpIde.add(btnIde);
		jpPwsc.add(lblPwsc);
		jpId.add(lblId);
		jpId.add(txtId);
		jpQue.add(lblQue);
		jpQue.add(combo);
		combo.addItem("첫 강아지");		
		combo.addItem("첫 학교");		
		combo.addItem("첫 사랑");		
		combo.addItem("태어난곳");		
		combo.addItem("첫친구");
		combo.setEditable(true);
		jpAn.add(lblAn);
		jpAn.add(txtAn);
		jpPwe.add(btnPwe);
		jp.add(jpIdsc);
		jp.add(jpName);
		jp.add(jpBirth);
		jp.add(jpIde);
		jp.add(jpPwsc);
		jp.add(jpId);
		jp.add(jpQue);
		jp.add(jpAn);
		jp.add(jpPwe);
		btnIde.addActionListener(this);
		btnPwe.addActionListener(this);
		this.add(jp);
		this.setBounds(100,50,400,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = this.getSize();
		int xpos = (int) (screen.getWidth()/2-frm.getWidth()/2);
		int ypos = (int) (screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(xpos,ypos);
		
		JLabel statusbar = new JLabel("Copyright by. 배달의 기수");
		statusbar.setPreferredSize(new Dimension(10, 20));
		statusbar.setBorder(LineBorder.createBlackLineBorder());
		this.add(statusbar, BorderLayout.SOUTH); 
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}