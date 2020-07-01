import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"C:/Ravibabu/SWProjects/CucumberProjectRediff/src/test/resources/com/selenium/rediff/login.feature:24"},
        plugin = {"json:C:/Ravibabu/SWProjects/CucumberProjectRediff/target/cucumber-parallel/1.json", "html:C:/Ravibabu/SWProjects/CucumberProjectRediff/target/cucumber-parallel/1"},
        monochrome = true,
        glue = {"com.selenium.steps"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
