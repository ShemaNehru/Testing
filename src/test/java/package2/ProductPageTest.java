package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import package1.BasePage;
import package1.HomePageObject;
import package1.ProductPageObject;

public class ProductPageTest {

		 
@Test

@Parameters({"url","UserName","Password"})
public void verifyLogin(String url,String UserName,String Password) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	WebElement un=driver.findElement(By.id("txtUsername"));
	un.clear();
	un.sendKeys(UserName);
	WebElement psw=driver.findElement(By.id("txtPassword"));
	psw.clear();
	psw.sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();
	
}



}
	

