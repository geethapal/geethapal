package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\atomation software\\chromedriver_win32\\chromedriver.exe");                                           
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		
		Alert alt1=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.print(alertmessage);
		
		alt1.accept();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		
		driver.findElement(By.linkText("//button[contain(tex(),'clicAlert with OK & Cancel:')]")).click();  
			
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an confirm box:')]")).click();
		
		
		
		
		
		
	
	}

}