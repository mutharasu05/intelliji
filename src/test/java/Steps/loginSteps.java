package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class loginSteps {
    WebDriver driver;
//    @Given("User should navigate to the application")
//    public void userShouldNavigateToTheApplication() {
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demowebshop.tricentis.com/");
//    }
    @Given("User clicks on the login links")
    public void userClicksOnTheLoginLinks() {
        driver.findElement(By.xpath("//a[.='Log in']")).click();


    }
//    @Given("User enter the username as mutharasu0527@gmail.com")
//    public void userEnterTheUsernameAsMutharasu0527GmailCom() {
//        driver.findElement(By.cssSelector("input#Email")).sendKeys("mutharasu0527@gmail.com");
//    }
//    @Given("User enter the password as 0527muthu")
//    public void userEnterThePasswordAs0527muthu() {
//        driver.findElement(By.cssSelector("input#Password")).sendKeys("0527muthu");
//    }
    @When("User click the login button")
    public void userClickTheLoginButton() {
        driver.findElement(By.cssSelector("input.login-button")).click();
    }
    @Then("Login should be success")
    public void loginShouldBeSuccess() {
        boolean Logout=driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed();
        assertEquals(Logout, true);
        driver.quit();

    }
    @Given("User enter the username as {string}")
    public void userEnterTheUsernameAs(String username) {
        driver.findElement(By.cssSelector("input#Email")).sendKeys(username);
    }
    @Given("User enter the password as {string}")
    public void userEnterThePasswordAs(String password) {
        driver.findElement(By.cssSelector("input#Password")).sendKeys(password);
    }
    @When("Login should be fail")
    public void loginShouldBeFail() {
       boolean errormsg=driver.findElement(By.cssSelector("div.validation-summary-errors")).isDisplayed();
       assertEquals(errormsg,true);
       driver.quit();
    }

}
