package Gnyang;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class DateForm extends JFrame {
	private static final long	serialVersionUID	= 1L;

	JButton[]					dates				= new JButton[42];
	JLabel						jl_title			= new JLabel();
	int							year				= 0;
	int							month				= 0;
	int							nowMonth			= 0;
	int							today				= 0;
	Calendar					cal					= Calendar.getInstance();

	public DateForm() {
		setLayout(new BorderLayout());

		JButton		jb_left		= new JButton("◁");
		JButton		jb_right	= new JButton("▷");

		JPanel		jp_north	= new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel		jp_center	= new JPanel(new GridLayout(7, 7));

		String[]	names		= { "일", "월", "화", "수", "목", "금", "토" };

		for (int i = 0; i < names.length; i++) {
			JLabel jl = new JLabel(names[i]);
			jl.setHorizontalAlignment(JTextField.HORIZONTAL);
			jp_center.add(jl);

			if (i == 0) {
				jl.setForeground(Color.red);
			}
			else if (i == 6) {
				jl.setForeground(Color.blue);
			}
		}

		for (int i = 0; i < dates.length; i++) {
			dates[i] = new JButton();
			dates[i].setBorder(new LineBorder(Color.black));
			int idx = i;
			dates[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(null, String.format("선택한 이거 뭐야 : %s-%02d-%02d", year, month,
												Integer.parseInt(dates[idx].getText())));
				}
			});
			jp_center.add(dates[i]);
		}

		jp_north.add(jb_left);
		jp_north.add(jl_title);
		jp_north.add(jb_right);

		jb_left.setEnabled(false);

		jb_left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				month--;

				if (month < 1) {
					month = 12;
					year--;
				}

				if (month == nowMonth) {
					jb_left.setEnabled(false);
				}
				RefreshDate();
			}
		});

		jb_right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jb_left.setEnabled(true);
				month++;

				if (month > 12) {
					month = 1;
					year++;
				}
				RefreshDate();
			}
		});

		add(jp_north, BorderLayout.NORTH);
		add(jp_center, BorderLayout.CENTER);

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		nowMonth = month;
		today = cal.get(Calendar.DATE);
		RefreshDate();

		setTitle("기간선택");
		setSize(340, 420);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	void RefreshDate() {

		for (int i = 1; i < dates.length; i++) {
			dates[i].setVisible(true);
			dates[i].setEnabled(true);
		}
		jl_title.setText(String.format("%s 년%s 월", year, month));

		cal.set(Calendar.YEAR, year); // 입력받은 년도로 세팅
		cal.set(Calendar.MONTH, month); // 입력받은 월로 세팅
		cal.set(year, month - 1, 1); // 입력받은 월의 1일로 세팅
		// month는 0이 1월이므로 -1을 해준다

		int	end			= cal.getActualMaximum(Calendar.DATE);	// 해당 월 마지막 날짜
		int	dayOfWeek	= cal.get(Calendar.DAY_OF_WEEK);		// 해당 날짜의 요일(1:일요일 … 7:토요일)

		int	v			= 0;

		for (int i = 1; i <= end; i++) {

			if (i == 1) {

				for (int j = 1; j < dayOfWeek; j++) {
					dates[v].setVisible(false);
					v++;
				}
			}

			if (dayOfWeek % 7 == 1) {
				dates[(v + i - 1)].setForeground(Color.red);
			}
			else if (dayOfWeek % 7 == 0) {
				dates[(v + i - 1)].setForeground(Color.blue);
			}

			dates[(v + i - 1)].setText(String.valueOf(i));

			dayOfWeek++;
		}

		for (int i = 0; i < 42 - (v + end); i++) {
			dates[v + end + i].setVisible(false);
		}

		if (month == nowMonth) {

			for (int i = 1; i <= today; i++) {
				dates[i].setEnabled(false);
			}
		}
	}

	public static void main(String[] args) {
		new DateForm();
	}
}
