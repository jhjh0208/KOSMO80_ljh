package book.ch12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.design.zipcode.ZipCodeVO;
import com.util.DBConnectionMgr;
import com.vo.DeptVO;

public class DeptListExam2 extends JFrame implements ActionListener {

	// 선언부
	JButton				jbtn_search	= new JButton("조회");
	String[]			cols		= { "부서번호", "부서명", "지역" };
	// 데이터셋 선언
	DefaultTableModel	dtm			= null;
	JTable				jtb			= null;
	JScrollPane			jsp			= null;
	Connection			con			= null;
	PreparedStatement	pstmt		= null;
	ResultSet			rs			= null;
	DBConnectionMgr		dbmgr		= DBConnectionMgr.getInstance();
	String				sql			= "SELECT deptno,dname,loc FROM dept";

	// 생성자
	public DeptListExam2() {// 인스턴스화가 될 때 즉시 화면이 그려지도록
		initDisplay();
	}

	public void tableCreate() {
		dtm = new DefaultTableModel(new Object[3][3], cols);
		jtb = new JTable(dtm);
		jsp = new JScrollPane(jtb);
		this.add("Center", jsp);
	}

	// 데이터 수집하기1
	public List<Map<String, Object>> getDeptList() {
		System.out.println("getDeptList 호출성공");
		List<Map<String, Object>>	deptList	= new ArrayList<>();
		Map<String, Object>			voMap		= null;

		// TODO insert here

		con = dbmgr.getConnection();

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		

			while (rs.next()) {
				voMap = new HashMap<String, Object>();
				voMap.put("deptno", rs.getString("deptno"));
				voMap.put("dname", rs.getString("dname"));
				voMap.put("loc", rs.getString("loc"));
				deptList.add(voMap);
				System.out.println(deptList);

			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return deptList;
	}

//	// 데이터 수집하기2
//	public List<DeptVO> getDeptList2() {
//		System.out.println("getDeptList2 호출성공");
//		return null;
//	}

	// 화면처리부
	public void initDisplay() {
		jbtn_search.addActionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tableCreate();// 메소드 호출도 동기화가 필요하다. - 시점문제
		this.setTitle("부서목록");
		this.add("North", jbtn_search);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	// 메인메소드
	public static void main(String[] args) {
		new DeptListExam2();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		// 너 조회버튼 누른거야?
		// dtm, jtable
		if (ae.getSource() == jbtn_search) {
			List<Map<String, Object>>		deptList	= getDeptList();
			Iterator<Map<String, Object>>	iter		= deptList.iterator();
			Object[]						keys		= null;

			while(dtm.getRowCount()>0) {
				dtm.removeRow(0);
			}
			while (iter.hasNext()) {
//				HashMap<String,Object> data = iter.next(); //이건 왜 안됨?
				Map<String, Object> data = iter.next();
				keys = data.keySet().toArray();
				Vector<Object> oneRow = new Vector<>();
				oneRow.add(data.get(keys[2]));
				oneRow.add(data.get(keys[1]));
				oneRow.add(data.get(keys[0]));
				dtm.addRow(oneRow);
			}
		}
	}
}
