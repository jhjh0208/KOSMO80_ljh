package ch5.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.util.DBConnectionMgr;

public class NoProcEmpUpdate2222 extends JFrame {
	Connection			con1	= null;
	
	PreparedStatement	pstmt1	= null;
	
	ResultSet			rs1		= null;
	ResultSet			rs2		= null;
	String				sql1	= "";
	String				sql2	= "";
	String				sql3	= "";
	DBConnectionMgr		dbMgr	= null;

	public void salUpdate() {
		String	r_ename		= null;
		double	r_sal		= 0.0;
		double	r_avg_sal	= 0.0;
		double	v_rate		= 0.0;
		int		result		= 0;	// 0이면 수정 실패 1이면 수정 성공
		sql1 += "SELECT sal";
		sql1 += " FROM emp";
//		sql1 += " WHERE empno=?";
		
		dbMgr = DBConnectionMgr.getInstance();

		try {
			con1 = dbMgr.getConnection();
			pstmt1 = con1.prepareStatement(sql1);
//			pstmt1.setInt(1, p_empno);
			rs1 = pstmt1.executeQuery();
			
			rs1.next();
			r_sal = rs1.getDouble("sal");
			System.out.println(r_sal);

			

//			if (r_sal > r_avg_sal) {
//				v_rate = 1.1;
//			}
//			else {
//				v_rate = 1.2;
//			}
		}
			
		catch (SQLException se) {
			System.out.println("[[sql1]] " + sql1);
			se.printStackTrace();

		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		finally {			
			dbMgr.freeConnection(con1, pstmt1, rs1);
		}
	}

	public static void main(String[] args) {
		NoProcEmpUpdate2222	neu1		= new NoProcEmpUpdate2222();
		String				user_input	= JOptionPane.showInputDialog("강찬영바보");
//		int					empno		= 0;
//
//		if (user_input != null || user_input.length() > 1) {
//			empno = Integer.parseInt(user_input);
//		}
		neu1.salUpdate();
	}

}