package introduction;

import java.awt.dnd.DropTargetListener;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise///");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Code for Login
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("okayBtn")).click();
		WebElement drpdwn = driver.findElement(By.xpath("//*[@class='form-group']/select"));
		Select s = new Select((drpdwn));
		List<WebElement> drp = s.getOptions();
		System.out.println("Size of Dropdown:" + drp.size());
		s.selectByIndex(2);

		for (WebElement ls : drp)

		{
			System.out.println(ls.getText());
		}

		// Select s = new Select((drop);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(6));
		WebElement checkout = driver.findElement(By.xpath("//*[@class='nav-link btn btn-primary']"));
		w.until(ExpectedConditions.visibilityOf(checkout));
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Add')]"));

		for (int i = 0; i < list.size(); i++) {
			list.get(i).click();
		}
		checkout.click();
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();

		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.xpath("//*[@class='suggestions']")).click();
		WebElement checkbox2 = driver.findElement(By.xpath("//div[@class='checkbox checkbox-primary']"));
		//w.until(ExpectedConditions.elementToBeClickable(checkbox2));
		Actions a = new Actions(driver);
		a.moveToElement(checkbox2).click().build().perform();

		driver.findElement(By.xpath("//*[@class='btn btn-success btn-lg']")).click();

	}

}
