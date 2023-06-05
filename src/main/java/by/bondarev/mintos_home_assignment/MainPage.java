package by.bondarev.mintos_home_assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainPage extends BasePage {

    public static final String URL = Configuration.getProperty("url");
//    public String email = Configuration.getProperty("email");
//    public String password = Configuration.getProperty("password");


    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(URL);
    }

    public void clickAcceptCookiesButton() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(MainPageLocators.acceptCookiesButton)).click();
    }
    public void choiceRandomFloor() {
        Random random = new Random();
        if (random.nextBoolean()) {
            clickWomenFloor();
        } else {
            clickMenFloor();
        }
    }
    public void clickWomenFloor() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(MainPageLocators.womenFloor));
        driver.findElement(MainPageLocators.womenFloor).click();
    }

    public void clickMenFloor() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(MainPageLocators.menFloor));
        driver.findElement(MainPageLocators.menFloor).click();
    }

    public void selectRandomSubcategories() {
        Random random = new Random();
        if (random.nextBoolean()) {
            try {
                driver.findElement(MainPageLocators.menShoesCategory).click();
            } catch (ElementNotInteractableException | NoSuchElementException e) {
                try {
                    driver.findElement(MainPageLocators.womenShoesCategory).click();
                } catch (ElementNotInteractableException e1) {
                    System.out.println("Exception: " + e1.getMessage());
                }
            }
        } else {
            try {
                driver.findElement(MainPageLocators.menAccessoriesCategory).click();
            } catch (ElementNotInteractableException | NoSuchElementException e) {
                try {
                    driver.findElement(MainPageLocators.womenAccessoriesCategory).click();
                } catch (ElementNotInteractableException e1) {
                    System.out.println("Exception: " + e1.getMessage());
                }
            }
        }
    }

    public void clickRandomProduct() {
        List<WebElement> listItems = driver.findElements(MainPageLocators.listOfProducts);
        Random rand = new Random();

        int index = rand.nextInt(listItems.size());

        WebElement randomItem = driver.findElements(MainPageLocators.listOfProducts).get(index);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", randomItem);

        randomItem.click();
    }

    public void clickRandomProductCategory() {
        List<By> categoryList = Arrays.asList(MainPageLocators.listOfMenShoesCategory, MainPageLocators.listOfWomenShoesCategory, MainPageLocators.listOfMenAccessories, MainPageLocators.listOfWomenAccessories);
        Random rand = new Random();

        for (By category : categoryList) {
            try {
                List<WebElement> elements = driver.findElements(category);
                if (!elements.isEmpty()) {
                    WebElement randomElement = elements.get(rand.nextInt(elements.size()));
                    randomElement.click();
                    break;
                }
            } catch (NoSuchElementException | ElementNotInteractableException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    public void selectRandomSize() {
        List<WebElement> sizeDropdownElements = driver.findElements(MainPageLocators.sizeSelect);

        if (sizeDropdownElements.isEmpty()) {
            return;
        }

        Select sizeDropdown = new Select(sizeDropdownElements.get(0));
        List<WebElement> sizeOptions = sizeDropdown.getOptions();
        Random rand = new Random();

        int index;
        boolean foundValidOption = false;

        do {
            index = rand.nextInt(sizeOptions.size() - 1) + 1;
            String optionText = sizeOptions.get(index).getText();

            if (!optionText.contains("Out of stock")) {
                foundValidOption = true;
            }
        } while (!foundValidOption);

        sizeDropdown.selectByIndex(index);
    }

    public void clickAddToBagButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(MainPageLocators.addToBagButton)).click();
    }

    public void clickMyBagButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(MainPageLocators.myBagButton)).click();
    }

//    public void clickCheckoutButton() {
//        driver.findElement(MainPageLocators.checkoutLink).click();
//    }

    public boolean isEmptyBasket() {
        try {
            driver.findElement(MainPageLocators.emptyBasket);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }





//    public MainPage clickSignInButton() {
//        driver.findElement(MainPageLocators.signInButton).click();
//        return this;
//    }
//    public MainPage clickMenuButton() {
//        driver.findElement(MainPageLocators.menuButton).click();
//            return this;
//    }
//    public MainPage enterEmail(String enterEmail) {
//    try {
//        driver.findElement(MainPageLocators.emailInput).sendKeys(enterEmail);
//    } catch (NoSuchElementException e) {
//        driver.findElement(MainPageLocators.secondEmailInput).sendKeys(enterEmail);
//    }
//
//    try {
//        WebElement continueButton = driver.findElement(MainPageLocators.continueButton);
//        if (continueButton.isDisplayed()) {
//            continueButton.click();
//        }
//    } catch (NoSuchElementException e) {
//
//    }
//
//    return this;
//    }
//
//    public MainPage enterPassword(String enterEmail) {
//        driver.findElement(MainPageLocators.passwordInput).sendKeys(enterEmail);
//
//        try {
//            WebElement continueButton = driver.findElement(MainPageLocators.continueButton);
//            if (continueButton.isDisplayed()) {
//                continueButton.click();
//            }
//        } catch (NoSuchElementException e) {
//
//        }
//
//        return this;
//    }
//    public MainPage clickSignInButtonAfterEnteringEmailPassword() {
//        try {
//            WebElement signInButton = driver.findElement(MainPageLocators.signInButtonAfterEnteringEmailPassword);
//            if (signInButton.isDisplayed()) {
//            signInButton.click();
//        }
//        } catch (NoSuchElementException e) {
//
//        }
//        return this;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public String getPassword() {
//        return password;
//    }

}
