import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
    void testFrames() {
        helper.getBrowserManager().openURL("https://demoqa.com/frames");
        helper.getFrameHelper().switchToIFrame(demoqaPages.getFramesPage().frame1);
        System.out.println(webElementActions.getTextFromElement(demoqaPages.getFramesPage().sampleHeading));

        helper.getFrameHelper().switchToDefaultIFrame();
        System.out.println(webElementActions.getTextFromElement(demoqaPages.getFramesPage().textCenter));

        helper.getFrameHelper().switchToFrameByIndex(2);
        System.out.println(webElementActions.getTextFromElement(demoqaPages.getFramesPage().sampleHeading));
    }
 }

