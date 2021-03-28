package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClass {

	public static void main(String[] args) {

		Connection			con		= null;
		PreparedStatement	pstmt	= null;
		ResultSet			rs		= null;

		String				sql		= "SELECT ename FROM emp";

		DBConnectionMgr		dbmgr	= DBConnectionMgr.getInstance();

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
				System.out.println(rs.getString("ENAME"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		dbmgr.freeConnection(con, pstmt, rs);

}
