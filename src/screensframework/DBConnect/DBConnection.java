package screensframework.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection conn;
    private static String url = "jdbc:postgresql://ec2-54-81-126-150.compute-1.amazonaws.com:5432/d5tjnqfp43uqpo";
    private static String user = "uivscpxiarxbdq";
    private static String pass = "307fc21073fd994d8b4f811a14d496de713a338597cf6cdf194e6376096b0478";

    /*
    private static String url = "jdbc:mysql://localhost/sysventas";
    private static String user = "root";
    private static String pass = "";*/

    public static Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Error: " + cnfe.getMessage());
        } catch (InstantiationException ie) {
            System.err.println("Error: " + ie.getMessage());
        } catch (IllegalAccessException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
}
