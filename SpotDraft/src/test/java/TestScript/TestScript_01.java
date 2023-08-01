package TestScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import goodRead.BaseClass;
import pom.Home_Page;
/***
 * 
 * @author Chandana
 *
 */
public class TestScript_01 extends BaseClass {
	@Test
	public void Script() throws InterruptedException {
		Home_Page homePage=new Home_Page(driver);
		homePage.getSearchButton().sendKeys("Jungle Book", Keys.ENTER);
		homePage.getWantToRead().click();
		Reporter.log("User clicked on Want To Read",true);
		Thread.sleep(2000);
		homePage.getMyBookButton().click();
		homePage.getRemoveButton().click();
		Reporter.log("User Removed Books Sucessfully",true);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
