package pageObject;

import io.qameta.allure.Step;

public class Common {

    @Step("{msg}")
    public void logToRepopt (final String msg){
        System.out.println(msg);
    }

}
