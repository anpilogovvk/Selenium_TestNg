package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MarketLoginPage;
import pages.MarketMainPage;
import pages.UserCart;
import util.TestProperties;
import webHooks.WebHooks;

public class TestSteps extends WebHooks {

    private final MarketMainPage marketMainPage = new MarketMainPage();

    private  final MarketLoginPage marketLoginPage= new MarketLoginPage();

    @DisplayName("Тест авторизации")
    @Given("auth in market")
    @Test
    public void logInTest(){
        marketMainPage.goToSigInForm();
        marketLoginPage.loginIntoMarket();
        Assertions.assertEquals(TestProperties.getProperty("username.demouser"), marketMainPage.checkUserName());
    }



//    @DisplayName("Добавление в корзину одного товара (рюкзак)")
//    @Test
//    public void addGoodIntoCart(){
//        marketMainPage.addBackPackIntoCart();
//        marketMainPage.goToUserCart();
//        Assertions.assertEquals("Sauce Labs Backpack", userCart.checkGoodName());
//        userCart.removeGood();
//
////        userCart.checkCartAfterRemoveAllGoods();
//    }
}
