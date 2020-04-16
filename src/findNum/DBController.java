package findNum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBController {
    String driver = "org.mariadb.jdbc.Driver";
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
 
    public void connect() {
         try {
            Class.forName(driver);
            con = DriverManager.getConnection(
                    "jdbc:mariadb://192.168.56.101:3306/ltnum",
                    "root",
                    "arrows");
            
            if( con != null ) {
                System.out.println("DB 접속 성공");
            }
            
        } catch (ClassNotFoundException e) { 
            System.out.println("드라이버 로드 실패");
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }
    }
    
    public void clearData()
    {
    	try
    	{
    		String strSql = "DELETE LTNUM.NUM_RESULT ;";
    		Statement stmt = con.createStatement();
    		stmt.executeQuery(strSql);
    	}catch(Exception e)
    	{
    	
    	}
    }
    
    public void insertData(String strInsert)
    {
    	try
    	{
    		Statement stmt = con.createStatement();
    		stmt.executeQuery(strInsert);
    	}catch(Exception e)
    	{
    	
    	}    	
    }
    
}
