package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class option {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice//");
		WebElement radio = driver.findElement(By.xpath("//input[@value='radio2']"));// .click();
		radio.click();
		System.out.println(radio.isEnabled());
		System.out.println(radio.isDisplayed());
		System.out.println(radio.isSelected());
		System.out.println(radio.getText());
		System.out.println(radio.getTagName());

		WebElement ls = driver.findElement(By.id("checkBoxOption2"));
		ls.click();

		System.out.println(ls.isEnabled());

		driver.findElement(By.cssSelector("input#name")).sendKeys("smrati");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.close();

	}

}
