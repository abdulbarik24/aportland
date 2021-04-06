package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import data_provider.DataProviderClass;
import utilities.ReadConfigFiles;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestNgMavenExampleTest {
    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenExampleTest.class);

//    @Test
    public void run() {
        LOGGER.debug("This is a debug Message");
        LOGGER.info("This is a info Message");
        LOGGER.warn("This is a warning Message");
        LOGGER.error("This is a error Message");
        LOGGER.fatal("This is a fatal Message");

    }

//    @Test
    public void testPropertyFile() {
        String dbUser = ReadConfigFiles.getPropertyValue("DbUser");
        System.out.println("Database User : " + dbUser);
    }

//    @Test
    public void testDatabaseValue() throws SQLException {
        ResultSet resultSet = SqlConnector.readData("Select * from monthly_mortgage");
        while (resultSet.next()) {
            System.out.println("Home price: " + resultSet.getString("homevalue"));
            System.out.println("Down Payment: " + resultSet.getString("downpayment"));
        }

    }

    @Test(dataProvider = "MultipleValue", dataProviderClass = DataProviderClass.class)
    public void readMultipleValues(String name, String state, int zipCode) {
        System.out.println("Name is: " + name);
        System.out.println("State name is; " + state);
        System.out.println("Zip Code is: " + zipCode);
    }

}
