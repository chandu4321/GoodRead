package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_repo {
	public  Pom_repo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
