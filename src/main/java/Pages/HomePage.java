package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;

	
	@FindBy(xpath="//*[contains(@class,'fa fa-users')]")
	private WebElement lableEmployee;
	
	@FindBy(xpath="//*[contains(@class,'fa fa-pencil-square-o')]")
	private WebElement lableEmployeeCreate;

	@FindBy(xpath="//*[@class= 'fa fa-search']")
	private WebElement lableEmployeeSearch;
						
	@FindBy(xpath="(//*[contains(@class,'list')]//following::i)[1]")
	private WebElement lableMore;			
			
	@FindBy(xpath="//*[@href='/Home/Tabs']")
	private WebElement lableMoreMultipleTabst;
	
	@FindBy(xpath="//*[@href='#tab_2']")
	private WebElement tabUnLearning;
	
	@FindBy(xpath="//*[@href='#tab_3']")
	private WebElement tabWaysofUnLearning;
	
	@FindBy(xpath="//*[@href='/Home/Menu']")
	private WebElement lableMoreMenu;
	
	@FindBy(xpath="//*[text()='Java']")
	private WebElement lableSingleMenuJava;
	
	@FindBy(xpath="//*[text()='Sub Menus']")
	private WebElement tabSubMenu;
	
	@FindBy(xpath="//*[text()='Testing' and @class='dropbtn']")
	private WebElement tabTesting;
	
	@FindBy(xpath="//*[text()='Selenium' ]")
	private WebElement subTabSelenium;
	
	@FindBy(xpath="//*[@href='/Home/Collapse']")
	private WebElement lableMoreCollapsibleContent;
	
	@FindBy(xpath="(//*[@role='tablist']//a)[1]")
	private WebElement tileFirstCollapsible;
	
	

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyPageTitleAfterLogin() {
		String loggedInPageTitle = driver.getTitle();
		System.out.println(loggedInPageTitle);
	}
	
	public void clickLabelEmployee() throws InterruptedException {
		Thread.sleep(1000);
		lableEmployee.click();
		Thread.sleep(1000);
		
	}
	
	public void verifyLableEmployeeOptionsDisplayed() {
	boolean status=	lableEmployeeCreate.isDisplayed();
	System.out.println("Option label employee create is displayed = "+status);
	boolean status1=lableEmployeeSearch.isDisplayed();
	System.out.println("Option label employee search is displayed = "+status1);

	}
	
	public void clickOptionCreate() throws InterruptedException {
		Thread.sleep(1000);
		lableEmployeeCreate.click();
		Thread.sleep(1000);
	}
	
	public void clickOptionSearch() throws InterruptedException {
		Thread.sleep(1000);
		lableEmployeeSearch.click();
		Thread.sleep(1000);
	}
		
	public void verifyLabelCollapsibleContent() throws InterruptedException {
		Thread.sleep(1000);
		lableMoreCollapsibleContent.click();
		Thread.sleep(1000);

		if(tileFirstCollapsible.isDisplayed()) {
			tileFirstCollapsible.click();
		}
		Thread.sleep(1000);

	}
	
	
	public void verifyLabelMenu() throws InterruptedException {
		Thread.sleep(1000);
		lableMoreMenu.click();
		Thread.sleep(1000);

		if(lableSingleMenuJava.isDisplayed()) {
			lableSingleMenuJava.click();
		}
		Thread.sleep(1000);
		tabSubMenu.click();
		Thread.sleep(1000);
		if(tabTesting.isDisplayed()) {
		}
		Actions actions = new Actions(driver);
		actions.moveToElement(tabTesting).moveToElement(subTabSelenium).click().build().perform();
		Thread.sleep(1000);

	}
	
	public void verifyMultipleTab() throws InterruptedException {
		Thread.sleep(1000);
		lableMoreMultipleTabst.click();
		Thread.sleep(1000);
		if(tabUnLearning.isDisplayed()) {
			tabUnLearning.click();
			Thread.sleep(1000);

		}
		
		if(tabWaysofUnLearning.isDisplayed()) {
			tabWaysofUnLearning.click();
			Thread.sleep(1000);
		}
	}

	public void clickLableMore() throws InterruptedException {
		Thread.sleep(1000);
		   lableMore.click();
			Thread.sleep(1000);

	}
	
	
			
	}
	
	


