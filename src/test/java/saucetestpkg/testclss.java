package saucetestpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Basepkg.Baseclss;
import sauceexcelpkg.excelutility;
import saucepagepkg.pageclss;


public class testclss extends Baseclss {
	@Test
	public void verifyLoginWithValidCred()throws Exception
	{
		pageclss p1=new pageclss(driver);
		String xl="D:\\sauce.xlsx";
		String sheet="sheet1";
		int rowCount=excelutility.getRowCount(xl, sheet);
		for(int i=1;i<=rowCount;i++)
			
		{
			p1.unclearclick();
						
			String UserName=excelutility.getCellValue(xl, sheet, i,0);
			System.out.println("username---"+UserName);
			p1.psclearclick();
			String Pwd=excelutility.getCellValue(xl, sheet, i, 1);
			System.out.println("password---"+Pwd);
			p1.setvalues(UserName, Pwd);
			p1.clicklogin();
			p1.refresh();
			
			
		}
		String expec="https://www.saucedemo.com/inventory.html";
		String actual=driver.getCurrentUrl();
		if(actual.equalsIgnoreCase(expec))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		p1.product01();
		p1.product02();
		p1.product03();
		p1.product04();
		p1.product05();
		p1.product06();
		p1.cartclick();
		p1.checkoutclick();
		p1.details();
		p1.cancelbutton();
		p1.homeburgermenu();
		p1.logoutclick();
	}
	

}
