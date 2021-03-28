package calc.step1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class MyCalcLogic implements ActionListener{
	MyCalcView myCalcView = null;
	String v1 = "";										
	String v2 = "";										
	String op = "";		
	

	public MyCalcLogic(MyCalcView myCalcView) {
		this.myCalcView = myCalcView;
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
	

	

	@Override										
	public void actionPerformed(ActionEvent ae) {										
		Object obj = ae.getSource();									
											
		if(obj == myCalcView.getJbt_one()){									
			myCalcView.getJtf_result().setText(myCalcView.getJtf_result().getText()+"1");								
		}else if(obj == myCalcView.getJbt_two()){									
			myCalcView.getJtf_result().setText(myCalcView.getJtf_result().getText()+"2");								
		}else if(obj == myCalcView.getJbt_plus()){									
			v1 = myCalcView.getJtf_result().getText();								
			System.out.println("v1 : "+v1);								
			op = "+";								
			myCalcView.getJtf_result().setText("");								
		}else if(obj == myCalcView.getJbt_equals()){									
			v2 = myCalcView.getJtf_result().getText();								
			System.out.println("v1:"+v1 +"-> v2 : "+v2+" op : "+op);								
			String result = this.calcurate(v1,v2,op);								
			myCalcView.getJtf_result().setText(result);								
		}else if(obj == myCalcView.getJbt_clear()){									
			myCalcView.getJtf_result().setText("");								
		}									
	}					
	
	
}
