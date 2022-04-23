package homework9;

import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseDBTest {

    @BeforeTest
    public void beforeT(){
        System.out.println("Действие перед началом теста (звуки молитвы)");
    }

    @AfterTest
    public void afterT(){
        System.out.println("Действие после теста (восторженный визг)");
    }

    @BeforeMethod
    public void beforeM(){
        System.out.println("Действие перед вызовом метода (звук скрещенных пальцев)");
    }

    @AfterMethod
    public void afterM(){
        System.out.println("Действие после вызова метода (выдох)");
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
