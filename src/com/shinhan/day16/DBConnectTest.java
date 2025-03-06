package com.shinhan.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//실행시 DB연결해서
//SQL문실행
//결과 받기
public class DBConnectTest {

	public static void main(String[] args) {
	 
			Connection conn = null;
			Statement st = null;
			ResultSet rs = null;
			String url = "jdbc:mariadb://localhost:3306/shinhan", userid="hr", userpass="1234";
			String sql =  """
					 select * from student
					""";
			
			try {
				//1.Driver Load 
				Class.forName("org.mariadb.jdbc.Driver");
				System.out.println("1.Driver Load  success");
				conn = DriverManager.getConnection(url, userid, userpass);
				System.out.println("2.DB Connection success" );
				st = conn.createStatement();
				System.out.println("3.SQL문 전송통로 만들기 success" );
				rs = st.executeQuery(sql);
				while(rs.next()) {
					System.out.println("학생번호:" + rs.getInt("student_id"));
					System.out.println("이름:" + rs.getString("student_name"));
			 
					System.out.println("----------------------------------");
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 
	}
	
	public static void f2(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe", userid="hr", userpass="hr";
		String sql =  """
				select *
				from employees
				where hire_date between '2005/01/01' and '2005/12/31'
				and department_id in (30, 50, 80)
				and salary between 10000 and 17000
				and COMMISSION_PCT is not null 
				order by hire_date , salary desc
				""";
		
		try {
			//1.Driver Load 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.Driver Load  success");
			conn = DriverManager.getConnection(url, userid, userpass);
			System.out.println("2.DB Connection success" );
			st = conn.createStatement();
			System.out.println("3.SQL문 전송통로 만들기 success" );
			rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("직원번호:" + rs.getInt("EMPLOYEE_ID"));
				System.out.println("firstName:" + rs.getString("first_name"));
				System.out.println("lastName:" + rs.getString("last_name"));
				System.out.println("salary:" + rs.getInt("salary"));
				System.out.println("커미션:" + rs.getDouble("COMMISSION_PCT"));
				System.out.println("hiredate:" + rs.getDate("hire_date"));
				System.out.println("----------------------------------");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public static void f1() throws ClassNotFoundException, SQLException {
		//0.class path 지정 (C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6_g.jar)
		//1.Driver Load 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Load 성공");
		//2.DB연결
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="hr", pass="hr";
		Connection conn = DriverManager.getConnection(url, id, pass);
		System.out.println("연결성공");
		//3.대화통로를 생성 
		Statement st = conn.createStatement();
		System.out.println("SQL문 전송통로 생성");
		String sql = "select * from employees where salary >=15000";
		//Select실행 결과는 ResultSet으로 옴 
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("직원번호:" + rs.getInt(1));
			System.out.println("직원이름:" + rs.getString("first_name"));
			System.out.println("급여:" + rs.getDouble("salary"));
			System.out.println("급여:" + rs.getDate("hire_date"));
			System.out.println("---------------------------------");
			
		}
		rs.close();st.close();conn.close();
		
	}

}
