package level2.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Imsi extends JFrame {
	JPanel			jp_north	= new JPanel();
	JButton			jbtn_one	= new JButton("하나");
	JButton			jbtn_two	= new JButton("둘");
	JButton			jbtn_three	= new JButton("셋");
	JLabel			jlb			= new JLabel("현재시간", JLabel.CENTER);
	Container		cont		= this.getContentPane();
	ImsiCenterPanel	jp			= new ImsiCenterPanel();

	public Imsi() {
		jbtn_one.setBackground(Color.pink);
		jp_north.setLayout(new GridLayout(3, 3, 3, 3));
		jp_north.add(jbtn_one);
		jp_north.add(jbtn_two);
		jp_north.add(jbtn_three);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jbtn_one.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 호출 성공");
				viewUpdate(e);
			}
		});
		jbtn_two.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전체화면 변경하기");
				viewAllUpdate(e);
			}
		});
		jbtn_three.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("초록패널을 빨강패널로 변경해보기");
				threeUpdate(e);
			}

		});
		this.add("Center", jp_north);
		this.add("North", jlb);
		this.setSize(500, 400);
		this.setVisible(true);
	}

	public void threeUpdate(ActionEvent e) {

		if (jp != null) {
			jp.remove(jp.jbtn1);
			jp.remove(jp.jbtn2);
		}
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.red);
		this.add("Center", jp2);
		cont.revalidate();
	}

	public void viewAllUpdate(ActionEvent e) {
//		선언부와 생성부를 다르게 하여 인스턴스화를 하면 인스턴스변수로는 부모 타입에서 제공되는
//		메소드만 사용할 수 있다.
//		즉 자녀 클래스의 메소드는 호출 불가함.
//		JPanel jp = new ImsiCenterPanel();

		jp.initDisplay();
		this.add("Center", jp);
		cont.revalidate();
//		this.invalidate();
//		this.repaint();
	}

	public void viewUpdate(ActionEvent e) {
		System.out.println("viewUpdate호출 성공");
		cont.remove(jlb);
		cont.revalidate();
		this.remove(jbtn_one);
		this.revalidate();
		this.repaint();
	}

	public static void main(String[] args) {
		new Imsi();
	}

}
