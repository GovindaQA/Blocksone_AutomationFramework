package tests_AssignmentTask_BlocksOne;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import page_Object_Model.MetaMask_POM;
import utility_AssignmentTask_BlocksOne.Meta_BaseClass;

public class TrialAndError extends Meta_BaseClass
{
	private static WebDriverWait wait;
	private static MetaMask_POM meta;

	@Test
	public void verify_window() throws InterruptedException
	{
		/**	String parentWindow= driver.getWindowHandle();
		System.out.println("Parent window is:"+parentWindow);
		Set<String>s=driver.getWindowHandles();
		for(String p:s)
		{
			if(!p.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(p);
				System.out.println("child: "+p);
			}
		}driver.switchTo().window(parentWindow);
		Set<String>ss=driver.getWindowHandles();
		for(String q:ss)
		System.out.println(ss.size()+"childparent: "+q);*/
		//		-----------------------------Now A logic to handle the metamask window--------------

		meta = PageFactory.initElements(driver, MetaMask_POM.class);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
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
		Set<String> beforeClickWindows = driver.getWindowHandles();
		for(String b:beforeClickWindows)
		{
			System.out.println("--beforeClickWindows::"+b);
		}

		options.addArguments("--disable-extensions");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//abbr[text()='Connect']"))).click();
		Thread.sleep(10000);

		Set<String> afterClickWindows = driver.getWindowHandles();
		for(String a:afterClickWindows)
		{
			System.out.println("--AfterClickWindows::"+a);
		}
		for(String afterClickWindow: afterClickWindows )
		{
			if(!beforeClickWindows.contains(afterClickWindow))
			{
				driver.switchTo().window(afterClickWindow);
				System.out.println("switch to metamask is passed");
				System.out.println(driver.getCurrentUrl());
				List<WebElement>ls=driver.findElements(By.tagName("a"));
				for(WebElement l:ls)
				{
					String s=l.getText();
					System.out.println(s);
					}
//				driver.close();
//				WebElement element = driver.findElement(By.xpath("//button[text()='Next']"));
//				wait.until(ExpectedConditions.elementToBeClickable(element)).click();

			}
			else
			{
				System.out.println("switch to metamask is fail");
			}
		}
		
 driver.quit();
	}
}
