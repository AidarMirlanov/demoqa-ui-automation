
import com.digital_nomads.data.MockDataGeneratorForPractice;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    public void practiceFormTest() throws InterruptedException {

        helper.getBrowserManager().openURL("https://demoqa.com/automation-practice-form");

        demoqaPages.getPracticeFormPage().fillTextFormPractice(MockDataGeneratorForPractice.randomTextFormPage2());
        Thread.sleep(5000);
        helper.webElementActions.scrollToElement(demoqaPages.getPracticeFormPage().dateOfBirth);
        Thread.sleep(5000);
        demoqaPages.practiceFormPage.genderMale()
                //.inputDateOfBirth("06 Sep 1983")
                .inputSubject("Maths")
                //.selectBirthDate("1998", "July", "28")
                .selectBirthDate2(1998, 7, 28)
                .hobbiesCheckbox1()
                .clickState("NCR")
                .clickCity("Delhi");
        Thread.sleep(5000);


    }
}
