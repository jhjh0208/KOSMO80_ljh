package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler2 implements ActionListener {
	ViewApp2 viewApp = null;
//	ViewApp viewApp = new ViewApp();
	public EventHandler2(ViewApp2 viewApp) {
		this.viewApp = null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewApp.jbtn) {//NullPointerException
			System.out.println("전송버튼 호출성공");
		}
	}		
}