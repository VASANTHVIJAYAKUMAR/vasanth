package POJ;

import org.facebook.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {

	public Pojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBys({

			@FindBy(name = "username"), @FindBy(xpath = "//input[@class='login_input']")

	})

	private WebElement txtuser;

	@FindBy(id = "password")

	private WebElement txtpass;

	@FindBy(name = "login")

	private WebElement login;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogin() {
		return login;
	}

}
