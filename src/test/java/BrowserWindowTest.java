import com.digital_nomads.helper.BrowserManager;
import com.digital_nomads.pages.BrowserWindowsPage;
import org.testng.annotations.Test;

public class BrowserWindowTest extends  BaseTest {
BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();

    @Test
    void windowTest() throws InterruptedException {
        helper.getBrowserManager().openURL("https://demoqa.com/browser-windows");
        for (int i = 0; i < 3; i++) {
            webElementActions.click(browserWindowsPage.newTab);
        }
        helper.getWindowHelper().switchToDefaultWindow();

    }
}
