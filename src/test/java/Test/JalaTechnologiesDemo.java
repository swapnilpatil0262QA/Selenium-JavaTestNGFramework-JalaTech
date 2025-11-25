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
	
	@Test (priority = 1)
	public void verifyLoginFunctionalityWithValidCredentials() throws InterruptedException {
		String logInPageTitle = driver.getTitle();
		System.out.println(logInPageTitle);
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
		homePage.verifyPageTitleAfterLogin();
		
	}
	
	@Test (priority = 2)
	public void verifyLableEmployeeOnHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
	}
	
	@Test (priority = 3)
	public void verifyLableEmploeeOptionsOnHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
		
	    homePage.clickLabelEmployee();
		homePage.verifyLableEmployeeOptionsDisplayed();
		
	}
	
	@Test (priority = 4)
	public void verifyLableEmployeeOptionCreateOnHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		homePage.clickOptionCreate();
	}
	
	@Test (priority = 5)
	public void verifyCreateEmployeeHeaderOnCreateEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		homePage.clickOptionCreate();
		createEmployeePage.verifyCreateEmployeeHeader();
		
	}
	
	@Test (priority = 6)
	public void verifyEmployeePersonalDetailsOnCreateEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionCreate();
	
		createEmployeePage.clickAndEnterfirstName("Swap");
		createEmployeePage.clickAndEnterlastName("Patil");
		createEmployeePage.clickAndEnteremail("abc@gmail.com");
		createEmployeePage.clickAndEntermobileNumber("9876543210");
		createEmployeePage.clickAndEnterdob("12/02/2000");
	}
	
	@Test (priority = 7)
	public void verifyandClickRadioButtonMaleOnCreateEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionCreate();
		createEmployeePage.clickAndEnterfirstName("Swap");
		createEmployeePage.clickAndEnterlastName("Patil");
		createEmployeePage.clickAndEnteremail("abc@gmail.com");
		createEmployeePage.clickAndEntermobileNumber("9876543210");
		createEmployeePage.clickAndEnterdob("12/02/2000");
		createEmployeePage.clickRadioButtonMale();
	}
	
	@Test (priority = 8)
	public void verifyAddressDetailsOnCreateEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionCreate();
		createEmployeePage.clickAndEnterfirstName("Swap");
		createEmployeePage.clickAndEnterlastName("Patil");
		createEmployeePage.clickAndEnteremail("abc@gmail.com");
		createEmployeePage.clickAndEntermobileNumber("9876543210");
		createEmployeePage.clickAndEnterdob("12/02/2000");
		createEmployeePage.clickRadioButtonMale();
		createEmployeePage.clickAndEnterAdress("Viman Nagar");
		createEmployeePage.clickAndSelectCountry("India");
		createEmployeePage.clickAndSelectCity("Pune");

	}
	
	@Test (priority = 8)
	public void verifyAndClickCheckboxQAAutomationonCreateEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionCreate();
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
		
	}
	
	@Test (priority = 9)
	public void verifyAndClickSaveButtononCreateEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionCreate();
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
		
	}
	
	@Test (priority = 10)
	public void verifyLableEmployeeOptionSearchOnHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
	
	}
	
	@Test (priority = 11)
	public void verifySearchEmployeeHeaderonSearchEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
		searchEmployeePage.verifySearchEmployeeHeader();

	}

	@Test (priority = 12)
	public void verifyandClickAddEmployeeBtnOnSearchEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
		searchEmployeePage.clickBtnAddEmployee();
	}
	
	@Test (priority = 13)
	public void verifyAndEnterNameonSearchEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
		
		searchEmployeePage.clickAndEnterName("Swap");
	}
	
	@Test (priority = 14)
	public void verifyAndClickSearchbtnonSearchEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
		
		searchEmployeePage.clickAndEnterName("Swap");

		searchEmployeePage.clickSearchButton();
	
	}
	
	@Test (priority = 15)
	public void verifyAndClickEditEmployeebtnonSearchEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
		
		searchEmployeePage.clickAndEnterName("Swap");

		searchEmployeePage.clickSearchButton();
		searchEmployeePage.clickBtnEditEmployee();
	
	}
	
	@Test (priority = 16)
	public void verifyEditEmployeeHeaderonEditEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
		
		searchEmployeePage.clickAndEnterName("Swap");

		searchEmployeePage.clickSearchButton();
		searchEmployeePage.clickBtnEditEmployee();
		searchEmployeePage.verifySearchEmployeeHeader();
	
	}
	@Test (priority = 17)
	public void verifyAndDeleteEmployeebtnonSearchEmployeePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
	
		homePage.clickLabelEmployee();
		
		homePage.clickOptionSearch();
		searchEmployeePage.clickAndEnterName("Swap");
		searchEmployeePage.clickSearchButton();
		searchEmployeePage.clickDeleteEmployeeBtn();
		
	}
	
	@Test (priority = 18)
	public void verifyAndClickLableMoreonHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
		homePage.clickLableMore();
	
	}
	
	@Test (priority = 19)
	public void verifyAndMultipleTabonHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
		homePage.clickLableMore();
		
		homePage.verifyMultipleTab();
	
	}
	
	@Test (priority = 20)
	public void verifyLableMenuonHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
		homePage.clickLableMore();

		homePage.verifyLabelMenu();
	
	}
	
	@Test (priority = 21)
	public void verifyLableCollapsibleContentonHomePage() throws InterruptedException {
		
		loginPage.clickAndEnterEmail("training@jalaacademy.com");
		loginPage.clickAndEnterPassword("jobprogram");
		loginPage.clickOnSignInButton();
		homePage.clickLableMore();

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
