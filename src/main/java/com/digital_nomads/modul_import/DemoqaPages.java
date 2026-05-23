package com.digital_nomads.modul_import;


import com.digital_nomads.pages.*;

public class DemoqaPages {

    public TextBoxPage textBoxPage;
    public ButtonsPage buttonsPage;
    public BrowserWindowsPage browserWindowsPage;
    public AlertButtonPage alertPage;
    public SelectMenuPage selectMenuPage;
    public FramesPage framesPage;
    public MenuPages menuPages;
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;
    public PracticeFormPage practiceFormPage;
    public WebTablesPage webTablesPage;



    public DemoqaPages() {
        textBoxPage = new TextBoxPage();
        buttonsPage = new ButtonsPage();
        browserWindowsPage = new BrowserWindowsPage();
        alertPage = new AlertButtonPage();
        selectMenuPage = new SelectMenuPage();
        framesPage = new FramesPage();
        menuPages = new MenuPages();
        accordianPage = new AccordianPage();
        autoCompletePage = new AutoCompletePage();
        practiceFormPage = new PracticeFormPage();
        webTablesPage = new WebTablesPage();


    }

    public AccordianPage getAccordianPage() {
        return accordianPage;
    }

    public AlertButtonPage getAlertPage() {
        return alertPage;
    }

    public AutoCompletePage getAutoCompletePage() {
        return autoCompletePage;
    }

    public BrowserWindowsPage getBrowserWindowsPage() {
        return browserWindowsPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public FramesPage getFramesPage() {
        return framesPage;
    }

    public MenuPages getMenuPages() {
        return menuPages;
    }

    public PracticeFormPage getPracticeFormPage() {
        return practiceFormPage;
    }

    public SelectMenuPage getSelectMenuPage() {
        return selectMenuPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }
}

