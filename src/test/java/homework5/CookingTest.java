package homework5;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.vBlog.InitPageObject;
import pageObject.vBlog.SearchResultPageObject;

public class CookingTest extends BaseUITest {

    @Test
    @Epic("Selenium")
    @Feature("Cooking tests")
    @Story("Searching tests")
    public void startTest() {

        getDriver().get("https://www.vkusnyblog.ru/");
        getDriver().manage().window().maximize();

        InitPageObject in = new InitPageObject(getDriver());
        in.clickChoosingRecipes();
        in.clickMenuItem();
        in.waitVisibilityElement(in.getRubrics());
        in.setSearchText("бекон");
        in.wait(1000);
        in.clickIngrApprove();
        in.waitVisibilityElement(in.getIngridients());
        in.clickSubmitSearch();
        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.kobbSaladWasFound());
        as.assertEquals(sr.getRecipesCount(), 14);
    }
}
