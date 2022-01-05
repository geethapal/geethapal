package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\atomation software\\chromedriver_win32\\chromedriver.exe");                                           
	WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("txtusername")).sendKeys("geetha.palani@ibm.com");
    driver.findElement(By.name("txtPassword")).sendKeys("geetha@20");
    
	driver.findElement(By.xpath("//input[@value='Log in']")).click();               //login page
	
	driver.findElement(By.linkText("logout")).click();                              //login page link
	
	driver.close();
	
	}

	
	
}
