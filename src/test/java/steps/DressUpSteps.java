package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static runner.TestRunner.driver;

public class DressUpSteps {
//    public static WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Given("User land on page {string}")
    public void user_land_on_page(String url) {
        driver.get("https://" + url + "");
//        throw new io.cucumber.java.PendingException();
    }

    @Then("Title should be {string}")
    public void titleShouldBe(String title) {
        String actualTitle = driver.getTitle().toString();
        System.out.println(actualTitle.toString());
        assertEquals(title, actualTitle);

    }

    @When("User accepts popup")
    public void userAcceptsPopup() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@class='form-control form-search-control']"));
        element.sendKeys("hello");
        driver.quit();
    }
}