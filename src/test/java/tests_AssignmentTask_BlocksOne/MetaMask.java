package tests_AssignmentTask_BlocksOne;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_Object_Model.MetaMask_POM;
import utility_AssignmentTask_BlocksOne.Base_Class;
import utility_AssignmentTask_BlocksOne.Meta_BaseClass;

public class MetaMask extends Meta_BaseClass
{
	private static WebDriverWait wait;
	private static MetaMask_POM meta;

//	@BeforeMethod
//	public void asetUp()
//	{
//		meta = PageFactory.initElements(driver, MetaMask_POM.class);
//		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//	}
	@Test
	public void openChromeExtension() throws IOException, InterruptedException
	{
		meta = PageFactory.initElements(driver, MetaMask_POM.class);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
//		driver.switchTo().window(tabs.get(1));
		wait.until(ExpectedConditions.elementToBeClickable(meta.getCheckboxonboardingterms())).click();
		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_Create_a_new_wallet())).click();
		//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		//		driver.switchTo().window(tabs.get(0));
		//		driver.close();

		/** ----Help Us Improve MetaMask----*/
		wait.until(ExpectedConditions.elementToBeClickable(meta.getCheckbox_metametrics_opt_in())).click();
		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_IAgree())).click();

		/** ----Create Password Page----*/
		wait.until(ExpectedConditions.elementToBeClickable(meta.getTxt_NewPassowrd())).sendKeys("Metauser@2024");
		wait.until(ExpectedConditions.elementToBeClickable(meta.getTxt_ConfirmPassowrd())).sendKeys("Metauser@2024");
		wait.until(ExpectedConditions.elementToBeClickable(meta.getCheckbox_IUndeerstand_MetaMask())).click();
		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_CreateA_New_Wallet())).click();

		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_remind_Me_Later())).click();
		wait.until(ExpectedConditions.elementToBeClickable(meta.getCheckbox_Account_Security())).click();

		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_Skip_Account_Security())).click();
		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_Got_It())).click();

		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_Next())).click();
		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_Done())).click();
		wait.until(ExpectedConditions.elementToBeClickable(meta.getBtn_Enable())).click();
		driver.navigate().to("https://l1xapp.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//abbr[text()='Connect']"))).click();
		Thread.sleep(20000);
        String parentWindow = driver.getWindowHandle();

        Set<String> childWindow = driver.getWindowHandles();

        for (String handle :childWindow) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                
                System.out.println("Switched to new window: " + driver.getTitle());
                System.out.println(driver.getCurrentUrl()+": "+driver.getPageSource());
//                WebElement web = driver.findElement(By.xpath("//button[text()='Next']"));
//                wait.until(ExpectedConditions.elementToBeClickable(web)).click();
//                
//                driver.close();
            }
//          driver.close(); 
//          WebElement web = driver.findElement(By.xpath("//button[text()='Next']"));
//          wait.until(ExpectedConditions.elementToBeClickable(web)).click();
          
        }
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alt =driver.switchTo().alert();
//		alt.accept();


		/** we have to scroll to top to get the screenshot */
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", meta.getTxt_Account());

//		/** Take the screenshot of the last page and save in the project folder*/
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String filePath= "./Files/ScreenShot.bmp";
//		FileUtils.copyFile(screenshot, new File(filePath));

//		driver.close();
//		Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.CONTROL + "t").perform();
//		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tab.get(1));


	}

}
