package pageObject.vBlog;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

import java.util.List;

public class SearchResultPageObject extends Base {
    public SearchResultPageObject(WebDriver driver) {
        super(driver);
    }

//    @FindBy(xpath = ".//div[@class='main']//a[contains(.,'Картинки')]")
//    private WebElement imagesTab;

    @FindBy(xpath = ".//*[@id=\"post-19211\"]")
    private WebElement kobbSalad;

    @FindBy(xpath = ".//div[@class=\"card card-reach recipe-card\"]")
    private List<WebElement> recipes;


//
//    @Step("Проверяем, что кнопка Картинки присутсвует на странице")
//    public boolean imagesTabButtonIsExist(){
//        return waitVisibilityElement(imagesTab);
//    }

    @Step("Проверяем, что Кобб-салат нашёлся")
    public boolean kobbSaladWasFound(){
        return waitVisibilityElement(kobbSalad);
    }

    @Step("Проверяем, что нашлось 14 рецептов")
    public int getRecipesCount(){
        waitVisibilityElement(kobbSalad);
        return recipes.size();
    }
}
