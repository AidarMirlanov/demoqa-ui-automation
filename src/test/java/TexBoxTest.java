import com.digital_nomads.drivers.DriverManager;
import com.digital_nomads.pages.BasePage;
import com.digital_nomads.pages.PracticeFormPage;
import com.digital_nomads.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TexBoxTest extends BaseTest {
TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    public void testTextBox() {
        driver.get("https://demoqa.com/text-box");
        textBoxPage.inputUserName("Aidar")
                .inputUserEmail("Aidar28@mail.com")
                .inputCurrentAddress("Bishkek")
                .inputPermanentAddress("Bishkek 312")
                .submit();

    }


}
