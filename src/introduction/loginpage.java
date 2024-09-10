package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver driver;
	
	loginpage(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement user_email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement User_password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement user_login;
	
	
	public void setusername(String uname) throws InterruptedException {
		Thread.sleep(30);
	user_email.sendKeys(uname);	
		
	}
	
	public void setpassword(String pwd) throws InterruptedException {
		Thread.sleep(30);
		User_password.sendKeys(pwd);
	}
	
public void loginclick() throws InterruptedException {
	Thread.sleep(30);
	user_login.click();
}

}
