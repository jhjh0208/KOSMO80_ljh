package book.ch6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassGubun extends JFrame{
	JButton jbtn_search = new JButton("조회");
	JButton jbtn_exit = new JButton("종료");
	
	public ClassGubun() {
		start();
	}
	
	public void start() {
		jbtn_search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {//void - 반환타입이 의미가 없다.
				System.out.println("조회버튼 호출성공");
			}
			
		});
		jbtn_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("나가기버튼 호출성공");
				
			}
			
		});
		initDisplay();
	}

	
	private void initDisplay() {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(jbtn_search);
		this.add(jbtn_exit);
		this.setTitle("호호호");
		this.setSize(300, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ClassGubun();
		
	}

}
