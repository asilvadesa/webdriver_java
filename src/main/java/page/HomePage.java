package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    @FindBy(linkText = "Dropdown")
    private WebElement dropdownLink;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage clickFormAuthentication(){
        formAuthenticationLink.click();
        return new LoginPage(driver);
    }

    public DropDrownPage clickDropdown(){
        dropdownLink.click();
        return new DropDrownPage(driver);
    }
}
