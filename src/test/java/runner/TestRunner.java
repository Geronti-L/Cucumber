package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "steps",
        plugin = {"pretty","html:target/cucumber-reports.html"},
        publish = true,
        tags = "@test"

)
public class TestRunner {
    public static WebDriver driver=new ChromeDriver();
    @BeforeClass
    public static void setup() {
//        driver=new ChromeDriver();
    }

    @AfterClass
    public static void teardown() {
        if (driver!=null){
        driver.quit();}
    }

}
