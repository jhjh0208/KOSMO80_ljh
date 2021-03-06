package calc.step1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.onj.MyCalcEventHandler;

public class MyCalcApp extends JFrame implements ActionListener{
	//선언부 - 실행문(제어문, 메소드 호출 ,변수 초기화(두 줄로 나눠 쓰는 거))은 불가하다.									
		private JTextField jtf_result = null;									
		private JButton jbt_one = null;									
		private JButton jbt_two = null;									
		private JButton jbt_plus = null;									
		private JButton jbt_equals = null;									
		private JButton jbt_clear = null;									
		private JPanel jp_pad = null;									
		MyCalcEventHandler myEventHandler = null;	
		
//		private JTextField jtf_result = null;										
//		private JButton jbt_one = null;										
//		private JButton jbt_two = null;										
//		private JButton jbt_plus = null;										
//		private JButton jbt_equals = null; 										
//		private JButton jbt_clear = null; 										
		String v1 = "";										
		String v2 = "";										
		String op = "";		
	//생성자									
		public MyCalcApp(){									
			initDisplay();								
		}		
		//화면처리부									
		public void initDisplay()									
		{									
			jtf_result = new JTextField();								
			jtf_result.setHorizontalAlignment(JTextField.RIGHT);								
			jbt_one = new JButton("1");								
			jbt_two = new JButton("2");								
			jbt_plus = new JButton("+");								
			jbt_equals = new JButton("=");								
			jbt_clear = new JButton("C");								
			jtf_result.addActionListener(this);								
			jbt_one.addActionListener(this);								
			jbt_two.addActionListener(this);								
			jbt_plus.addActionListener(this);								
			jbt_equals.addActionListener(this);								
			jbt_clear.addActionListener(this);								
			jp_pad = new JPanel(new GridLayout(1,5,2,2));								
			jp_pad.add(jbt_one);								
			jp_pad.add(jbt_two);								
			jp_pad.add(jbt_plus);								
			jp_pad.add(jbt_equals);								
			jp_pad.add(jbt_clear);								
			this.getContentPane().add("North",jtf_result);								
			this.getContentPane().add("Center",jp_pad);								
			this.setTitle("전자계산기");								
			this.setSize(300,150);								
			this.setVisible(true);								
		}		
		
		
		@Override										
		public void actionPerformed(ActionEvent ae) {										
			Object obj = ae.getSource();									
												
			if(obj == jbt_one){									
				jtf_result.setText(jtf_result.getText()+"1");								
			}else if(obj == jbt_two){									
				jtf_result.setText(jtf_result.getText()+"2");								
			}else if(obj == jbt_plus){									
				v1 = jtf_result.getText();								
				System.out.println("v1 : "+v1);								
				op = "+";								
				jtf_result.setText("");								
			}else if(obj == jbt_equals){									
				v2 = jtf_result.getText();								
				System.out.println("v1:"+v1 +"-> v2 : "+v2+" op : "+op);								
				String result = MyCalcApp.calcurate(v1,v2,op);								
				jtf_result.setText(result);								
			}else if(obj == jbt_clear){									
				jtf_result.setText("");								
			}									
		}					
		
		public static String calcurate(String sValue1, String sValue2, String sOp)											
		{											
			double v1 = Double.parseDouble(sValue1);										
			double v2 = Double.parseDouble(sValue2);										
													
			System.out.println("sValue1 : "+sValue1+" : sValue2 : "+sValue2 + "==> "+sOp);										
			if(sOp.equals("+")){										
				return ""+(v1+v2);									
			}										
			else{										
				return "error";									
			}										
		}					
		
	//main메소드									
		public static void main(String[] args) {									
			new MyCalcApp();								
		}			
}
