package seleniumDemo;

import java.util.Iterator;

import org.zeromq.ZStar.Set;

public class iframeDemo
{
	
	Set windowIds=driver.getWindowHandles();
    
    Iterator<String>iter=windowIds.iterator();
                            
    String mainWindow = iter.next();
    String childWindow= iter.next();
                        
    driver.switchTo().window(childWindow);
    
    System.out.println("The title of child window is: "+driver.getTitle());
    Thread.sleep(3000);
    
    //driver.close();
    
    driver.switchTo().window(mainWindow);
    
    Thread.sleep(3000);
    
    System.out.println("The title of main window is: "+driver.getTitle());
    
    driver.quit();
}
}
}
