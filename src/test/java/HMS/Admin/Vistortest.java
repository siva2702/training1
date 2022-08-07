package HMS.Admin;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.pages.Frontofficepage;
import hms.pages.Loginpage;
import hms.pages.Vistorpage;
import hms.testbase.Testbase;

public class Vistortest extends Testbase{
	
	Loginpage objlog;
	Frontofficepage objff;
	Vistorpage objvis;
	public Vistortest()
	{
		super();
	}
@BeforeMethod
public void setup() {
	initilization();
	objlog=new Loginpage();
	objff=objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	objff.clickonfrontoffice();
	objvis=objff.clickonvistorbook();
}

	@Test
	public void addvistordetails()
	{
		String actualtitle=objvis.gettabletittle();
		String expectedtitle="Visitor List";
		assertEquals(actualtitle, expectedtitle);
		objvis.clickonvistor();
		
		String actualscreentitle=objvis.getscreentittle();
		String expectedscreentitle="Add Visitor";
		assertEquals(actualscreentitle, expectedscreentitle);
		objvis.addvistordetails();
	}
}
