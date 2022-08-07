package HMS.Admin;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.pages.Frontofficepage;
import hms.pages.Loginpage;
import hms.testbase.Testbase;

public class Frontofficetest extends Testbase{
	
	Loginpage objlog;
	Frontofficepage objff;
	
	public Frontofficetest( ) {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilization();
		objlog=new Loginpage();
		objff=objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}
	@Test
	public void Frontofficetest()
	{
	objff.clickonfrontoffice();
	String Expectedtabletitle="Appointment Details";
	String Actualtabletitle=objff.gettabletitle();
	assertEquals(Actualtabletitle, Expectedtabletitle);
	objff.clickonvistorbook();
	
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
