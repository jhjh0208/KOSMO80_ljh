package UI.hanbit;
//내 상각을 표현하는데 장애가 있지 않도록... 불편하지 않도록 코딩 연습
//어디까지 허용되는가? 어떤 것은 허용되지 않는지...
import javax.swing.JFrame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BookManager extends JFrame{
	Logger logger = LogManager.getLogger(BookManager.class);
	//선언부
	JFrame jf = new JFrame();//new Window()
//	static JFrame bm = new BookManager();//new JFrame()
//	static BookManager bm2 = new BookManager();//new JFrame()
	static BookManager bm3 = null;
	//성성자
	public BookManager() {
//		bm.initDisplay();
//		jf.iniitDiplay();
//		initDisplay();
//		this - BookManager   super - JFrame
//		this.setSize(500, 300);
//		bm3.setSize(600, 700);
		this.setSize(600, 700);
		//우리는 setVisible에 대해서 오버라이딩을 하지 않았다. 따라서 부모의 메소도그 호출 되었다.
//		bm3.setVisible(true);
		this.setVisible(true);
	}
	//화면처리부
	public void initDisplay() {
		logger.info("initDisplay() 호출 성공");
	}
	
	
	public static void main(String[] args) {
		bm3 = new BookManager();
		bm3.initDisplay();
	}

}
