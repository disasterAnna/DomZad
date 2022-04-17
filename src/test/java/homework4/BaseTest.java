package homework4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

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

}
