package by.bondarev.mintos_home_assignment;

import org.openqa.selenium.By;

public class MainPageLocators {

    static final By womenFloor = By.xpath(".//a[@id='women-floor']");
    static final By menFloor = By.xpath(".//a[@id='men-floor']");
    static final By menShoesCategory = By.xpath("//button[@data-id='87a52035-f6fa-401f-bd58-0d259e403cbb']//span[text()='Shoes']");
    static final By womenShoesCategory = By.xpath(".//span[text()='Shoes']");
    static final By womenAccessoriesCategory = By.xpath(".//span[text()='Accessories']");
    static final By menAccessoriesCategory = By.xpath("//button[@data-id='0502a9b2-d1e8-4b34-9741-1141607c715e']//span[text()='Accessories']");
    static final By listOfMenShoesCategory = By.cssSelector("ul[aria-labelledby='43a18c66-3415-495d-af2c-6b84c30ad074'] li a");
    static final By listOfWomenShoesCategory = By.cssSelector("ul[aria-labelledby='a67a6bff-e85d-46c6-9eff-10196ed2ba4a'] li a");
    static final By listOfMenAccessories = By.cssSelector("ul[aria-labelledby='99685eaf-8976-41b8-adc9-af10410662e0'] li a");
    static final By listOfWomenAccessories = By.cssSelector("ul[aria-labelledby='eea0630f-c07d-4cf4-8fc4-b65e7271d065'] li a");
    static final By listOfProducts = By.xpath("//div[@class='results_eRAdS']//*//*");
    static final By sizeSelect = By.id("main-size-select-0");
    static final By addToBagButton = By.cssSelector("span[data-bind='text: buttonText']");
    static final By myBagButton = By.cssSelector("a[data-testid='miniBagIcon']");
//    static final By checkoutLink = By.cssSelector("h1.empty-bag-title");
    static final By emptyBasket = By.cssSelector("h1.empty-bag-title");
    static final By acceptCookiesButton = By.id("onetrust-accept-btn-handler");







//    static final By menuButton = By.xpath(".//button[@class='_6iPIuvw _19mnudD _2SSHFPv']");
//    static final By signInButton = By.xpath(".//*[@data-testid='signin-link']");
//    static final By emailInput = By.xpath(".//input[@id='checkEmailAddress' and @type='email']");
//    static final By secondEmailInput = By.id("EmailAddress");
//    static final By passwordInput = By.xpath(".//input[@class='qa-password-textbox']");
//    static final By signInButtonAfterEnteringEmailPassword = By.xpath(".//input[@id='signin']");
//    static final By continueButton = By.xpath("//*[@class='continue-button' and @type='submit']");
}
