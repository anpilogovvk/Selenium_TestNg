package webHooks;
import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import pages.MarketLoginPage;
import pages.MarketMainPage;
import util.TestProperties;

public class WebHooks {
    @BeforeEach
    public void initBrowser(){
//        SelenideLogger.addListener("AllureSelenide",
//                new AllureSelenide()
//                        .screenshots(true)
//                        .savePageSource(true));
        openPage(TestProperties.getProperty("url"));
        MarketLoginPage marketLoginPage = new MarketLoginPage();
        marketLoginPage.loginIntoMarket(TestProperties.getProperty("login"), TestProperties.getProperty("password"));
    }

    private void openPage(String url){
        Configuration.browser = Browsers.CHROME;
        Selenide.open(url);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

}
