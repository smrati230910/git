package introduction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testlogin {

WebDriver driver;

@BeforeMethod
public void  setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	
}

@Test
public void testloginfeature() throws InterruptedException {


	loginpage lp=new loginpage(driver);
	
	lp.setusername("smrt129@gmail.com");
	lp.setpassword("sysy123");
	lp.loginclick();
	
	
}


  @AfterClass public void Teardown() { driver.close(); }
 

}
