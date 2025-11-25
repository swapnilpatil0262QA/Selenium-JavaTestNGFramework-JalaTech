package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CreateEmployeePage {
	private WebDriver driver;
	 SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath="//h1")
	private WebElement headerCreateEmployeePage;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstNameTextbox;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastNameTextbox;
	
	@FindBy(xpath="//input[@id='EmailId']")
	private WebElement emailTextbox;
	
	@FindBy(xpath="//input[@id='MobileNo']")
	private WebElement mobileNumberTextbox;
	
	@FindBy(xpath="//input[@id='DOB']")
	private WebElement dobTextbox;
	
	@FindBy(xpath="//input[@id='rdbMale']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="//*[@id='Address']")
	private WebElement inputAdress;
	
	@FindBy(xpath="//*[@id='CountryId']")
	private WebElement countryDropdown;
	
	@FindBy(xpath="//*[text()='India']")
	private WebElement optionIndia;
	
	@FindBy(xpath="//*[@id='CityId']")
	private WebElement cityDropdown;
	
	@FindBy(xpath="//*[text()='Pune']")
	private WebElement optionPune;
	
	//@FindBy(xpath="//*[@id='chkOtherCity']")
	//private WebElement otherCityCheckbox;
	
	@FindBy(xpath="//*[@id='chkSkill_1']")
	private WebElement skillCheckbox;
	
	@FindBy(xpath="//*[@class= 'btn btn-success m-r-xs']")
	private WebElement saveButton;
	
	@FindBy(xpath="(//*[@class= 'fa fa-dashboard'])[2]")
	private WebElement homebtn;
	
	
	
	
	
	public CreateEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCreateEmployeeHeader() throws InterruptedException {
		Thread.sleep(1000);
		softAssert.assertTrue(headerCreateEmployeePage.isDisplayed(), "Employee Create header is not displayed!");
		String Header = headerCreateEmployeePage.getText();
        System.out.println("Hedaer text = "+ Header );

	}
	
	public void clickAndEnterfirstName(String firstname) throws InterruptedException {
		Thread.sleep(500);
		firstNameTextbox.click();
		Thread.sleep(500);
		firstNameTextbox.clear();
		Thread.sleep(500);
		firstNameTextbox.sendKeys(firstname);
		Thread.sleep(500);
		
	}
	

  public void clickAndEnterlastName(String lastname) throws InterruptedException {
	Thread.sleep(500);
	lastNameTextbox.click();
	Thread.sleep(500);
	lastNameTextbox.clear();
	Thread.sleep(500);
	lastNameTextbox.sendKeys(lastname);
	Thread.sleep(500);
	
  }

public void clickAndEnteremail(String email) throws InterruptedException {
	Thread.sleep(500);
	emailTextbox.click();
	Thread.sleep(500);
	emailTextbox.clear();
	Thread.sleep(500);
	emailTextbox.sendKeys(email);
	Thread.sleep(500);
	
}

public void clickAndEntermobileNumber(String number) throws InterruptedException {
	Thread.sleep(500);
	mobileNumberTextbox.click();
	Thread.sleep(500);
	mobileNumberTextbox.clear();
	Thread.sleep(500);
	mobileNumberTextbox.sendKeys(number);
	Thread.sleep(500);
}

public void clickAndEnterdob(String dob) throws InterruptedException {
	Thread.sleep(500);
	dobTextbox.click();
	Thread.sleep(500);
	dobTextbox.clear();
	Thread.sleep(500);
	dobTextbox.sendKeys(dob);
	Thread.sleep(500);
}

public void clickRadioButtonMale() throws InterruptedException {
	Thread.sleep(500);
	maleRadioButton.click();
	Thread.sleep(500);
	}


public void clickAndEnterAdress(String adress) throws InterruptedException {
	Thread.sleep(500);
	inputAdress.click();
	Thread.sleep(500);
	inputAdress.clear();
	Thread.sleep(500);
	inputAdress.sendKeys(adress);
	Thread.sleep(500);
}
	
	public void clickAndSelectCountry(String countryName ) throws InterruptedException {
		Thread.sleep(1000);
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(countryName); 
        Thread.sleep(500);

	}
	
	public void clickAndSelectCity(String cityName ) throws InterruptedException {
		Thread.sleep(1000);
        Select select = new Select(cityDropdown);
        select.selectByVisibleText(cityName); 
        Thread.sleep(500);
        
	}
	public void clickCheckboxQAAutomation() throws InterruptedException {
		Thread.sleep(500);
		Actions actions = new Actions(driver);
		actions.scrollToElement(skillCheckbox).build().perform();
		skillCheckbox.click();
		Thread.sleep(500);
		
	}
	
	public void clickSaveButton() throws InterruptedException {
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(1000);

	}
	
	public void clickhomebtn() throws InterruptedException {
		Thread.sleep(500);
		homebtn.click();
		Thread.sleep(1000);
	}
	
	
		
	

}
