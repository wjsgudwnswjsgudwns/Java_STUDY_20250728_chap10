package chap10.part02.throwTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	
	public Connection conn() throws SQLException {
		String url = "DB 접속정보";
		
		return DriverManager.getConnection(url, "tiger", "12345");
	}
}
