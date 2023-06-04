package hellocucumber;

import by.bondarev.mintos_home_assignment.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basket {
    private final WebDriver driver;
    private final MainPage mainPage;

    public Basket() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.mainPage = new MainPage(driver);
    }
    @Given("the user is on the homepage of www.asos.com")
    public void theUserIsOnTheHomepageOfWwwAsosCom() {
        mainPage.open();
    }
    @When("the user selects the Women or Men category")
    public void theUserSelectsTheOrCategory() {
       mainPage.randomFloor();
    }

    @And("the user selects a subcategory of goods, for example, Shoes or Accessories")
    public void theUserSelectsASubcategoryOfGoodsForExampleOr() {
        mainPage.randomCategory();
    }
    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
