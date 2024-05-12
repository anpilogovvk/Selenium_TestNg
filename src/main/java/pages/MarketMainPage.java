package pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class MarketMainPage {
    private final SelenideElement products = $x("//div[@class='header_secondary_container']/span[contains(text(),'Products')]");

    public String checkString(){
        return products.getText();
    }
}
