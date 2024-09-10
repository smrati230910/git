package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abcclass {

	WebDriver driver;

	
	@Parameters({"browser"})
	
	void setup(@Optional("chrome")String br) {
		
		switch(br)
		{
		case "chrome":	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		
		case "edge":
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		break;
			
		case "Firefox":			
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
			
		default:System.out.println("not a valid browser");
		return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
	@Test(dataProvider = "dp1")
	void Login(String uname, String password) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
		
		  //driver.findElement(By.xpath("//a[contains(@title,'My Account')]")).click();
		  
		  
		  boolean
		  status=driver.findElement(By.xpath("//a[contains(@title,'My Account')]")).
		  isDisplayed();
		  
		  if(status==true)
		  
		  {
		  
		  driver.findElement(By.
		  xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']")
		  ).click(); Assert.assertTrue(true);
		  
		  } else { Assert.fail(); }
		 
	}

	@AfterClass
	void teardown() {
		driver.close();
	}

	@DataProvider(name = "dp1")
	Object[][] logindata() {

		Object data[][] = { { "abc123@gmail.com", "abcd123" }, { "xyz123@gmail.com", "xyz123" },
				{ "smr123@gmail.com", "test@123" }, { "smrt129@gmail.com", "sysy123" }

		};

		return data;

	}

}
