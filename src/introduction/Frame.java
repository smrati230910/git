package introduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		driver.get("http://the-internet.herokuapp.com/");



		driver.findElement(By.linkText("Nested Frames")).click();



		driver.switchTo().frame("frame-top");



		driver.switchTo().frame("frame-bottom");



		System.out.println(driver.findElement(By.id("content")).getText());



		}

		

}


