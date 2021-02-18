


import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {


    public static void main(String[] args) throws Exception {

        TestNG runner = new TestNG();

        List<String> suites = new ArrayList<>();
        suites.add("src/test/java/Win10.xml");
        runner.setTestSuites(suites);
        runner.run();
    }
}
