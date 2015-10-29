package baedalOrder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class OrderUI extends JFrame implements ActionListener, Runnable{

	public static void main(String[] args) {
		OrderUI ui = new OrderUI();
	}
	private static final long serialVersionUID = 1L;

	
	JPanel panelW, panelWT, panelET, panelE, panelEN, panelEC, panelES, jp1, jp2;
	JPanel jp333333333333;
	JButton btnPay, btnPhonePay, btnList, btnMember; // 결제완료 버튼(로그인 페이지로 돌아감)
	JTextArea area;
	
	OrderService service = OrderServiceImpl.getService(); 
	public OrderUI() {
		init();
		//assembly();
	}
	
	public void assembly() {
		
	}

	public void init(){
		System.out.println("오더유아이넘겨옴");
		System.out.println("아이디");
		System.out.println(OrderVO.getUserid());
		System.out.println("시퀀스넘버");
		System.out.println(OrderVO.getseq());

		System.out.println("주문가격 : "+service.searchPrices(Integer.toString(OrderVO.getseq())));
		System.out.println("주문음식 : "+service.searchMenu(Integer.toString(OrderVO.getSeq())));
		
		String[] temp = service.searchMember(OrderVO.getUserid());
		for (int i = 0; i < temp.length; i++) {
			String nasdf = temp[i];
			System.out.println(temp[i]);
		}
		
		this.setTitle("주문정보확인");
		//pullMember = new PullMember(); // 주문한 회원 정보를 끌어다오는 객체 *만들어야함
		panelW = new JPanel(new BorderLayout());
		panelWT = new JPanel();
		panelE = new JPanel(new BorderLayout());
		panelET = new JPanel(new BorderLayout());
		panelEN = new JPanel();
		panelES = new JPanel();
		panelEC = new JPanel();
		jp1 = new JPanel();
		jp2 = new JPanel();
		area = new JTextArea();
		btnPay = new JButton("<html>결제하기<br/>테스트</html>");
		btnPay.setPreferredSize(new Dimension(200, 50));
		btnPhonePay = new JButton("휴대폰으로 결제하기");
		btnPhonePay.setPreferredSize(new Dimension(200, 50));
		btnList = new JButton("<html>"+service.searchPrices(Integer.toString(OrderVO.getseq()))+"<br/>"+service.searchMenu(Integer.toString(OrderVO.getSeq()))+"</html>" );
		btnList.setPreferredSize(new Dimension(200, 300));
		btnMember = new JButton("<html>"+temp[0]+"<br/>"+temp[1]+"<br/>"+temp[2]+"<br/>"+temp[3]);
		btnMember.setPreferredSize(new Dimension(200, 400));
		jp333333333333 = new JPanel();
		
		//===============assembly()=====================
		//panelEC.setPreferredSize(new Dimension(200 ,100)); //jpanel크기 조절
		
		
		panelEN.add(btnList);
		panelEC.add(btnPhonePay);
		panelES.add(btnPay);
		
		panelEN.setPreferredSize(new Dimension(200, 300));
		panelEC.setPreferredSize(new Dimension(200, 50));
		panelES.setPreferredSize(new Dimension(200, 50));
		
		panelW.setPreferredSize(new Dimension(200, 400));
		panelW.setLayout(new BorderLayout());
		
		panelET.add(panelEN, "North");
		panelET.add(panelEC, "Center");
		panelET.add(panelES, "South");
		panelWT.add(btnMember);
		panelWT.add(area);
		
		panelE.add(panelET);
		panelW.add(panelWT);
		this.getContentPane().add(panelE, "East");
		this.getContentPane().add(panelW, "West");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 400, 500); // 표시위치, 화면크기.
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	      Dimension frm = this.getSize();
	      int xpos = (int) (screen.getWidth()/2-frm.getWidth()/2);
	      int ypos = (int)(screen.getHeight()/2-frm.getHeight()/2);
	      this.setLocation(xpos,ypos);
	      this.setResizable(false);
		
		
		/*Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = this.gi*/
		this.setVisible(true);
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
