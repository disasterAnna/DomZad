package homework1;

/**
 * 1 Прочитать про примитивные и ссылочные типы. Написать примеры сравнения всех примитивных типов в java
 * 2. написать все циклы и ветвления на основе примитивных типов
 * Так как из задания не понятно, что именно нужно сделать (сравнивать между собой полюшки с одним и тем же типом, или же сравивать полюшки с разными типами), будут оба варика, но не везде
 */

public class Program {
    public static void main(String[] args) {

        AdditionalMethods am = new AdditionalMethods();

        /*
         * Кипячение, типы данных byte и boolean и ветвление через if
         */
        boolean boilingCheck = am.temp >= am.boil;
        if (boilingCheck == true) {
            System.out.println("Ваш кипяток готов!");
        }
        else {
            System.out.println("Ещё не готово.");
        }

        /*
         * Экзамены, тип данных short, "обычный" switch и цикл через for
         */
        short grade1 = 1;
        short grade2 = 5;
        short x;
        for (x=grade1; x<=grade2; x++){
            System.out.println(am.exam(x));
        }

        /*
         * Валюты, тип данных int и ещё один if
         */
        System.out.println(am.whatAboutARuble1(25,190));

        /*
         * Возраст, типы данных short и char и "необычный" switch
         */
        System.out.println(am.balzakAge((short)28));

        /*
         * long и while
         */
        long zp0 = 60000;
        long zp1 = 25000;
        while (zp0>zp1){
            zp1 = zp1 +5000;
            System.out.println("Ваша зарплата не дотягивает до среднего красса");
            if (zp1>=zp0){
                System.out.println("Ваша зарплата дотягивает до среднего красса, поздравляем");
                break;
            }
        }

        /*
         * Настройка кресла, плавучие точки (float и double) и do while)
         */
        double tableHeight = 70.35;
        float comfortableChairInterval = 10.6352F;
        double chairSet =40;
        do {
            chairSet = chairSet + 0.7; // tableHeight += 0.5;
            System.out.println("Oh shit, here we go again!");
        } while (tableHeight - chairSet >= comfortableChairInterval);

















    }
}
