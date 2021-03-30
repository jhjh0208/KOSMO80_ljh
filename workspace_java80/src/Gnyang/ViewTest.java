package Gnyang;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewTest extends JFrame {

	JLabel jl = new JLabel("label", JLabel.CENTER);
	JPanel jp = new JPanel(new GridLayout(1, 0, 30, 30));
	JButton[] buttons = new JButton[3];
	String[] buttonNames = new String[buttons.length];

	public ViewTest() {
		initDisplay();
	}

	public void initDisplay() {
		for (int i = 0; i < buttonNames.length; i++) {
			buttonNames[i] = "" + (i + 1);
		}

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttonNames[i]);
			jp.add(buttons[i]);
		}
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(jp);
		this.add("North", jl);
		this.setSize(500, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ViewTest();
	}
}
