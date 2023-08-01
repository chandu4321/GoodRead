package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Pom_repo{
	
	public  Home_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "q")
	private WebElement SearchButton;
	
	@FindBy(xpath = "(//span[text()='Want to Read'])[1]")
	private WebElement WantToRead;
	
	@FindBy(linkText = "My Books")
	private WebElement MyBookButton;
	
	public WebElement getSearchButton() {
		return SearchButton;
	}

	
	public WebElement getWantToRead() {
		return WantToRead;
	}


	public WebElement getMyBookButton() {
		return MyBookButton;
	}

	public WebElement getRemoveButton() {
		return RemoveButton;
	}

	@FindBy(xpath = "//img[@alt='Remove from my books']")
	private WebElement RemoveButton;
	
//	@FindBy(xpath = "//span[text()='Want to read']")
//	private WebElement Want_To_Read;
//
//	public WebElement getWant_To_Read() {
//		return Want_To_Read;
	//}
	
}