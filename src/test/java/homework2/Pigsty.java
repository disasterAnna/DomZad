package homework2;

import java.util.*;
import java.util.stream.Collectors;

public class Pigsty {
    public static void main(String[] args) {
        FlyindPig loki = new FlyindPig("Loki");
        FlyindPig ori = new FlyindPig("Ori");

        loki.fly();
        ori.exterminate("Box");


        //Наполнение коллекции команд ArrayList, тип String
        ArrayList<String> command = new ArrayList<>();
                command.add("Сюда");
                command.add("Нельзя");
                command.add("А ну сожрал!");


        //Фильтрация
        command.stream().filter(s -> s.contains("а")).forEach(s -> System.out.println(ori.getName() + "! " + s));

        //Вывод всех значений
        for (String s : command){
            System.out.println("ForEach = "+s);
        }

        //Наполнение коллекции ArrayList, тип Integer
        ArrayList<Integer> moltMonth = new ArrayList<>();
        moltMonth.add(1);
        moltMonth.add(2);
        moltMonth.add(11);
        moltMonth.add(9);
        moltMonth.add(3);

        //Фильтрация
        moltMonth.stream().filter(s -> s>11 || s<= 3).forEach(s -> System.out.println("Необходимы дополнительные витамины."));

        //Вывод всех значений
        moltMonth.forEach(s-> System.out.println(s +"-й месяц в году, ждите нашествие пуха и перьев"));


        //Наполнение коллекции ключей-значений HashMap
        HashMap<String, Integer> weight = new HashMap<>();
        weight.put(loki.getName(), 88);
        weight.put(ori.getName(), 90);

        //Фильтрация
        for (Integer j : weight.values()){
            if(j > 95){
                System.out.println("Масса свинолёта достигла " + j + " граммов. Исключить семечки из рациона.");
            }
        }

        //Вывод значений
        for (Map.Entry<String, Integer> m: weight.entrySet()){
            System.out.println("Key:" + m.getKey());
            System.out.println("Value: " + m.getValue() + " граммов");
        }


        //Сохранение в новую коллекцию Set, тип Double
        Set<Double> dosage = weight.values().stream()
                .map(i -> Double.valueOf(i) * 0.015)
                .collect(Collectors.toSet());
        //Set<Double> dosage = weight.values().stream().map(Double::valueOf).collect(Collectors.toSet()); о пресвятой гугл, разобраться
        dosage.forEach(s-> System.out.println("Рассчитанная дозировка Орунгала: " + s));

        //Наполнение коллекции Set, тип String
        Set<String> lovelyFood = new HashSet<>();
        //var lovelyFood = new HashSet<>();
        lovelyFood.add("Сосновые семечки");
        lovelyFood.add("Сенегальское просо");
        lovelyFood.add("Кешью");
        lovelyFood.add("Укроп");

        //Фильтрация Set
        lovelyFood.stream().filter(s -> s.equals("Сосновые семечки")).forEach(s -> System.out.println("О, так мы собираемся угостить " + loki.getName()));

        //Вывод значений
        lovelyFood.forEach(s -> System.out.println("Любимое лакомство: " + s));

    }
}
