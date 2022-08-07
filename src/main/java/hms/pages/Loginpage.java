package hms.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.testbase.Testbase;

public class Loginpage extends Testbase {
	
	@FindBy(tagName = "img")WebElement logo;
	@FindBy(css = "h3.font-white")WebElement logintext;
	@FindBy(css = "input#email")WebElement usertext;
	@FindBy(css = "input#password")WebElement passwordtext;
	@FindBy(css = "button.btn")WebElement signin;
	@FindBy(css = "img.topuser-image")WebElement profile;
	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[2]/h5")WebElement profileText;
	@FindBy(css = "div.sspass>a:nth-child(3)")WebElement logout;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
public String getpagetitle()
{
	return driver.getTitle();
	
}
public boolean islogodispalyed()
{
	return logo.isDisplayed();
}
public String getlogintitle()
{
	return logintext.getText();	
}
public Frontofficepage adminlogin(String user,String pass)
{
	usertext.sendKeys(user);
	passwordtext.sendKeys(pass);
	signin.click();
	return new Frontofficepage();
	
}
public String getprofiletext()
{
	profile.click();
	return profileText.getText();
	
}
public void clickonlogout()
{
	logout.click();
}

}
