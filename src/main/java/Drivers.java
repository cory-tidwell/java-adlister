
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.result.ResultSetImpl;


public class Drivers {

    public static void main(String[] args) throws Exception {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false", "root" , "codeup");

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from users");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("username") + ", " + myRs.getString("email"));
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
//        finally {
//            if (myRs != null) {
//                myRs.close();
//            }
//
//            if (myStmt != null) {
//                myStmt.close();
//            }
//
//            if (myConn != null) {
//                myConn.close();
//            }
//        }
    }

}
