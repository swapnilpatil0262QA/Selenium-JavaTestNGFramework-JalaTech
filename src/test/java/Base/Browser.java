package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver launchChrome() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--disable-features=NetworkService");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-save-password-bubble");
		chromeOptions.addArguments("--disable-infobars");
//		chromeOptions.addArguments("--headless=new");
		chromeOptions.addArguments("--incognito");

		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		return driver;
		
	}

}