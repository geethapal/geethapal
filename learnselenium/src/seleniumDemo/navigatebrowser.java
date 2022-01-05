/**
 * 
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author 002W1J744
 *
 */
public class navigatebrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\atomation software\\chromedriver_win32\\chromedriver.exe");                                           
		WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.get("http//demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		driver.findElement(By .linkText("Register")).click();
		
// to go back
		driver.navigate().back();
		
//to go forward
		driver.navigate().forward();
		
//to go to home page
		driver.navigate().to("http//demowebshop.tricentis.com");
//to refresh
		driver.navigate().refresh();
		
		
		
		
		
		
	}

}
