package com.firstzone.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//실행시 DB연결  CRUD작업 
public class DBConnectTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//0.class path에 JDBC library 추가 
		//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6_g.jar
		//1.driver load
		Class.forName("oracle.jdbc.OracleDriver");
		//2.DB연결
		String url="jdbc:oracle:thin:@localhost:1521:xe", userid="hr", userpass="hr";
		Connection conn = DriverManager.getConnection(url, userid, userpass);
		//ORA-00911: invalid character 
		//ORA-00942: table or view does not exist
		//ORA-00904: "DEPARTMENT_NAME2": invalid identifier
		String sql = "select department_name from departments  ";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			//부적합한 열 이름
			System.out.println(rs.getString("department_name"));
		}
		rs.close();st.close();conn.close();

	}

}
