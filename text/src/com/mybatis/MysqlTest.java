package com.mybatis;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

public class MysqlTest {

	public static void comment() throws Exception {
		String table = "user_info";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = (Connection) DriverManager.getConnection(
				"jdbc:mysql://192.168.10.229:3306/carltest?useUnicode=true&characterEncoding=utf8", "mysql",
				"oRcl_123");
		Map map = new HashMap();
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery("show full columns from " + table);
		System.out.println("【" + table + "】");
		while (rs.next()) {
			System.out.println(rs.getString("Field") + ": "+rs.getString("Type")+" :" + rs.getString("Comment"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
	
	public static void jiegou() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = (Connection) DriverManager.getConnection(
					"jdbc:mysql://192.168.10.229:3306/carltest?useUnicode=true&characterEncoding=utf8", "mysql",
					"oRcl_123");
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("select * from user_info");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsme = (ResultSetMetaData) rs.getMetaData();

			int columnCount = rsme.getColumnCount();
			System.out.println("ResultSet对象中的列数" + columnCount);
			for (int i = 1; i < columnCount; i++) {
				System.out.println();
				System.out.println("列名称: " + rsme.getColumnName(i));
				System.out.println("列类型(DB): " + rsme.getColumnTypeName(i));
				// System.out.println("长度: "+ rsme.getPrecision(i) );
				// System.out.println("是否自动编号: "+ rsme.isAutoIncrement(i));
				// System.out.println("是否可以为空: "+ rsme.isNullable(i));
				// System.out.println("是否可以写入: "+ rsme.isReadOnly(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws Exception {
		comment();

	}
}
