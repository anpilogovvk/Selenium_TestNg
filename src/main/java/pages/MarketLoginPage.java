package pages;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class MarketLoginPage {
    private final SelenideElement searchInputUsername = $x("//div[@class='form_group']/input[@id='user-name']");
    private final SelenideElement getSearchInputPassword = $x("//div[@class='form_group']/input[@id='password']");

    private  final  SelenideElement searchLogInButton = $x("//div[@class='login-box']/form/input[@id='login-button']");


    public void loginIntoMarket(String Username, String Password) {
        searchInputUsername.shouldBe(Condition.visible)
                .sendKeys(Username);
        getSearchInputPassword.shouldBe(Condition.visible)
                .sendKeys(Password);
        searchLogInButton.shouldBe(Condition.visible)
                .click();
    }

}
