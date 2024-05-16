package webHooks;
import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.eo.Se;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MarketLoginPage;
import org.openqa.selenium.WebDriver.*;

import util.TestProperties;


public class WebHooks {
    @BeforeEach
    public void initBrowser() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true));
        openPage(TestProperties.getProperty("url"));
    }

    private void openPage(String url){
        Configuration.headless=true;
        Configuration.browser = Browsers.CHROME;
        Selenide.open(url);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

}
