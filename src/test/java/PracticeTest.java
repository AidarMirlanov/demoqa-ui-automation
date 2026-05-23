import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PracticeTest {

    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://demoqa.com/automation-practice-form");

        WebElement state = driver.findElement(By.xpath("(//div[@class = ' css-1wy0on6'])[1]"));
        state.click();

        List<WebElement> stateBnt = driver.findElements(By.xpath("//div[@tabindex = '-1']"));
        stateBnt.get(0).click();

        WebElement city = driver.findElement(By.xpath("(//div[@class = ' css-2b097c-container'])[3]"));
        city.click();

        List<WebElement> cityBnt = driver.findElements(By.xpath("//div[@tabindex =-1]"));
        cityBnt.get(0).click();

        driver.close();








    }
}
