package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class SearchEmployeePage {

	private WebDriver driver;
	 SoftAssert softAssert = new SoftAssert();

	
	@FindBy(xpath="//h3")
	private WebElement headerEmployeeSearch;
	
	@FindBy(xpath="//*[@class='btn btn-info btn-sm']")
	private WebElement btnAddEmployee;
	
	
	@FindBy(xpath="//input[@id=\"Name\"]")
	private WebElement nameTextbox;
	
	@FindBy(xpath="//*[@class= 'btn btn-success m-r-xs']")
	private WebElement searchButton;
	
	@FindBy(xpath="(//*[@title='Delete'])[1]")
	private WebElement btnDeleteEmployee;
	
	@FindBy(xpath="(//*[@role='dialog'])[1]")
	private WebElement popupDeleteEmployee;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement btnYes;
	
	@FindBy(xpath="//*[@class= 'btn btn-success btn-xs']")
	private WebElement btnEditEmployee;
	
	
	@FindBy(xpath="//h1")
	private WebElement headerEmployeeEdit;
	
	
	public SearchEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifySearchEmployeeHeader() throws InterruptedException {
		Thread.sleep(1000);
		softAssert.assertTrue(headerEmployeeSearch.isDisplayed(), "Employee Search header is not displayed!");
		String Header = headerEmployeeSearch.getText();
        System.out.println("Hedaer text = "+ Header );

        
	}
        
        public void clickAndEnterName(String name) throws InterruptedException {
    		Thread.sleep(500);
    		nameTextbox.click();
    		Thread.sleep(500);
    		nameTextbox.clear();
    		Thread.sleep(500);
    		nameTextbox.sendKeys(name);
    		Thread.sleep(500);
        }
        
        public void clickSearchButton() throws InterruptedException {
    		Thread.sleep(500);
    		searchButton.click();
    		Thread.sleep(500);
    	}
        
        public void clickDeleteEmployeeBtn() throws InterruptedException {
    		Thread.sleep(500);
    		btnDeleteEmployee.click();
    		Thread.sleep(500);
    		if(popupDeleteEmployee.isDisplayed()) {
    		Thread.sleep(500);
        	btnYes.click();	
        	Thread.sleep(500);
    		}		
        }
    		public void clickBtnAddEmployee() throws InterruptedException {
        		Thread.sleep(500);
        		btnAddEmployee.click();
        		Thread.sleep(500);
    	}
        
    		public void clickBtnEditEmployee() throws InterruptedException {
        		Thread.sleep(500);
        		btnEditEmployee.click();
        		Thread.sleep(500);
    	}

    		public void verifyEditEmployeeHeader() throws InterruptedException {
    			Thread.sleep(1000);
    			softAssert.assertTrue(headerEmployeeEdit.isDisplayed(), "Employee Edit header is not displayed!");
    			String Header = headerEmployeeEdit.getText();
    	        System.out.println("Hedaer text = "+ Header );

    		}
}
