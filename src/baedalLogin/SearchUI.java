package baedalLogin;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchUI extends JFrame implements ActionListener,Runnable{

	public static void main(String[] args) {
		SearchUI search = new SearchUI();
		
	}
	
	private static final long serialVersionUID = 1L;
	Canvas canvas;
	BufferStrategy strategy;
	BufferedImage image;
	JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8,jp9,jp10,jpb1,jpb2;
	
	JLabel lblIdsearch  = new JLabel("ID 찾기");
	JLabel lblName = new JLabel("이름");
	JLabel lblBirth = new JLabel("생년월일");
	JLabel lblPasssearch = new JLabel("PAWD찾기");
	JLabel lblId = new JLabel("ID");
	JLabel lblQue = new JLabel("비밀번호찾기 질문");
	JLabel lblAn = new JLabel("답변");
	JTextField txtName = new JTextField(10);
	JTextField txtBirth = new JTextField(10);
	JTextField txtId = new JTextField(20);
	JTextField txtQue = new JTextField(30);
	JTextField txtAn = new JTextField(30);
	JButton a = new JButton("왼쪽");
	JButton b = new JButton("오른쪽");
	
	
	//JLabel lblName, lblBirth, lblId, lblQue, lblAn;
	//JButton btnId, btnName, btnBirth, btnPass, btnQue,btnAn;
	//JPanel panelNorth,panelCenter,panelSouth;
	//JTextArea area;
	//JTextField txtName, txtBirth, txtId, txtQue, txtAn;
	//JList list;
	//JTextArea txt;
	//JButton btn;
	
	public SearchUI() {
		jpb1 = new JPanel();
		jpb2 = new JPanel();
		jp = new JPanel();
    	jp1 = new JPanel();
	    jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jp5 = new JPanel();
		jp6 = new JPanel();
		jp7 = new JPanel();
		jp8 = new JPanel();
		jp9 = new JPanel();
		jp10 = new JPanel();
		
		//this.add(big1);
		//this.add(big2);
		jp.setSize(200,200);
		
		jpb1.add(lblName,"West");
		jp.add(lblIdsearch,"Center");
		jp.add(lblName,"Center");
		jp.add(txtName);
		jp.add(lblBirth,"Center");
		jp.add(txtBirth);
		jp.add(lblPasssearch,"Center");
		jp.add(lblId,"South");
		jp.add(txtId);
		jp.add(lblQue,"South");
		jp.add(txtQue);
		jp.add(lblAn,"South");
		jp.add(txtAn);
		jpb1.add(lblIdsearch);
		jpb1.add(a);
		jpb1.add(txtName);
		jpb1.add(lblBirth);
		jpb1.add(txtBirth);
		jpb2.add(lblPasssearch);
		jpb2.add(b);
		this.setLayout(new FlowLayout());
		this.add(jpb1);
		this.add(jpb2);
		
	
	
		
		this.setTitle("배달의기수");
		
		
		this.setBounds(100,50,1400,800);
		this.setVisible(true);
	}
	
	
	public void inin(){
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
