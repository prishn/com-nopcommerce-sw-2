package testsuite;
/**
 * Write down the following test into ‘TopMenuTest’  class
 * 1. userShouldNavigateToComputerPageSuccessfully * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’
 * 4. userShouldNavigateToDigitalDownloadsPageSuccessfully * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() throws InterruptedException {
        //click on the ‘Computers’ Tab
        driver.findElement(By.partialLinkText("Computers")).click();
        Thread.sleep(2000);
        //Verify the text ‘Computers’
        String expectedResult = "Computers";
        String actualResult = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Incorrect Tab displayed", expectedResult, actualResult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() throws InterruptedException {
        //click on the ‘Electronics’ Tab
        driver.findElement((By.partialLinkText("Electronics"))).click();
        Thread.sleep(2000);
        //Verify the text ‘Electronics’
        String expectedOutcome = "Electronics";
        String actualOutcome = driver.findElement((By.xpath("//div[@class = 'page-title']"))).getText();
        Assert.assertEquals("Incorrect tab displayed", expectedOutcome, actualOutcome);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() throws InterruptedException {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.partialLinkText("Apparel")).click();
        Thread.sleep(2000);
        // Verify the text ‘Apparel’
        String expectedResult = "Apparel";
        String actualResult = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Wrong Tab displayed", expectedResult, actualResult);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() throws InterruptedException {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.partialLinkText("Digital downloads")).click();
        Thread.sleep(2000);
        //Verify the text ‘Digital downloads’
        String expectedOutcome = "Digital downloads";
        String actualOutcome = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Incorrect Tab displayed", expectedOutcome, actualOutcome);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() throws InterruptedException {
        //click on the ‘Books’ Tab
        driver.findElement(By.partialLinkText("Books")).click();
        Thread.sleep(2000);
        //Verify the text ‘Books’
        String expectedResult = "Books";
        String actualResult = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Incorrect Tab displayed", expectedResult, actualResult);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() throws InterruptedException {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.partialLinkText("Jewelry")).click();
        Thread.sleep(2000);
        //Verify the text ‘Jewelry’
        String expectedResult = "Jewelry";
        String actualResult = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Incorrect Tab Spelling", expectedResult, actualResult);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() throws InterruptedException {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.partialLinkText("Gift Cards")).click();
        Thread.sleep(2000);
        //Verify the text ‘Gift Cards’
        String expectedResult = "Gift Cards";
        String actualResult = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Incorrect Tab displayed", expectedResult, actualResult);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
