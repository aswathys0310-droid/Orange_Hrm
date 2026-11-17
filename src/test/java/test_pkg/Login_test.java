package test_pkg;

import org.testng.annotations.Test;

import base_pkg.Base_class;
import page_pkg.Loginpage;

public class Login_test extends Base_class{
	
	@Test(priority =1)
	public void login()
	{
		Loginpage obj = new Loginpage(driver);
		obj.login_mthd();
	}

}
