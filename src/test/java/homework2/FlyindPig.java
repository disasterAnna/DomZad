package homework2;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class FlyindPig extends Animal {
    public FlyindPig(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Внимание! Воздух!");
    }

    public void exterminate(String labObject) {
        System.out.println("Object \"" + labObject + "\" was successfully destroyed");

    }

//Кусочек для домашки №4
    @Test
    public String voice (int vNum){
        ArrayList<String> voice = new ArrayList<>();
        voice.add("Ку-ку");
        voice.add("Курочка");
        voice.add("Крошка");
        return voice.get(vNum);

    }


}
