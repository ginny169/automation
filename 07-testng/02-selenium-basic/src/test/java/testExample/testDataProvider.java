package testExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testDataProvider {


//    //This method will provide data to any test method that declares that its Data Provider
////is named "test1"
//    @DataProvider(name = "test1")
//    public Object[][] createData1() {
//        return new Object[][]{
//                {"Cedric", 36},
//                {"Anne", 37},
//                {"Anne", 37},
//                {"Anne", 37},
//                {"Anne", 37},
//        };
//    }
//
//    //This test method declares that its data should be supplied by the Data Provider named "test1"
//    @Test(dataProvider = "test1")
//    public void verifyData1(String n1, Integer n2) {
//        System.out.println(n1 + " " + n2);
//    }


    @DataProvider(name = "test2")
    public Object[] createData2() {
        return new Object[]{
                "Cedric",
                "Anne",
                "Anne",
                "Tan",
                "Tan",
        };
    }

    @Test
    public void testLogin() {
        System.out.println("Test Login with username and password");
    }

    @DataProvider
    public Iterator<Object[]> simpleCSVDataProvider() throws IOException {
        List<Object[]> records = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/testdata.csv"))) {
            // Skip header line
            String header = reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                records.add(new Object[]{
                        values[0].trim(),
                        values[1].trim(),
                        Integer.parseInt(values[2].trim())
                });
            }
        }
        return records.iterator();
    }

    @Test(dataProvider = "simpleCSVDataProvider")
    public void testWithSimpleCSV(String firstName, String lastName, int age) {
        System.out.println("Testing with CSV data: " + firstName + " " + lastName + ", age: " + age);
    }
}
