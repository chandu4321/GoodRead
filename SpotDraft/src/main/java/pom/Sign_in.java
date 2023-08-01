package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_in extends Pom_repo {

	public Sign_in(WebDriver driver) {
		super(driver);

	}

	@FindBy(linkText = "Sign In")
	private WebElement SignIn;
	
	@FindBy(xpath = "//button[contains(text(),'Sign in with email')]")
	private WebElement SignInEmail;
	
	@FindBy(id = "ap_email")
	private WebElement Email;
	
	@FindBy(id = "ap_password")
	private WebElement Password;
	
	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getSignInEmail() {
		return SignInEmail;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	@FindBy(id = "signInSubmit")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//img[@alt='Chandana']")
	private WebElement Profile;
	
	@FindBy(linkText = "Sign out")
	private WebElement logoutButton;

	public WebElement getProfile() {
		return Profile;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
}

