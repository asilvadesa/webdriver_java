package dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropDrownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDrownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropDrownPage.selectFromDropDrown(option);
        var selectedOptions = dropDrownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option));
    }
}
