package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehr {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\atomation software\\chromedriver_win32\\chromedriver.exe");                                           
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();               //login page
	
		driver.findElement(By.xpath("//a@id='welcome']")).click();
		
		
		
		
		driver.findElement(By.linkText("logout")).click();                              //login page link
		
		driver.close();
		
	  
	    
		
		
		
		
		
		
		
		
		
	}

}
