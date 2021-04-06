package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
//    @DataProvider(name = "SingleValue")
//    public Object[][] storeSingleValue() {
//        return new Object[][] {
//                {"Barik"},
//                {"Mohammad"},
//                {"Ashraf"}};
//        }
//
//        @DataProvider(name = "MultipleValue")
//        public Object[][] storeMultipleValues() {
//        return new Object[][] {
//                {"Barik", "New York", 11418},
//                {"Farid", "New York", 11428},
//                {"Nafiz", "New York", 11438}};
//        }
//
//        @Test (dataProvider = "SingleValue")
//        public void readSingleValue(String name) {
//            System.out.println("[Single Value] Name is: " + name);
//    }
//
//    @Test(dataProvider = "MultipleValue")
//    public void readMultipleValues(String name, String state, int zipCode) {
//        System.out.println("Name is: " + name);
//        System.out.println("State name is; " + state);
//        System.out.println("Zip Code is: " + zipCode);
//    }


        @DataProvider (name = "RealAprRates")
        public Object[][] storeRealAprRates() {
            return new Object[][] {
                    {"200000", "15000", "3", "3.139%"}
            };
        }
    }
