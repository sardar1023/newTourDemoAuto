package action;


import helper.Credentials;
import helper.Log;
import pageobjects.LoginPage;

public class LoginAction {
	public static void Execute() throws Exception{
		
		
		LoginPage.startAPP();
		
		Log.info("Application Started");
		
		LoginPage.Wait();
		
		LoginPage.txt_userName().sendKeys(Credentials.username);
		
		Log.info("userName inserted");
		
		LoginPage.txt_password().sendKeys(Credentials.password);
		
		Log.info("password inserted");
		
		LoginPage.captureScreenShot();
		
		LoginPage.btn_login().click();
		
		Log.info("Login button clicked");
	}
}
