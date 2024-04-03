package Meeshopage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagemesho {
	WebDriver driver;
	@FindBy(xpath = "/html/body/header/div[2]/div[1]/div/div[2]/div[2]/a/div/div")
	WebElement profile;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[1]")
	WebElement sigin;
	@FindBy(xpath="//*[@id=\"si-email\"]")
	WebElement phoneno;
	@FindBy(xpath="//*[@id=\"si-password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"form-id\"]/button")
	WebElement login ;
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/ul[1]/li")
	WebElement category;
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/ul[1]/li/ul/li[1]/a")
	WebElement moblie;
	@FindBy(xpath="//*[@id=\"ajax-products\"]/div[5]/div/div[1]/div[2]/a/img")
	WebElement details;
	@FindBy(xpath="//*[@id=\"add-to-cart-form\"]/div[7]/button[2]/span")
	WebElement cart;
	
	
	public Pagemesho(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvaluea(String Phoneno, String Password)
	{
	profile.click();
	sigin.click();
	phoneno.sendKeys(Phoneno);
	password.sendKeys(Password);
		login.click();
		category.click();
		moblie.click();
		details.click();
		
		
	}
	
	public void clickcart() {
		cart.click();
	}

}
