package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Browser;
import Pages.CreateEmployeePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchEmployeePage;
import Util.Utility;

public class JalaTechnologiesDemo extends Browser {
     WebDriver driver;
	LoginPage loginPage;
	CreateEmployeePage createEmployeePage;
	HomePage homePage;
	SearchEmployeePage searchEmployeePage;
	@BeforeTest
	public void launchBrowser() {
        driver = launchChrome();  
	}
	
	@BeforeClass
	private void createObject() {
		loginPage= new LoginPage(driver);
		createEmployeePage = new CreateEmployeePage(driver);
		homePage= new HomePage(driver);
		searchEmployeePage=new SearchEmployeePage(driver);

	}
	
	@BeforeMethod
	public void launchURL() {
		driver.get("https://magnus.jalatechnologies.com");
	}
	
	@Test
	public void verifyLoginPage() throws InterruptedException {
		String logInPageTitle = driver.getTitle();
		System.out.println(logInPageTitle);
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
		homePage.verifyPageTitleAfterLogin();
		homePage.clickLabelEmployee();
		homePage.verifyLableEmployeeOptionsDisplayed();
		homePage.clickOptionCreate();
		createEmployeePage.verifyCreateEmployeeHeader();
		createEmployeePage.clickAndEnterfirstName("Swap");
		createEmployeePage.clickAndEnterlastName("Patil");
		createEmployeePage.clickAndEnteremail("abc@gmail.com");
		createEmployeePage.clickAndEntermobileNumber("9876543210");
		createEmployeePage.clickAndEnterdob("12/02/2000");
		createEmployeePage.clickRadioButtonMale();
		createEmployeePage.clickAndEnterAdress("Viman Nagar");
		createEmployeePage.clickAndSelectCountry("India");
		createEmployeePage.clickAndSelectCity("Pune");
		createEmployeePage.clickCheckboxQAAutomation();
		createEmployeePage.clickSaveButton();
		homePage.clickOptionSearch();
		searchEmployeePage.verifySearchEmployeeHeader();
		searchEmployeePage.clickAndEnterName("Swap");
		searchEmployeePage.clickSearchButton();
		searchEmployeePage.clickDeleteEmployeeBtn();
		homePage.clickLableMore();
		homePage.verifyMultipleTab();
		homePage.verifyLabelMenu();
		homePage.verifyLabelCollapsibleContent();
		
	}
	
	@AfterMethod
	private void logout(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.captureScreenShot(driver);
			
		}
		System.out.println("aftermethod");

	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
	

}
