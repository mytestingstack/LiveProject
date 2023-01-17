package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormDelivery {
public WebDriver driver;
	
	By firstNameField = By.cssSelector("input[name='firstname']");
	By lastNameField = By.cssSelector("input[name='lastname']");
	By companyNameField = By.cssSelector("input[name='company']");
	By addressField = By.cssSelector("input[name='address1']");
	By addressComplementField = By.cssSelector("input[name='address2']");
	By cityField = By.cssSelector("input[name='city']");
	By stateDropdown = By.cssSelector("select[name='id_state']");
	By postcodeField = By.cssSelector("input[name='postcode']");
	By countryDropdown = By.cssSelector("select[name='id_country']");
	By phoneField = By.cssSelector("input[name='phone']");
	By invoiceSameAddCheckboc = By.cssSelector("input#use_same_address");
	By continueBtn = By.cssSelector("button[name='confirm-addresses']");
	
	public OrderFormDelivery(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstNameField() {
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastnameField() {
		return driver.findElement(lastNameField);
	}

	public WebElement getCompanyField() {
		return driver.findElement(companyNameField);
	}
	
	public WebElement getAddressField() {
		return driver.findElement(addressField);
	}
	
	public WebElement getAddressCompField() {
		return driver.findElement(addressComplementField);
	}
	
	public WebElement getCityField() {
		return driver.findElement(cityField);
	}
	
	public WebElement getStateDropdown() {
		return driver.findElement(stateDropdown);
	}
	
	public WebElement getPostcodeField() {
		return driver.findElement(postcodeField);
	}
	
	public WebElement getCountryDropdown() {
		return driver.findElement(countryDropdown);
	}

	public WebElement getPhoneField() {
		return driver.findElement(phoneField);
	}
	
	public WebElement getInvoiceSameAddCheckbox() {
		return driver.findElement(invoiceSameAddCheckboc);
	}
	
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	
}
