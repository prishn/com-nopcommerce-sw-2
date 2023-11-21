package testsuite;
/**
 * Write down the following test into ‘RegisterTest’ class
 * 1. userShouldNavigateToRegisterPageSuccessfully
 * click on the ‘Register’ link
 * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully
 * click on the ‘Register’ link
 * Select gender radio button
 * Enter First name
 * Enter Last name
 * Select Day Month and Year
 * Enter Email address
 * Enter Password
 * Enter Confirm password
 * Click on REGISTER button
 * Verify the text 'Your registration completed
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        WebElement register = driver.findElement(By.linkText("Register"));
        //click on register link
        register.click();
        Thread.sleep(2000);
        WebElement registerPageTitle = driver.findElement(By.className("page-title"));
        System.out.println(registerPageTitle.getText());

        //Verify the next Register
        Assert.assertEquals("Not displayed", "Register", registerPageTitle.getText());
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        //click on 'Register' link
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        Thread.sleep(2000);
        //Select gender radio button
        WebElement genderButton = driver.findElement(By.xpath("//div[@id='gender']//span[@class ='female']"));
        // WebElement genderButton = driver.findElement(By.xpath("//div[@id='gender']//span[@class ='male']"));
        genderButton.click();
        Thread.sleep(2000);
        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Louise");
        Thread.sleep(2000);
        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Carlo");
        Thread.sleep(2000);
        // Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("18");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("December");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");
        Thread.sleep(2000);
        //Enter Email address
       final String randomEmail = randomEmail();
        driver.findElement(By.id("Email")).sendKeys(randomEmail);
        Thread.sleep(2000);
        //Enter Password
        driver.findElement(By.name("Password")).sendKeys("12345678");
        Thread.sleep(2000);
        // Enter Confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("12345678");
        Thread.sleep(2000);
        //Click on REGISTER button
        driver.findElement(By.name("register-button")).click();
        Thread.sleep(2000);
        //Verify the text 'Your registration completed'
        driver.findElement(By.className("result"));
        String expectedOutput = "Your registration completed";
        String actualOutput = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    private static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
