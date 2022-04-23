package homework9;

import db.DBHelper;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Map;

public class DBTest extends BaseDBTest {

    @Test
    @Epic("DBTest")
    @Feature("DB tests")
    @Story("DB tests")
    public void test() {

        String selectForMaxId = "SELECT MAX(id) as MAX_ID FROM REGISTRATION";
        log("selectForMaxId:" + selectForMaxId);
        int maxId = (Integer) DBHelper.getRowColumn(selectForMaxId, 0, "MAX_ID");
        log("maxId: " + maxId);

        String insert = "INSERT INTO REGISTRATION(id, last, first, age) VALUES(" + (maxId + 1) + ", 'ВЕЙДЕР', 'ДАРТ', 40)";

        log("insert:" + insert);
        int insertResult = DBHelper.executeUpdate(insert);
        log("result: " + insertResult);

        String select = "SELECT * FROM REGISTRATION WHERE last = 'ВЕЙДЕР' AND first = 'ДАРТ'";

        log("select:" + select);
        Map<String, Object> result = DBHelper.getRow(select, 0);
        log("result: " + result);

        String delete = "DELETE FROM REGISTRATION WHERE last = 'ВЕЙДЕР' AND first = 'ДАРТ'";

        log("delete:" + delete);
        int deleteResult = DBHelper.executeUpdate(delete);
        log("result: " + deleteResult);

        Assertion as = new Assertion();
        as.assertNotNull(result);
        as.assertTrue((Integer) result.get("age") == 40);
    }
}
