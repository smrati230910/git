package introduction;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumclass {


    public static void main(String[] args) {
        //chrome launch
		
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		  driver.get("https://www.flipkart.com/"); 
		  String title=driver.getTitle(); System.out.println(title);
		//driver.findElement(By.linkText("login")).click();
		  Set<String>ls=driver.getWindowHandles();
		  java.util.Iterator<String> li=ls.iterator();
			String ParentID= li.next();
			String ChildID=li.next();
		  
		  driver.switchTo().window(ChildID);
		driver.findElement(By.cssSelector("button[fdprocessedid=brpxl]")).click();

		
		System.out.println(driver.getCurrentUrl()); driver.close();
		 
    	
	
		/*
		 * //Firefox launch System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Administrator\\Desktop\\geckodriver.exe"); WebDriver fdriver= new
		 * FirefoxDriver(); fdriver.get("https://www.flipkart.com/");
		 */
    }

}