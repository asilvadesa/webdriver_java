package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameElement;

    @FindBy(id = "password")
    private WebElement passwordElement;

    @FindBy(tagName = "button")
    private WebElement loginButtonElement;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username){
        usernameElement.sendKeys(username);
    }

    public void setPassword(String password){
        passwordElement.sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        loginButtonElement.click();
        return new SecureAreaPage(driver);
    }

}
