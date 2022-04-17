package pageObject.vBlog;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.Base;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class InitPageObject extends Base {
    public InitPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id=\"menu-item-35001\"]/a")
    private WebElement choosingRecipes;

    @FindBy(xpath = ".//*[@id=\"vbc_salaty\"]")
    private WebElement menuItem;

    @FindBy(xpath = ".//*[@id=\"tags_quicksearch\"]")
    private WebElement searchText;

    @FindBy(xpath = ".//span[@class=\"chip__text\" and text() = 'бекон']")
    private WebElement ingrApprove;

    @FindBy(xpath = ".//span[@class=\"facetwp-selection-label\" and text()=\"Рубрики:\"]")
    private WebElement rubrics;

    @FindBy(xpath = ".//span[@class=\"facetwp-selection-label\" and text()=\"Ингредиенты:\"]")
    private WebElement ingridients;

    @FindBy(xpath = ".//button[@type=\"button\" and text() = 'Показать!']")
    private WebElement submitSearch;

    public WebElement getChoosingRecipes() {
        return choosingRecipes;
    }

    public WebElement getMenuItem() {
        return menuItem;
    }

    public WebElement getSearchText() {
        return searchText;
    }

    public WebElement getIngrApprove() {
        return ingrApprove;
    }

    public WebElement getRubrics() {
        return rubrics;
    }

    public WebElement getIngridients() {
        return ingridients;
    }

    public WebElement getSubmitSearch() {
        return submitSearch;
    }

    @Step("Начинаем подбор рецептов")
    public void clickChoosingRecipes(){
        click(choosingRecipes);
    }

    @Step("Добавляем раздел меню")
    public void clickMenuItem(){
        click(menuItem);
    }

    @Step("Вводим ингредиент в строку поиска")
    public void setSearchText(String text) {
        setText(searchText, text);
    }

    @Step("Подтверждаем выбранный ингредиент")
    public void clickIngrApprove(){
        click(ingrApprove);
    }


    @Step("Нажимаем на кнопку поиска")
    public void clickSubmitSearch(){
        click(submitSearch);
    }

    public void wait(int millis) {
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.of(millis, ChronoUnit.MILLIS));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
