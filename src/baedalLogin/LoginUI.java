package baedalLogin;

import java.awt.BorderLayout;
import java.awt.Canvas;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginUI extends JFrame implements ActionListener {
      	public static void main(String[] args) {
			LoginUI login = new LoginUI();
			
      	}
      	private static final long serialVersionUID = 1L;  // 직렬화
      	JLabel lblUserid = new JLabel("아이디");
  		JLabel lblPassword = new JLabel("비밀번호");
  		JTextField txtUserid = new JTextField(20);
  		JTextField txtPassword = new JTextField(20);
  		JButton btnLogin = new JButton("로그인");
  		JTextArea area;
      	
      	public LoginUI() {
      	JPanel jp = new JPanel(); 
      	jp.setSize(200,200); // width, height
      	jp.add(lblUserid,"North");
      	jp.add(txtUserid);
      	jp.add(lblPassword,"South");
      	jp.add(txtPassword);
      	jp.add(btnLogin);
      	this.add(jp);
      	this.setResizable(true); // 창의 크기를 변경시키는 것이 불가함
      	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임에 닫기 버튼 장착
      	this.setBounds(200,200,700,400);
      	this.setVisible(true);
		}
      	

		public void actionPerformed1(ActionEvent e) {
			String command = e.getActionCommand();
      		switch (command) {
      		case "입장":this.connect();break;
      		

      		default:break;
			
		}
  	
 }

		private void connect() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}