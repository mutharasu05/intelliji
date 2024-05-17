package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class addToCartSteps {

    WebDriver driver;
    @Given("User should navigate to the application")
    public void userShouldNavigateToTheApplication() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }
    @Given("User should login as {string} and {string}")
    public void userShouldLoginAsAnd(String username, String password) {
        driver.findElement(By.xpath("//a[.='Log in']")).click();
        driver.findElement(By.cssSelector("input#Email")).sendKeys(username);
        driver.findElement(By.cssSelector("input#Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.login-button")).click();

    }
    @Given("User should search the {string}")
    public void userShouldSearchThe(String book) {

        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys(book);
        driver.findElement(By.cssSelector("input.search-box-button")).click();
    }
    @When("User should add the book to the cart")
    public void userShouldAddTheBookToTheCart() {
        WebElement element = driver.findElement(By.xpath("//a[.='Health Book']/../..//input"));
        element.click();
    }
    @Then("the cart badge should be updated")
    public void theCartBadgeShouldBeUpdated() {
        driver.findElement(By.xpath("//span[@class='cart-qty']")).click();
        boolean add=driver.findElement(By.xpath("//input[@class='qty-input']/../..")).isDisplayed();
        Assert.assertEquals(add,true);
        driver.quit();
    }


}
