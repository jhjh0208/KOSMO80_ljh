package level2.basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B implements ActionListener {
	A a = null;
	public B(A a) {
		this.a = a;
		System.out.println("B(A a) 생성자 호출 성공");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {//콜백메소드이다. 자동호출
		System.out.println("actionPerformed 호출 성공");
		Object obj = ae.getSource();
		obj = ae.getSource().getClass();
		//만일 9번의 초기화가 없다면 NullPointerExceotion발생.
		if(a.jbtn.getClass()==obj) {
			System.out.println("버튼 이벤트 발생했을 때 ");
			String msg = a.c.methodA();
			System.out.println("메소드 처리결과:"+msg);
		}
	}

}
