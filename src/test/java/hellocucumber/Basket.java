package hellocucumber;

import by.bondarev.mintos_home_assignment.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
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
        mainPage.clickAcceptCookiesButton();
    }

    @When("the user selects the Women or Men category")
    public void theUserSelectsTheOrCategory()  {
       mainPage.choiceRandomFloor();
    }

    @And("the user selects a subcategory of goods, for example, Shoes or Accessories")
    public void theUserSelectsASubcategoryOfGoodsForExampleOr() {
        mainPage.selectRandomSubcategories();
    }

    @And("the user selects a type of product, for example, \"Boots\" or \"Rings\"")
    public void theUserSelectsATypeOfProductForExampleOr()  {
        mainPage.clickRandomProductCategory();
    }

    @And("the user selects a random item from the list")
    public void theUserSelectsARandomItemFromTheList() {
        mainPage.clickRandomProduct();
    }

    @And("the user selects the size \\(if available)")
    public void theUserSelectsTheSizeIfAvailable() {
        mainPage.selectRandomSize();
    }

    @And("the user clicks on the \"Add to bag\" button")
    public void theUserClicksOnTheButton() {
        mainPage.clickAddToBagButton();
    }

    @Then("add the second product")
    public void addTheSecondProduct() {
        mainPage.choiceRandomFloor();
        mainPage.selectRandomSubcategories();
        mainPage.clickRandomProductCategory();
        mainPage.clickRandomProduct();
        mainPage.selectRandomSize();
        mainPage.clickAddToBagButton();

    }

    @And("check that the cart is empty")
    public void checkThatTheCartIsEmpty() throws InterruptedException {
        mainPage.clickMyBagButton();

        Thread.sleep(2000);

//        mainPage.clickCheckoutButton();
        boolean isEmptyBasket = mainPage.isEmptyBasket();

        Assert.assertTrue("Sign-in header is present", isEmptyBasket);

    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }

}
