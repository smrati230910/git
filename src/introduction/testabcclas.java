package introduction;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testabcclas {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
         WebDriver driver= new ChromeDriver();	
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("smr123@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[contains(@title,'My Account')]")).click();
		
		boolean status=driver.findElement(By.xpath("//a[contains(@title,'My Account')]")).isDisplayed();
		
		if(status==true)
		 
		{
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']")).click();
		Assert.assertTrue(true);
			
		}
		else
		{
			Assert.fail();
		}
	}

}
