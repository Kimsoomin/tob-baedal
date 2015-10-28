package baedalLogin;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class  JoinUI extends JFrame implements ActionListener{

	
	   private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	   JoinUI join = new JoinUI();
	}
	public JoinUI() {
	   
	  
	   JMenuBar menubar = new JMenuBar();
	   JMenu file = new JMenu("언제나,   어디서나,   배달의   자유를   위해   배달의   기수는   오늘도   달립니다");
	   menubar.add( file);
	   this.setJMenuBar( menubar);

	   JComboBox combo = new JComboBox();
	   JPanel overjpan=new JPanel();
	   JPanel westjpan=new JPanel();
	   JPanel eastjpan=new JPanel();
	   JPanel southjpan=new JPanel();
	   JPanel jpan=new JPanel();
	   JTextField userIdt=new JTextField();
	   JTextField passwordt=new JTextField();
	   JTextField namet=new JTextField();
	   JTextField birtht=new JTextField();
	   JTextField addrt=new JTextField();
	   JTextField phonet=new JTextField();
	   JTextField hintt=new JTextField();
	   JTextField answert=new JTextField();
	   JLabel formlabel= new JLabel("회원가입",JLabel.CENTER);
	     
	   JButton resulton=new JButton("회원가입");
	   JButton cn=new JButton("취소");
	   
	    overjpan.setPreferredSize(new Dimension(250,35));
	    westjpan.setPreferredSize(new Dimension(10,235));
	    eastjpan.setPreferredSize(new Dimension(10,235));
	    southjpan.setPreferredSize(new Dimension(250,10));
	    overjpan.add(formlabel);
	    this.add(BorderLayout.NORTH,overjpan);
	    this.add(BorderLayout.WEST,westjpan);
	    this.add(BorderLayout.EAST,eastjpan);
	    this.add(BorderLayout.SOUTH,southjpan);

	   JLabel userId= new JLabel("아이디",JLabel.CENTER);
	   JLabel password=new JLabel("비밀번호",JLabel.CENTER);
	   JLabel name=new JLabel("이름",JLabel.CENTER);
	   JLabel birth=new JLabel("생년월일",JLabel.CENTER);
	   JLabel addr=new JLabel("주소",JLabel.CENTER);
	   JLabel phone=new JLabel("휴대폰",JLabel.CENTER);
	   JLabel hint=new JLabel("힌트",JLabel.CENTER);
	   JLabel answer=new JLabel("답변",JLabel.CENTER);
	   JLabel empty=new JLabel();
	   JLabel empty1=new JLabel();
	   JLabel empty2=new JLabel();
	   JLabel empty3=new JLabel();
	   JLabel empty4=new JLabel();
	   JLabel empty5=new JLabel();
	   JLabel empty6=new JLabel();
	   JLabel empty7=new JLabel();
	   JLabel empty8=new JLabel();
	   JLabel empty9=new JLabel();
	   GridLayout g1=new GridLayout(10,3);
	   g1.setHgap(5);
	   g1.setVgap(5);
	   jpan.setLayout(g1);
	   JButton conform=new JButton("중복확인");
	   jpan.add(userId);
	   jpan.add(userIdt);
	   jpan.add(conform);
	   jpan.add(password);
	   jpan.add(passwordt);
	   jpan.add(empty);
	   jpan.add(name);
	   jpan.add(namet);
	   jpan.add(empty1);
	   jpan.add(birth);
	   jpan.add(birtht);
	   jpan.add(empty2);
	   jpan.add(addr);
	   jpan.add(addrt);
	   jpan.add(empty3);
	   jpan.add(phone);
	   jpan.add(phonet);
	   jpan.add(empty4);
	   jpan.add(hint);
	   jpan.add(combo);
	   combo.addItem("첫 강아지");
	   combo.addItem("첫 학교");     
	   combo.addItem("첫 사랑");     
	   combo.addItem("태어난곳");     
	   combo.addItem("첫친구");
	   combo.setEditable(true);
	   jpan.add(empty5);
	   jpan.add(answer);
	   jpan.add(answert);
	   jpan.add(empty6);
	   jpan.add(empty7);
	   jpan.add(resulton);
	   jpan.add(cn);
	   jpan.add(empty8);
	   this.add(BorderLayout.CENTER,jpan);
	   
	   JLabel statusbar = new JLabel("Copyright by. 배달의 기수");
	   statusbar.setPreferredSize(new Dimension(10, 20));
	   statusbar.setBorder(LineBorder.createBlackLineBorder());
	   this.add(statusbar, BorderLayout.SOUTH);
	   conform.addActionListener(this);
	   resulton.addActionListener(this);
	   cn.addActionListener(this);
	   this.setTitle("배달의 기수");
	   this.setBounds(new Rectangle(600,400));
	   this.setVisible(true);
	   

	   }


	@Override
	public void actionPerformed(ActionEvent arg0) {
	   // TODO Auto-generated method stub
	  
	}
	}