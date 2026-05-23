package com.digital_nomads.pages;

import com.digital_nomads.drivers.DriverManager;
import com.digital_nomads.entities.PracticeForm;
import com.digital_nomads.helper.WebElementActions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;



public class PracticeFormPage extends BasePage {


    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "dateOfBirthInput")
    public WebElement dataFiled1;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement monthField1;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement yearFiled1;

    @FindBy(css = "div.react-datepicker__day")
    public WebElement dayFiled1;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(css = "label[for='gender-radio-1']")
    public WebElement Male;

    @FindBy(id = "gender-radio-2")
    public WebElement Female;

    @FindBy(id = "gender-radio-3")
    public WebElement Other;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dataFiled;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement monthField;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement yearFiled;

    @FindBy(css = "div.react-datepicker__day")
    public WebElement dayFiled;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(css = "label[for='hobbies-checkbox-1']")
    public WebElement Sports;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "hobbies-checkbox-2")
    public WebElement Reading;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement Music;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "react-select-3-input")
    public WebElement ncr;

    @FindBy(id = "react-select-4-input")
    public WebElement city;

    @FindBy(xpath = "//div[contains(@class, 'react-datepicker__day') and text()='9']")
    public WebElement days;

    @Step("InputFirstName ")
    public PracticeFormPage inputFirstName(String firstName) {
        webElementActions.input(this.firstName, firstName);
        return this;
    }

    public PracticeFormPage inputLastName(String lastName) {
        webElementActions.input(this.lastName, lastName);
        return this;
    }

    public PracticeFormPage inputEmail(String userEmail) {
        webElementActions.input(this.userEmail, userEmail);
        return this;
    }

    public PracticeFormPage genderMale() {
        webElementActions.scrollToElement(this.Male);
        this.Male.click();
        return this;
    }

    public PracticeFormPage genderFemale() {
        webElementActions.scrollToElement(this.Female).click(this.Female);
        return this;
    }

    public PracticeFormPage genderOther() {
        webElementActions.scrollToElement(this.Other).click(this.Other);
        return this;
    }

    public PracticeFormPage inputNumber(String userNumber) {
        webElementActions.input(this.userNumber, userNumber);
        return this;
    }

    public PracticeFormPage inputDateOfBirth(String dateOfBirthInput) {
        this.dateOfBirthInput.sendKeys(Keys.CONTROL + "a");
        webElementActions.scrollAndClearElements(this.dateOfBirthInput);
        webElementActions.input(this.dateOfBirthInput, dateOfBirthInput);
        this.dateOfBirthInput.sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeFormPage selectBirthDate(String year, String month, String day) {
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        webElementActions.navigateToElement(this.dataFiled).click(dataFiled);

        Select select = new Select(this.yearFiled);
        select.selectByVisibleText(year);

        select = new Select(this.monthField);
        select.selectByVisibleText(month);

        List<WebElement> daysElement = Collections.singletonList(practiceFormPage.dayFiled);
        for (WebElement dayElement : daysElement) {
            String text = dayElement.getText();
            if (text.equals(day)) {
                dayElement.click();
                break;
            }
        }
        return this;
    }

    public PracticeFormPage selectBirthDate2(int year, int month, int day) {

//        DriverManager.getDriver().findElement(By.xpath("//option[@value='" + year + "']")).click();
//        DriverManager.getDriver().findElement(By.xpath("//option[@value='" + month + "']")).click();
//        DriverManager.getDriver().findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='" + day + "']")).click();
//        return this;
        // Выбираем год из выпадающего списка
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        Select yearSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//select[@class = 'react-datepicker__year-select']")));  // замените id на правильный
        yearSelect.selectByValue(String.valueOf(year));

        // Выбираем месяц из выпадающего списка
        Select monthSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//select[@class = 'react-datepicker__month-select']")));  // замените id на правильный
        monthSelect.selectByValue(String.valueOf(month));

        // Ждём, пока появится нужный день и кликаем по нему
        String dayXpath = "//div[contains(@class, 'react-datepicker__day') and text()='" + day + "']";
        WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dayXpath)));
        dayElement.click();

        return this;
    }

    public PracticeFormPage inputSubject(String subjectsInput) {
        webElementActions.input(this.subjectsInput, subjectsInput);
        this.subjectsInput.sendKeys(Keys.ARROW_DOWN); // Перейдите к первому результату
        this.subjectsInput.sendKeys(Keys.ENTER); // Выберите первый результат
        return this;
    }

    public PracticeFormPage hobbiesCheckbox1() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].click();", this.Sports);
        return this;
    }

    public PracticeFormPage uploadFile(WebElement element) throws InterruptedException {
        this.uploadPicture.click();
        String filePath = "/Users/aidar312/Documents/DemoAidar/src/main/resources/Без заголовка.jpg";
        element.sendKeys(filePath);
        Thread.sleep(10000);
        this.uploadPicture.sendKeys(Keys.ENTER);
        //Снимок экрана 2024-10-03 в 09.29.25.png
        return this;
    }


    public PracticeFormPage currentAddress(String currentAddress) {
        webElementActions.input(this.currentAddress, currentAddress);
        this.currentAddress.sendKeys(Keys.TAB);
        return this;
    }

    public PracticeFormPage clickState(String stateName) {
        webElementActions.input(this.ncr, stateName);
        this.ncr.sendKeys(Keys.ENTER);
        this.ncr.sendKeys(Keys.TAB);
        return this;
    }

    public PracticeFormPage clickCity(String cityName) {
        webElementActions.input(this.city, cityName);
        this.city.sendKeys(Keys.TAB);
        this.city.sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeFormPage fillTextFormPractice(PracticeForm practiceForm) {
        inputFirstName(practiceForm.getFirstName())
                .inputLastName(practiceForm.getLastName())
                .inputEmail(practiceForm.getEmail())
                .inputNumber(String.valueOf(practiceForm.getMobileNumber()))
                .currentAddress(practiceForm.getCurrentAddress());
        return this;
    }

}
