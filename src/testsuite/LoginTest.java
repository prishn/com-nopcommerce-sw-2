package testsuite;
/**
 * .Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully
 * click on the ‘Login’ link
 * Verify the text ‘Welcome, Please Sign In!’
 * <p>
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * click on the ‘Login’ link
 * Enter valid username
 * Enter valid password
 * Click on ‘LOGIN’ button
 * Verify the ‘Log out’ text is display
 * <p>
 * 3. verifyTheErrorMessage
 * click on the ‘Login’ link
 * Enter invalid username
 * Enter invalid password
 * Click on Login button
 * Verify the error message (‘Login was unsuccessful. Please correct the errors and try again. No customer account found')
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/ ";

    @Before
    public void setUp() {

        openBrowser();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        Thread.sleep(2000);
        //Expected Text
        String expectedText = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText = actualTextElement.getText();
        Thread.sleep(2000);
        //verify expected and actual text
        Assert.assertEquals("Incorrect Welcome Text", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //Find the login link and click on login link
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
        //Enter valid username
        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("loiuse_carlo@gmail.com");
        Thread.sleep(2000);
        //Enter valid password
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("12345678");
        Thread.sleep(2000);
        //Click on login
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        Thread.sleep(2000);
        //Verify the logout text is display
        String expectedResult = "Log out";
        String actualResult = driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).getText();
        //verify expected and actual text
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    // verifyTheErrorMessage
    public void verifyTheErrorMessage() throws InterruptedException {
        //Find the login link and click on login link
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
        //Enter Invalid username
        driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
        Thread.sleep(2000);
        //Enter Invalid password
        driver.findElement(By.name("Password")).sendKeys("abc123");
        Thread.sleep(2000);
        //click on login button
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        Thread.sleep(2000);
        //Verify the error message
        String expectedOutput = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualOutput = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        //verify expected and actual text
        Assert.assertEquals("Error Message not displayed", expectedOutput, actualOutput);
    }

    @After
    public void tearDown() {

        //closeBrowser();
    }
}
