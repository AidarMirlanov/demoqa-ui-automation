import com.digital_nomads.drivers.DriverManager;
import com.digital_nomads.helper.WebElementActions;
import com.digital_nomads.modul_import.DemoqaPages;
import com.digital_nomads.modul_import.ImportHelpers;
import com.digital_nomads.pages.SelectMenuPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebElementActions webElementActions;
    public ImportHelpers helper;
    public DemoqaPages demoqaPages;
    public SelectMenuPage selectMenuPage;


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = DriverManager.getDriver();
        webElementActions = new WebElementActions();
        helper = new ImportHelpers(driver);
        demoqaPages = new DemoqaPages();
        webElementActions = new WebElementActions();
        selectMenuPage = new SelectMenuPage();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        DriverManager.closeDriver(); // Используем DriverManager для закрытия драйвера
    }
}

