package com.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BaseBallGameEvent implements ActionListener {
	BaseBallGameView bge = null;
	BaseBallGameLogic bgl = new BaseBallGameLogic();
	int			cnt			= 0;
	public BaseBallGameEvent(BaseBallGameView bge) {
		this.bge = bge;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object	obj		= e.getSource();
		// 라벨값으로 처리하고 싶으면
		String	label	= e.getActionCommand();	// 새게임,지우기
		System.out.println("event label:" + label);

		if (obj == bge.jtf_input) {
			String input = bge.jtf_input.getText().trim();

			// 만일 숫자가 아닌 값이 있을 때도 고려해야 한다.
			try {
				Integer.parseInt(input);// 356
			}
			catch (NumberFormatException nfe) {
				bge.jop.showMessageDialog(bge, "숫자만 입력하세요", "Error", JOptionPane.ERROR_MESSAGE);
				bge.jtf_input.setText("");
				bge.jtf_input.requestFocus();
				return;
			}

			if (input.length() != 3) {
				return;
			}
			else {
				bge.jta_display.append(++cnt + "." + bge.jtf_input.getText() + ":" + bgl.call(input) + "\n");
				bge.jtf_input.setText("");
			}
		}
		else if ("지우기".equals(label)) {
			bge.jta_display.setText("");
			bge.jtf_input.requestFocus();
		}
		else if ("종료".equals(label)) {
			System.exit(0);// 자바 가상머신과의 연결고리를 끊는다.
		}
		else if (obj == bge.jmi_dap) {
			bge.jta_display.append("정답은 " + bgl.com[0] + bgl.com[1] + bgl.com[2] + "\n");
			bgl.nanSu();
		}
		else if (obj == bge.jbtns[1]) {
			bge.jta_display.append("정답은 " + bgl.com[0] + bgl.com[1] + bgl.com[2] + "\n");
			bgl.nanSu();
		}
		// 새게임
		else if (obj == bge.jbtns[0]) {
			cnt = 0;
			bgl.nanSu();
			bge.jta_display.setText("");
			bge.jtf_input.setText("");
			bge.jtf_input.requestFocus();
		}
	}

}