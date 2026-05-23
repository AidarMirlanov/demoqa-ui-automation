import com.digital_nomads.pages.BasePage;
import com.digital_nomads.pages.ButtonsPage;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {

    ButtonsPage buttonsPage = new ButtonsPage();
    @Test
    public void testButton () throws InterruptedException {

        driver.get("https://demoqa.com/buttons");
        webElementActions.doubleClick(buttonsPage.doubleClickButton);
        webElementActions.rightClick(buttonsPage.rightClickButton);
    }
}
