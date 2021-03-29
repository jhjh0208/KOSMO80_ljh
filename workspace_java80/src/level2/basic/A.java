package level2.basic;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A extends JFrame {
	JButton jbtn = null;
	boolean isView = false;
	B b = null;//타입만 결정 되었으므로 시점에 따라 NullPointerException방지 해야 함.
	C c = new C();//A가 컴파일 될때 같이 메모리에 상주
	public A() {
		initDisplay();
	}
	public A(boolean isView) {
		this.isView = isView;
		initDisplay();
	}
	public void initDisplay() {
		jbtn = new JButton("전송");
		b = new B(this);
		jbtn.addActionListener(b);
//		jbtn.addActionListener(b);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add("Center", jbtn);
		this.setSize(500, 300);
		this.setVisible(isView);
	}

	public static void main(String[] args) {
		new A(true); 
		
	}

}
