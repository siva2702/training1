package HMS.Admin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.pages.Loginpage;
import hms.testbase.Testbase;

public class Logintest extends Testbase{
	
	Loginpage objlogo;
	public Logintest()
	{
		super();
	}

@BeforeMethod
public void setup()
{
	initilization();
	objlogo=new Loginpage();
	
}
@Test
public void adminlogintest()
{
	String Expectedtitle ="Smart Hospital : Hospital Management System";
	String actualtitle=objlogo.getpagetitle();
	assertEquals(actualtitle, Expectedtitle);
	assertTrue(objlogo.islogodispalyed());
	
	String Expectedlogintitle="Admin Login";
	String actuallogintitle=objlogo.getlogintitle();
	assertEquals(Expectedlogintitle, actuallogintitle);
	objlogo.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	
	String Expectedprofiletext="Super Admin";
	String actualprofiletext=objlogo.getprofiletext();
	assertEquals(Expectedprofiletext, actualprofiletext);
	
	objlogo.clickonlogout();
}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
