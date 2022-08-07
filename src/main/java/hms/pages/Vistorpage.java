package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hms.testbase.Testbase;

public class Vistorpage extends Testbase{
	
	@FindBy(css = "h3.box-title")WebElement tabletittle; 
	@FindBy(css = "div.box-tools>a")WebElement addvistor;
	@FindBy(xpath ="//h4[text()=' Add Visitor']")WebElement screentittle;
	@FindBy(css = "form#formadd select[name='purpose']")WebElement purpose;
	@FindBy(css = "form#formadd input[name='name']")WebElement pname;
	@FindBy(css = "form#formadd input[name='contact']")WebElement phno;
	@FindBy(css = "form#formadd input[name='id_proof']")WebElement idprof;
	@FindBy(css = "form#formadd input[name='pepples']")WebElement noper;
	@FindBy(css = "form#formadd input[name='date']")WebElement datepicker;
	@FindBy(css = "form#formadd textarea[name='note']")WebElement note;
	@FindBy(css = "form#formadd input[name='file']")WebElement upfile;
	
	public Vistorpage()
	{
		PageFactory.initElements(driver, this);
	}
	public String gettabletittle()
	{
		return tabletittle.getText();
		
	}
	public void clickonvistor()
	{
		addvistor.click();
	}
	public String getscreentittle()
	{
		waitforelement(screentittle);
		return screentittle.getText();
		
	}
	public void addvistordetails() {
	Select drp=new Select(purpose);
	drp.selectByVisibleText("investigate");
	pname.sendKeys("siva");
	phno.sendKeys("9943303");
	idprof.sendKeys("aadhar");
	noper.sendKeys("4");
	//datepicker
	note.sendKeys("lalla");
	//upfile
	}
}
