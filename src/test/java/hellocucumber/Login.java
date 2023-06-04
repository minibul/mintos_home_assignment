//package hellocucumber;
//
//import by.bondarev.mintos_home_assignment.MainPage;
//import io.cucumber.java.After;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Login {
//    private WebDriver driver;
//    private MainPage mainPage;
//
//    public Login() {
//        WebDriverManager.chromedriver().setup();
//        this.driver = new ChromeDriver();
//        this.mainPage = new MainPage(driver);
//    }
//
//    @Given("the user is on the homepage of asos")
//    public void theUserIsOnTheHomepageOfAsos() {
//        mainPage.open();
//
//    }
//    @When("the user clicks on Sign In button")
//    public void clickSignInButton() throws InterruptedException {
//        mainPage.clickMenuButton();
//
//        Thread.sleep(1000);
//
//        mainPage.clickSignInButton();
//    }
//    @And("the user enters their email address in the Email field")
//    public void enterEmail() throws InterruptedException {
//
//        Thread.sleep(2000);
//
//        mainPage.enterEmail(mainPage.getEmail());
//    }
//    @And("the user enters their password in the \"Password\" field")
//    public void enterPassword() throws InterruptedException {
//
//        Thread.sleep(1000);
//
//        mainPage.enterPassword(mainPage.getPassword());
//    }
//    @And("the user clicks on the \"SIGN IN\" button")
//    public void clickSignInButtonAfterEnteringEmailPassword() throws InterruptedException {
//
//        Thread.sleep(2000);
//
//        mainPage.clickSignInButtonAfterEnteringEmailPassword();
//    }
//    @And("user is logged in")
//    public void userIsLoggedIn() throws InterruptedException {
//
//        Thread.sleep(1000);
//
//        mainPage.clickMenuButton();
//
//        Thread.sleep(10000);
//
//
//    }
//
//    @After()
//    public void closeBrowser() {
//        driver.quit();
//    }
//}
