package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class SqlConnector {
    private static final Logger LOGGER = LogManager.getLogger(SqlConnector.class);
    private static final String Url = "jdbc:postgresql://localhost:5433/mortgage_calculator";

    private static Connection  dbconnect() {
        String user = ReadConfigFiles.getPropertyValue("DbUser");
        LOGGER.debug("DB User Name: " + user);
        String password = ReadConfigFiles.getPropertyValue("DbPassword");
        LOGGER.debug("DB User Password: " + password);
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(Url, user, password);

        }catch (SQLException e) {
            LOGGER.error("SQL Connection exception: " + e.getMessage());
        }
        return conn;
    }

    public static ResultSet readData(String SQL) {
        ResultSet rs = null;
        try {
            Connection conn = dbconnect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

        }catch (SQLException e) {
          LOGGER.error("SQL resultSet exception: " + e.getMessage());
        }
        return rs;
    }
}
