package level2.basic;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_3 extends JFrame {
	JButton jbtn = null;
	boolean isView = false;
	public A_3() {
		JButton jbtn =  new JButton("전송2");
		initDisplay();
	}
	public A_3(boolean isView) {
		this.isView = isView;
	//	JButton jbtn =  new JButton("전송3");
		jbtn = new JButton();
	//	jbtn.setText("전송4");
		initDisplay();
		jbtn.setText("전송5");//동기화 처리가 되고 있어서 괜찮아
		//위치가 중요하다
	}
	public void initDisplay() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add("Center", jbtn);
		this.setSize(500, 300);
		this.setVisible(isView);
	}

	public static void main(String[] args) {
		new A_3(true); //트루를 넣지 않으면 화면이 안뜸.
		
	}

}
