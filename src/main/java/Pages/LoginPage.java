package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(xpath="//input[@class='form-control' and @name='UserName']")
	private WebElement emailTextbox;
	
	@FindBy(xpath="//input[@class='form-control' and @name='Password']")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	private WebElement signInButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAndEnterEmail(String mail) throws InterruptedException {
		Thread.sleep(1000);
		emailTextbox.click();
		Thread.sleep(1000);
		emailTextbox.clear();
		Thread.sleep(1000);
		emailTextbox.sendKeys(mail);
		Thread.sleep(1000);

	}
	
	public void clickAndEnterPassword(String pass) throws InterruptedException {
		Thread.sleep(1000);
		passwordTextbox.click();
		Thread.sleep(1000);
		passwordTextbox.clear();
		Thread.sleep(1000);
		passwordTextbox.sendKeys(pass);
		Thread.sleep(1000);
	}
	
	public void clickOnSignInButton() throws InterruptedException {
		Thread.sleep(1000);
		signInButton.click();
		Thread.sleep(1000);

	}
	

	

}
