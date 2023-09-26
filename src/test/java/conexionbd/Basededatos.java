package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;

public class Basededatos {
	
	@Test
    public void conexion() throws ClassNotFoundException, SQLException {
        
		String dbUrl = "jdbc:mysql://localhost:3306/usuarios";
        String username = "root";
        String password = "1234";
        String query = "select * from usuarios;";
        

        Class.forName("com.mysql.cj.jdbc.Driver");
        

        Connection con = DriverManager.getConnection(dbUrl, username, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> sqlData = new ArrayList<String>();

        rs.next();
           sqlData.add(rs.getString(1));
           sqlData.add(rs.getString(2));
           sqlData.add(rs.getString(3));
           sqlData.add(rs.getString(4));
           sqlData.add(rs.getString(5));
           sqlData.add(rs.getString(6));
           sqlData.add(rs.getString(7));
           System.out.println(sqlData);
        
        
        
        con.close();
    }

}
