package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MarketMainPage;
import util.TestProperties;
import webHooks.WebHooks;

public class TestSteps extends WebHooks {
    private final MarketMainPage marketMainPage = new MarketMainPage();

    @Given("auth in market")
    @Test
    public void logInTest(){
        String check = TestProperties.getProperty("checkString");
        Assertions.assertEquals(check, marketMainPage.checkString());
        //это потом уберётся
        Selenide.sleep(1000);
    }
}
