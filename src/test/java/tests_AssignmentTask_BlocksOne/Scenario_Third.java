package tests_AssignmentTask_BlocksOne;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page_Object_Model.Home_Page;
import utility_AssignmentTask_BlocksOne.Base_Class;

public class Scenario_Third extends Base_Class
{
	@Test(enabled=true)
	public void remove_A_Product_FromCart()
	{
		Home_Page hp = PageFactory.initElements(driver, Home_Page.class);
		hp.getTxt_SearchBox().click();
		hp.getTxt_SearchBox().sendKeys("Laptop");
		hp.getBtn_Search().click();

		/**		click on the first product and verify the product */

		hp.getVerify_resultPage().click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		String verify_The_Product = hp.getVerify_Product_Details_has_Text_Laptop().getText();
		if(verify_The_Product.contains("Laptop"))
		{
			System.out.println("Verified--->>> On the product details page, product title contains the word:<<laptop>>");
		}
		else
		{
			System.out.println("verification failed for product details page");
		}

		/**	now click on add to cart button and verify the cart subtotal*/

		hp.getBtn_addToCart().click();
		hp.getBtn_CartOnly_ToGoOnProductPage().click();

		String subTotal =hp.getVerify_SubtotalChangesTo_Item1().getText();
		if (subTotal.contains("1 item")) 
		{
			System.out.println("Verified--->>>The Product successfully Added To Cart ");
		}else
		{
			System.out.println("unable to add the product to cart");

		}

		/**---Now Delete the product and verify the cart is Empty---*/
		hp.getTxt_Delete_The_Added_Product().click();

		String verify_CartISEmpty = hp.getVerifyText_CartIsEmpty().getText();
		if(verify_CartISEmpty.contains("0 items"))
		{
			System.out.println("Verified--->>>Product is removed and cart is empty: "+verify_CartISEmpty);
		}else
		{
			System.out.println("unable to remove the Product");

		}
	}

}
