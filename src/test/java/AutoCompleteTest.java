import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AutoCompleteTest extends BaseTest {

    @Test
    public void colorNamesTest() throws InterruptedException {

        helper.browserManager.openURL("https://demoqa.com/auto-complete");
        helper.webElementActions.click(demoqaPages.autoCompletePage.colorClick);
        demoqaPages.autoCompletePage.colorClick.sendKeys("White" +  Keys.ENTER);
        Thread.sleep(2000);
        demoqaPages.autoCompletePage.singleColor.click();
        demoqaPages.autoCompletePage.singleColor.sendKeys("Green"  + Keys.ENTER);

    }
}
