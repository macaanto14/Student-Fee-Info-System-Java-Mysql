package peaceprivate;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Naim
 */
public class javaconnect {
    Connection conn;
public static java.sql.Connection ConnecrDb(){
  try{
     
     java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/peace", "root", "");
     return conn;
  } catch(SQLException e){
      
  }
        return null;
}
}
