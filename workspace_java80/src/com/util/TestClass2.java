package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.design.zipcode.ZipCodeVO;

public class TestClass2 {

	public static void main(String[] args) {

		Connection					con		= null;
		PreparedStatement			pstmt	= null;
		ResultSet					rs		= null;
		ZipCodeVO					zVO		= null;
		List<ZipCodeVO>				list	= new ArrayList<ZipCodeVO>();
		List<Map<String, Object>>	mapList	= new ArrayList<Map<String, Object>>();
		Map<String, Object>			map		= null;

		String						sql		= "SELECT zipcode FROM zipcode_t ORDER BY zipcode";

		DBConnectionMgr				dbmgr	= DBConnectionMgr.getInstance();

		con = dbmgr.getConnection();

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		try {

			while (rs.next()) {
				zVO = new ZipCodeVO();
				map = new HashMap<String, Object>();
				map.put("zipcode", rs.getInt("zipcode"));
				zVO.setZipcode(rs.getInt("zipcode"));
				list.add(zVO);
				mapList.add(map);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		// DB에서 값을 가져와 VO에 넣고 다시 List에 저장한다
		// VO의 zipcode를 가져오려면 vo.getZipcode()를 해야함
		// 아니면 VO의 주솟값만 찍히게 됨
//		for (ZipCodeVO zipCodeVO : list) {
//			System.out.println(zipCodeVO.getZipcode());
//		}

		// 아래 for-each문과 같은 건데 범위를 명시적으로 표시한 것
		// mapList.get(i)가 아래 for-each문에서는 map2로 퉁쳐짐
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(mapList.get(i).get("zipcode"));
//		}

		// 쿼리 결과를 Map에 넣고 그걸 다시 List에 넣은 것을 for-each를 통해
		// 콘솔에 출력함. map2 자체가 mapList.get(i)를 뜻하므로 .은 한 번만 씀
		for (Map<String, Object> map2 : mapList) {
			System.out.println(map2.get("zipcode"));
		}

		dbmgr.freeConnection(con, pstmt, rs);

	}
}
