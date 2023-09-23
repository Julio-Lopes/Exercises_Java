import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbExcpetion;
import db.DbIntegrityException;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            /*int x = 1;
            if (x < 2){
                throw new SQLException("FAKE ERROR");
            }*/

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("rows1 = " + rows1);
            System.out.println("rows2 = " + rows2);
        }catch(SQLException e){
            try {
                conn.rollback();
                throw new DbExcpetion("Transaction rolled back by: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbExcpetion("ERROR try to rollback! caused by: " + e1.getMessage());
            }
        }finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}