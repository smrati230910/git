package introduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		Set<String>windows =driver.getWindowHandles();
		Iterator <String> li=windows.iterator();
		String ParentID= li.next();
		String ChildID=li.next();
		driver.switchTo().window(ChildID);
		
		System.out.println(driver.findElement(By.xpath("//h3[.='New Window']")).getText());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
	
		driver.switchTo().window(ParentID);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		

	}

}
