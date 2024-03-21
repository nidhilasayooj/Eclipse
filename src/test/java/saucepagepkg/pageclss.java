package saucepagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageclss {
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement sauceusername;
	@FindBy(id="password")
	WebElement saucepassword;
	@FindBy(id="login-button")
	WebElement saucelogin;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement firstproduct;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement secproduct;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement thirdproduct;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement fourthproduct;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement fifthproduct;
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement sixthproduct;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	@FindBy(id="first-name")
	WebElement firstname;
	@FindBy(id="last-name")
	WebElement lastname;
	@FindBy(id="postal-code")
	WebElement pincode;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton;
	@FindBy(xpath="//*[@id=\"cancel\"]")
	WebElement cancel;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement homeburger;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public pageclss(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String un,String pwd)
	{
		sauceusername.sendKeys(un);
		saucepassword.sendKeys(pwd);
		
	}
	public void unclearclick()
	{
		sauceusername.clear();
	}public void psclearclick()
	{
		saucepassword.clear();
		
	}
	public void refresh()
	{
		driver.navigate().refresh();	
		}
	public void clicklogin()
	{
		saucelogin.click();
	}
	public void product01()
	{
		firstproduct.click();
	}
	public void product02()
	{
		secproduct.click();
	}
	public void product03()
	{
		thirdproduct.click();
	}
	public void product04()
	{
		fourthproduct.click();
	}
	public void product05()
	{
		fifthproduct.click();
	}
	public void product06()
	{
		sixthproduct.click();
	}
	public void cartclick()
	{
		cart.click();
	}
	public void checkoutclick()
	{
		checkout.click();
	}
	public void details()
	{
		firstname.sendKeys("nidhila");
		lastname.sendKeys("sayooj");
		pincode.sendKeys("688539");
		continuebutton.click();
	}
	public void cancelbutton()
	{
		cancel.click();
	}
	public void homeburgermenu()
	{
		homeburger.click();
	}
	public void logoutclick()
	{
		logout.click();
	}
	
	

}
