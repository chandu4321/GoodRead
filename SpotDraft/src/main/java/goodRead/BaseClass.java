package goodRead;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pom.Sign_in;
/***
 * 
 * @author Chandana
 *
 */
public class BaseClass {
	public WebDriver driver;
	
	
	@BeforeClass
	public void browserSetUp() throws IOException {
		String URL=ReadData.fromPropertyFile("url");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser window maximized",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		Reporter.log("user Nagivated to URL Successfully",true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("User Nagivated Sucessfully",true);
		Sign_in signIn=new Sign_in(driver);
		signIn.getSignIn().click();
		signIn.getSignInEmail().click();
		signIn.getEmail().sendKeys(ReadData.fromPropertyFile("email"));
		signIn.getPassword().sendKeys(ReadData.fromPropertyFile("password"));
		signIn.getSubmitButton().click();
		Reporter.log("User login Sucessfully",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Sign_in signIn=new Sign_in(driver);
		signIn.getProfile().click();
		signIn.getLogoutButton().click();
		Reporter.log("User Logout Sucessfully",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Browser closed Sucessfully",true);
	}
	

}
