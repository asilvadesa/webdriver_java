package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDrownPage {

    private WebDriver driver;

    @FindBy(id = "dropdown")
    private WebElement dropdrown;

    public DropDrownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectFromDropDrown(String option){
        findDropDrownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> allSelectedOptions = findDropDrownElement().getAllSelectedOptions();
        return allSelectedOptions.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    private Select findDropDrownElement(){
        return new Select(dropdrown);
    }
}
