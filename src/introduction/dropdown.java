package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver =new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		  
		  driver.get("https://www.makemytrip.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.findElement(By.id("fromCity")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.cssSelector("li#react-autowhatever-1-section-0-item-2")).click();
	
		  driver.findElement(By.id("toCity")).click();
		  driver.findElement(By.cssSelector("li#react-autowhatever-1-section-0-item-3")).click();
		  
		 
		  

	}

}
