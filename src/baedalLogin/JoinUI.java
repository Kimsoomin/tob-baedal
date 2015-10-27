package baedalLogin;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JoinUI extends JFrame implements ActionListener{
   public static void main(String[] args) {
      JoinUI join = new JoinUI();
     
   }
   private static final long serialVersionUID = 1L;
   Canvas canvas;
   JPanel jp,jp1, jp2, jpId,jpIde,jpPw,jpName,jpBirth,jpAddr,jpHp,jpQue,jpAn,jpJo,jpCn;
   JButton btnIde, btnJo,btnCn;
   JLabel lbl1,lblId,lblPw,lblName,lblBirth,lblAddr,lblHp,lblQue,lblAn;
   JTextField txtId,txtPw,txtName,txtBirth,txtAddr,txtHp,txtQue,txtAn;
   JComboBox combo;

   public JoinUI() {
      this.setTitle("배달의기수");
      lbl1 = new JLabel("회원가입");
      lblId = new JLabel("ID        ");
      lblPw = new JLabel("PW        ");
      lblName = new JLabel("이름      ");
      lblBirth = new JLabel("생년월일");
      lblAddr = new JLabel("주소      ");
      lblHp = new JLabel("핸드폰  ");
      lblQue = new JLabel("질문      ");
      lblAn = new JLabel("답변      ");
      txtId = new JTextField(11);
      txtPw = new JTextField(11);
      txtName = new JTextField(11);
      txtBirth = new JTextField(11);
      txtAddr = new JTextField(11);
      txtHp = new JTextField(11);
      txtQue = new JTextField(11);
      txtAn = new JTextField(11);
      btnIde = new JButton("중복체크");
      btnJo = new JButton("가입");
      btnCn = new JButton("취소");
      jp = new JPanel();
      jp2 = new JPanel();
      jp1 = new JPanel();
      jpId = new JPanel();
      jpIde = new JPanel();
      jpPw = new JPanel();
      jpName = new JPanel();
      jpBirth = new JPanel();     
      jpAddr = new JPanel();
      jpHp = new JPanel();
      jpQue = new JPanel();
      jpAn = new JPanel();
      jpJo= new JPanel();
      jpCn = new JPanel();
      jp.setLayout(new GridLayout(10, 1));
      combo = new JComboBox();
      jp1.add(lbl1);
      jpId.add(lblId);                                   
      jpId.add(txtId);
      jpIde.add(btnIde);
      jpPw.add(lblPw);
      jpPw.add(txtPw);
      jpName.add(lblName);
      jpName.add(txtName);
      jpBirth.add(lblBirth);
      jpBirth.add(txtBirth);
      jpAddr.add(lblAddr);
      jpAddr.add(txtAddr);
      jpHp.add(lblHp);
      jpHp.add(txtHp);
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
      jpJo.add(btnJo);
      jpCn.add(btnCn);
      jp.add(jp1);
      jp.add(jpId);
      jp.add(jpIde);
      jp.add(jpPw);
      jp.add(jpName);
      jp.add(jpBirth);
      jp.add(jpAddr);
      jp.add(jpHp);
      jp.add(jpQue);
      jp.add(jpAn);
      jp2.add(jpJo);
      jp2.add(jpCn);
      
      /*
      jp.setBackground(Color.WHITE);
      jp1.setBackground(Color.WHITE);
      jp2.setBackground(Color.WHITE);
      jpId.setBackground(Color.WHITE);
      jpIde.setBackground(Color.WHITE);
      jpPw.setBackground(Color.WHITE);
      jpName.setBackground(Color.WHITE);
      jpBirth.setBackground(Color.WHITE);
      jpAddr.setBackground(Color.WHITE);
      jpHp.setBackground(Color.WHITE);
      jpQue.setBackground(Color.WHITE);
      jpAn.setBackground(Color.WHITE);
      jpJo.setBackground(Color.WHITE);
      jpCn.setBackground(Color.WHITE);
     */
      btnIde.addActionListener(this);
      btnJo.addActionListener(this);
      btnCn.addActionListener(this);
      combo.addActionListener(this);
     
      this.getContentPane().add(jp, "North");
      this.getContentPane().add(jp2, "South");
     
     
      this.add(jp);
      this.setBounds(100,50,400,500);
      Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = this.getSize();
		int xpos = (int) (screen.getWidth()/2-frm.getWidth()/2);
		int ypos = (int) (screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
      this.setVisible(true);
     
     
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      JComboBox cb = (JComboBox) e.getSource();
      String qs = (String) e.getSource();
      updateLabel(qs);
      String command = e.getActionCommand();
      switch (command) {
      case "중복체크":
        
         break;
      case "가입":
        
         break;
      case "취소": System.exit(0);;
         break;
        

      default:
         break;
      }
   }
   protected void updateLabel(String qs){
      switch (qs) {
      case "첫 강아지":
         break;
      case "첫 학교":
         break;
      case "첫 사랑":
         break;
      case "태어난곳":
         break;
      case "첫친구":
         break;

      default:
         break;
      }
   }
}
