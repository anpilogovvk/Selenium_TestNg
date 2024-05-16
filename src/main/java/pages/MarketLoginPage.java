package pages;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;


public class MarketLoginPage {

    private final SelenideElement userNameButton = $x("//div[@class=' css-tlfecz-indicatorContainer']");
    private final SelenideElement passWordButton = $x("//div[@id='password']");

    private final  SelenideElement setUserName = $x("//div[@id='react-select-2-option-0-0']");

    private final  SelenideElement setPassWord = $x("//div[@id='react-select-3-option-0-0']");

    private final SelenideElement logInButton = $x("//button[@class='Button_root__24MxS Button_slim__2caxo']");

    public void loginIntoMarket(){
        userNameButton.shouldBe(Condition.visible).click();
        setUserName.shouldBe(Condition.visible).click();
        setUserName.shouldNotBe(Condition.visible);
        passWordButton.shouldBe(Condition.visible).click();
        setPassWord.shouldBe(Condition.visible).click();
        setPassWord.shouldNotBe(Condition.visible);
        logInButton.shouldBe(Condition.visible).click();
    }

//    public void loginIntoMarket(String Username, String Password) {
//        searchInputUsername.shouldBe(Condition.visible)
//                .sendKeys(Username);
//        getSearchInputPassword.shouldBe(Condition.visible)
//                .sendKeys(Password);
//        searchLogInButton.shouldBe(Condition.visible)
//                .click();
//    }

}
