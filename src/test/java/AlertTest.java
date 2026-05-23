import org.testng.annotations.Test;

public class AlertTest  extends BaseTest{

    @Test
    public void alertTest() {
        helper.getBrowserManager().openURL("https://demoqa.com/alerts");
        webElementActions.click(demoqaPages.getAlertPage().alertButton);
        helper.getAlertHelper().acceptAlert();
    }

    @Test
    public void confirmTest () throws InterruptedException {
        helper.getBrowserManager().openURL("https://demoqa.com/alerts");
        webElementActions.click(demoqaPages.getAlertPage().confirmButton);
        helper.getAlertHelper().dismissAlert();

    }

    @Test
    public void promtAlertTest () throws InterruptedException {
        helper.getBrowserManager().openURL("https://demoqa.com/alerts");
        webElementActions.click(demoqaPages.getAlertPage().promtButton);
        helper.getAlertHelper().sendKeysAlert("Aidar");
        helper.getAlertHelper().acceptAlert();
        Thread.sleep(6000);
    }
}
