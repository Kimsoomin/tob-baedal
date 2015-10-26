package baedalLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class JoinUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtUserid;
	private JTextField txtPassword;
	private JTextField txtName;
	private JTextField txtNum;
	private JTextField txtAddr;
	private JTextField txtHint;
	private JTextField txtAnswer;
	private JTextField txtBirth;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinUI frame = new JoinUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public JoinUI(){
      		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setBounds(100, 100, 305, 573);
    		contentPane = new JPanel();
    		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    		setContentPane(contentPane);
    		contentPane.setLayout(null);
    		
    		JPanel panel = new JPanel();
    		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
    		panel.setBounds(0, 0, 289, 535);
    		contentPane.add(panel);
    		panel.setLayout(null);
    	 
    		textField = new JTextField();
    		textField.setEnabled(false);
    		textField.setEditable(false);
    		textField.setFont(new Font("굴림체", Font.BOLD, 15));
    		textField.setText("\uD68C \uC6D0 \uAC00 \uC785");
    		textField.setBounds(97, 21, 116, 31);
    		panel.add(textField);
    		textField.setColumns(10);
    		
    		txtUserid = new JTextField();
    		txtUserid.setEnabled(false);
    		txtUserid.setEditable(false);
    		txtUserid.setText("  ID :");
    		txtUserid.setBounds(51, 69, 33, 21);
    		panel.add(txtUserid);
    		txtUserid.setColumns(10);
    		
    		txtUserid = new JTextField();
    		txtUserid.setBounds(123, 69, 116, 21);
    		panel.add(txtUserid);
    		txtUserid.setColumns(10);
    		
    		JButton btnIDCheck = new JButton("중복체크");
    		btnIDCheck.setBounds(123, 100, 116, 23);
    		panel.add(btnIDCheck);
    		
    		txtPassword = new JTextField();
    		txtPassword.setText("    PW :");
    		txtPassword.setEnabled(false);
    		txtPassword.setEditable(false);
    		txtPassword.setColumns(10);
    		txtPassword.setBounds(51, 133, 33, 21);
    		panel.add(txtPassword);
    		
    		txtPassword = new JTextField();
    		txtPassword.setColumns(10);
    		txtPassword.setBounds(123, 133, 116, 21);
    		panel.add(txtPassword);
    		
    		txtName = new JTextField();
    		txtName.setText("  Name :");
    		txtName.setEnabled(false);
    		txtName.setEditable(false);
    		txtName.setColumns(10);
    		txtName.setBounds(51, 172, 45, 21);
    		panel.add(txtName);
    		
    		txtName = new JTextField();
    		txtName.setColumns(10);
    		txtName.setBounds(123, 172, 116, 21);
    		panel.add(txtName);
    		
    		txtNum = new JTextField();
    		txtNum.setText("  Numb :");
    		txtNum.setEnabled(false);
    		txtNum.setEditable(false);
    		txtNum.setColumns(10);
    		txtNum.setBounds(51, 206, 45, 21);
    		panel.add(txtNum);
    		
    		txtNum = new JTextField();
    		txtNum.setColumns(10);
    		txtNum.setBounds(123, 206, 116, 21);
    		panel.add(txtNum);
    		
    		txtAddr = new JTextField();
    		txtAddr.setText("  Addr :");
    		txtAddr.setEnabled(false);
    		txtAddr.setEditable(false);
    		txtAddr.setColumns(10);
    		txtAddr.setBounds(51, 273, 51, 21);
    		panel.add(txtAddr);
    		
    		txtAddr = new JTextField();
    		txtAddr.setColumns(10);
    		txtAddr.setBounds(123, 273, 116, 21);
    		panel.add(txtAddr);
    		
    		txtHint = new JTextField();
    		txtHint.setText("  Hint :");
    		txtHint.setEnabled(false);
    		txtHint.setEditable(false);
    		txtHint.setColumns(10);
    		txtHint.setBounds(51, 311, 33, 21);
    		panel.add(txtHint);
    		
    		txtHint = new JTextField();
    		txtHint.setColumns(10);
    		txtHint.setBounds(123, 311, 116, 21);
    		panel.add(txtHint);
    		
    		txtAnswer = new JTextField();
    		txtAnswer.setText("  Answ :");
    		txtAnswer.setEnabled(false);
    		txtAnswer.setEditable(false);
    		txtAnswer.setColumns(10);
    		txtAnswer.setBounds(51, 347, 51, 21);
    		panel.add(txtAnswer);
    		
    		txtAnswer = new JTextField();
    		txtAnswer.setColumns(10);
    		txtAnswer.setBounds(123, 347, 116, 21);
    		panel.add(txtAnswer);
    		
    		txtBirth = new JTextField();
    		txtBirth.setText("Birth :");
    		txtBirth.setEnabled(false);
    		txtBirth.setEditable(false);
    		txtBirth.setColumns(10);
    		txtBirth.setBounds(51, 387, 45, 21);
    		panel.add(txtBirth);
    		
    		txtBirth = new JTextField();
    		txtBirth.setColumns(10);
    		txtBirth.setBounds(123, 387, 116, 21);
    		panel.add(txtBirth);
    		
    		JButton btnJoin = new JButton("\uAC00\uC785");
    		btnJoin.setBounds(51, 465, 73, 23);
    		panel.add(btnJoin);
    		
    		JButton btnCancel = new JButton("\uCDE8\uC18C");
    		btnCancel.setBounds(166, 465, 73, 23);
    		panel.add(btnCancel);
      	}
} 
