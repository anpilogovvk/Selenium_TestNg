package pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class MarketMainPage {
    private final SelenideElement signInButton = $x("//a[@id='signin']");

    private final SelenideElement username = $x("//div[@class='flex flex-1 justify-end align-center space-x-8']/span[@class='username']");

    //div[@class='flex flex-1 justify-end align-center space-x-8']/span[@class='username']

    public void goToSigInForm (){
        signInButton.shouldBe(Condition.visible).click();
    }

    public String checkUserName(){
        return username.getText();
    }
//
//
//    public  void  addBackPackIntoCart(){
//        findAddToCartBackPackButton.shouldBe(Condition.visible).click();
//    }
//
//    public void goToUserCart(){
//        userCart.shouldBe(Condition.visible).click();
//    }

}
