package homework4;

import homework2.FlyindPig;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeworkTest extends BaseTest{

    @Test
    //Прикидываем, ел ли свинолёт
    public void pigIsFull (){
        Date dtForAssert = new Date();
        String assertResult;
        SimpleDateFormat formatToHours = new SimpleDateFormat("HH");
        System.out.println("Текущее время: " + dtForAssert);
        if (Integer.parseInt(formatToHours.format(dtForAssert)) > 12)
        {
            assertResult = "Flying pigs are full";
        }
        else{
            assertResult = "Flying pigs maybe are not full";
        }
        System.out.println(assertResult);
    }

    @Test
    //Ку-ку?)
    public void element(){
        FlyindPig Yunga = new FlyindPig("Yunga");

        Assertion a = new Assertion();
        a.assertTrue( "Ку-ку".equals(Yunga.voice(2)), "Юнга говорит только \"Ку-ку\"");
    }



}
