package tests_AssignmentTask_BlocksOne;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page_Object_Model.Home_Page;
import utility_AssignmentTask_BlocksOne.Base_Class;

public class Scenario_One extends Base_Class{

	@Test
	public void search_for_the_Product()
	{
		Home_Page hp = PageFactory.initElements(driver, Home_Page.class);

		hp.getTxt_SearchBox().click();
		hp.getTxt_SearchBox().sendKeys("Laptop");
		hp.getBtn_Search().click();

		String verifyResult_page= hp.getVerify_resultPage().getText();
		if(verifyResult_page.contains("Laptop"))
		{
			System.out.println("Verified--->>> search results page DISPLAYS results related to LAPTOP: "+verifyResult_page);
		}else
		{
			System.out.println("search results page DOES NOT displays results related to Laptop");
		}

	}

}
