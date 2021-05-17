package com.javaex.jdbc.oracle;

import java.sql.*;
//	departments 테이블로부터 모든 레코드를 불러와서
//	department_id:department_name 형태 출력
public class SelectTest {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;	//	레코드 객체
		
		try {
			//	커넥션 획득
			conn = DBConfig.getConnection();
			//	statement 생성
			stmt = conn.createStatement();	//	connection -> statement
			//  쿼리 실행
			String sql = "SELECT department_id, department_name " +
						" FROM departments";
			rs = stmt.executeQuery(sql);	//	SELECT - executeQuery -> ResultSet 반환
			//	결과 객체 받아오기
			//	결과 출력
			while (rs.next()) {	//	한 개 레코드 받아오기
				//	값 받아오기: 컬럼의 타입별 get 메서드 있음
				Long deptId = rs.getLong(1);	//	1번째 컬럼의 Long 데이터
				String deptName = rs.getString("department_name");	//	컬럼의 표시이름으로 값 받아오기
				
				System.out.printf("%d:%s%n", deptId, deptName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}
	}
}
