package page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {
	/** WebElements for first scenario  **/
	@FindBy(id="twotabsearchtextbox")
	private WebElement txt_SearchBox;

	@FindBy(id="nav-search-submit-button")
	private WebElement btn_Search;
	
	/** ------------------------------**/

	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement verify_resultPage;

	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	private WebElement btn_addToCart;

	@FindBy(xpath="//span[@id='sc-subtotal-label-buybox']")
	private WebElement verify_txt_Subtotalitem;


	@FindBy(xpath="//span[@id='productTitle']")
	private WebElement verify_Product_Details_has_Text_Laptop;


	@FindBy(xpath="//span[@id='attach-sidesheet-view-cart-button']")
	private WebElement btn_CartOnly_ToGoOnProductPage;

	@FindBy(xpath="//span[@id='attach-sidesheet-view-cart-button-announce']/preceding-sibling::input")
	private WebElement btn_CART_forMovingToCartPage;
	
	@FindBy(xpath="//span[@id='sc-subtotal-label-buybox']")
	private WebElement verify_SubtotalChangesTo_Item1;
	
	/** To delete the product */
	
	@FindBy(xpath="//input[contains(@name,'submit.delete.')]")
	private WebElement txt_Delete_The_Added_Product;
	
	
	@FindBy(xpath="//span[@id='sc-subtotal-label-activecart']")
	private WebElement verifyText_CartIsEmpty;
	

	public WebElement getTxt_SearchBox() {
		return txt_SearchBox;
	}

	public WebElement getBtn_Search() {
		return btn_Search;
	}

	public WebElement getVerify_resultPage() {
		return verify_resultPage;
	}

	public WebElement getBtn_addToCart() {
		return btn_addToCart;
	}

	public WebElement getVerify_txt_Subtotalitem() {
		return verify_txt_Subtotalitem;
	}

	public WebElement getVerify_Product_Details_has_Text_Laptop() {
		return verify_Product_Details_has_Text_Laptop;
	}

	public WebElement getBtn_CartOnly_ToGoOnProductPage() {
		return btn_CartOnly_ToGoOnProductPage;
	}

	public WebElement getBtn_CART_forMovingToCartPage() {
		return btn_CART_forMovingToCartPage;
	}

	public WebElement getVerify_SubtotalChangesTo_Item1() {
		return verify_SubtotalChangesTo_Item1;
	}

	public WebElement getTxt_Delete_The_Added_Product() {
		return txt_Delete_The_Added_Product;
	}

	public WebElement getVerifyText_CartIsEmpty() {
		return verifyText_CartIsEmpty;
	}

}