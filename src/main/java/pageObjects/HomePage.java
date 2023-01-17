package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public WebDriver driver;
	
	By toggle = By.cssSelector(".toggle");
	By homeLink = By.linkText("HOMEPAGE");
	By accordionLink = By.linkText("ACCORDION");
	By browserTabLink = By.linkText("BROWSER TABS");
	By buttonsLink = By.linkText("BUTTONS");
	By calcLink = By.linkText("CALCULATOR (JS)");
	By contactUsLink = By.linkText("CONTACT US FORM TEST");
	By datePickerLink = By.linkText("DATE PICKER");
	By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
	By fileUpload = By.linkText("FILE UPLOAD");
	By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
	By iFrameLink = By.linkText("IFRAME");
	By loaderLink = By.linkText("LOADER");
	By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
	By mouseLink = By.linkText("MOUSE MOVEMENT");
	By popupLink = By.linkText("POP UPS & ALERTS");
	By predictiveLink = By.linkText("PREDICTIVE SEARCH");
	By tablesLink = By.linkText("TABLES");
	By testStoreLink = By.linkText("TEST STORE");
	By aboutMeLink = By.linkText("ABOUT ME");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getToggle() {
		return driver.findElement(toggle);
	}
	
	public WebElement getHomepageLink() {
		return driver.findElement(homeLink);
	}
	
	public WebElement getAccordionLink() {
		return driver.findElement(accordionLink);
	}	
	
	public WebElement getBrowserTabLink() {
		return driver.findElement(browserTabLink);
	}	

	public WebElement getButtonLink() {
		return driver.findElement(buttonsLink);
	}	
	
	public WebElement getCalcLink() {
		return driver.findElement(calcLink);
	}	
	
	public WebElement getContactUsLink() {
		return driver.findElement(contactUsLink);
	}	
	
	public WebElement getDatePickerLink() {
		return driver.findElement(datePickerLink);
	}	
	
	public WebElement getDropdownLink() {
		return driver.findElement(dropdownLink);
	}	
	
	public WebElement getFileUploadLink() {
		return driver.findElement(fileUpload);
	}	
	
	public WebElement getHiddenElementsLink() {
		return driver.findElement(hiddenElementsLink);
	}	
	
	public WebElement getIframeLink() {
		return driver.findElement(iFrameLink);
	}	
	
	public WebElement getLoaderLink() {
		return driver.findElement(loaderLink);
	}	
	
	public WebElement getLoginPortalLink() {
		return driver.findElement(loginPortalLink);
	}	
	
	public WebElement getMouseLink() {
		return driver.findElement(mouseLink);
	}	
	
	public WebElement getPopupLink() {
		return driver.findElement(popupLink);
	}	
	
	public WebElement getPredictiveLink() {
		return driver.findElement(predictiveLink);
	}	
	
	public WebElement getTablesLink() {
		return driver.findElement(tablesLink);
	}	
	
	public WebElement getTestStoreLink() {
		return driver.findElement(testStoreLink);
	}	
	
	public WebElement getAboutMeLink() {
		return driver.findElement(aboutMeLink);
	}
	

}
