package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwn  {

	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		  
		  driver.get("https://rahulshettyacademy.com/AutomationPractice//");
		  driver.manage().window().maximize();
		  WebElement option=driver.findElement(By.id("dropdown-class-example"));
		  Select s = new Select(option);
		  
		  //s.selectByIndex(3);
		 // s.selectByValue("option3");
		 // s.selectByVisibleText("Option2");
		List <WebElement> l=s.getOptions();
		System.out.println(l.size());
		
		for(WebElement ls:l) {
			
			System.out.println(ls.getText());
			
		if(ls.getText().equalsIgnoreCase("Option2")){
			
			ls.click();
			
			}
			
		}
		  

	}

}
