/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author huulo
 */
public class db {
    static public String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static public String DATABASE_URL = "jdbc:sqlserver://localhost;";
    static public String DATABASENAME = "databasename=ProjectLibraryManager;";
    static public String USERNAME = "user=sa;";
    static public String PASSWORD = "password=123";

    static public Connection ConnectSQLServer() throws ClassNotFoundException, SQLException {
        Class.forName(db.JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(db.DATABASE_URL + db.DATABASENAME + db.USERNAME + db.PASSWORD);
        return connection;
    }
    
}
