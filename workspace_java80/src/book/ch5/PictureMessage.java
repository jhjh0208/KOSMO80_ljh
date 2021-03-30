package book.ch5;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class PictureMessage extends JDialog {
	//선언부
	String imgPath = "C:\\Users\\user\\Desktop\\workspace_80\\KOSMO80_ljh\\workspace_java80\\src\\images";
	JPanel jp_emoticon = new JPanel();
	GridLayout gl_emticon = new GridLayout(1,5,2,2);
	JButton pic0 = new JButton();
	JButton pic1 = new JButton();
	JButton pic2 = new JButton();
	JButton pic3 = new JButton();
	JButton pic4 = new JButton();
	String[] imgFile = {"loin11.png,loin22.png,loin33.png,loin44.png,loin55.png"};
	JButton[] imgButton = {pic0,pic1,pic2,pic3,pic4};
	ImageIcon[] img = new ImageIcon[imgButton.length]
;	//성성자
	public PictureMessage() {
		
	}
	//화면처리부
	public void initDisplay() {
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i=0;i<imgFile.length;i++) {
			img[i] = new ImageIcon(imgPath+imgFile);
			imgButton[i].setIcon(img[i]);
		}
		jp_emoticon.setLayout(gl_emticon);
		jp_emoticon.add(pic0);
		jp_emoticon.add(pic1);
		jp_emoticon.add(pic2);
		jp_emoticon.add(pic3);
		jp_emoticon.add(pic4);
		this.add("Center",jp_emoticon);
		this.setSize(500, 200);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		PictureMessage pm = new PictureMessage();
		pm.initDisplay();
	}

}
