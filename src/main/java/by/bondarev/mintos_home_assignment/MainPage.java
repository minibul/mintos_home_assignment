package by.bondarev.mintos_home_assignment;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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

    public void randomFloor() {
        Random random = new Random();
        if (random.nextBoolean()) {
            clickWomenFloor();
        } else {
            clickMenFloor();
        }
    }
    public void clickWomenFloor() {
        driver.findElement(MainPageLocators.womenFloor).click();
    }
    public void clickMenFloor() {
        driver.findElement(MainPageLocators.menFloor).click();
    }


    public void randomCategory() {
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
