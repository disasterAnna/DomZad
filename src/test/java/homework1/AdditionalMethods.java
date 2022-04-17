package homework1;

/**
 * 1 Прочитать про примитивные и ссылочные типы. Написать примеры сравнения всех примитивных типов в java
 * 2. написать все циклы и ветвления на основе примитивных типов
 * Так как из задания не понятно, что именно нужно сделать (сравнивать между собой полюшки с одним и тем же типом, или же сравивать полюшки с разными типами), будут оба варика, но не везде
 */

public class AdditionalMethods {
    //Определим несколько полей этого класса
    //С примитивным типом byte
    final static byte boil = 100;
    static byte temp = 11;
    //С примитивным типом short
    short grade;
    short balzak = 28;
    //С примитивным типом int
    int usd;
    int eur;
    //С примитивным типом long
    long lou = 28;
    //С примитивным типом char
    //С примитивным типом float
    //С примитивным типом double
    //С примитивным типом boolean не будем, сравнение будет и так


    //Опишем метод для switch
    public String exam(short grade) {
        String sit;
        switch (grade) {
            case 5:
                sit = "Садись, пять!";
                break;
            case 4:
                sit = "Садись, четыре!";
                break;
            case 3:
                sit = "Садись, три";
                break;
            default:
                sit = "На пересдачу";
        }
        return sit;
    }

    //Опишем метод для ещё одного if
    public String whatAboutARuble1(int usd, int eur){
        String rubResult;
        if (usd<=50 && eur <=55){
            rubResult = "Ух, встаём с колен, товарищи!";
        }
        else if (usd >=75 && usd <150 || eur >=80 && eur <150){
            rubResult = "Плохо, очень плохо рублю";
        }
        else if (usd >=150 || eur >=150) {
            rubResult = "Вам стоит начать паковать чемоданы";
        }
        else {
            rubResult = "Ситуация стабильна";
        }
        return rubResult;
    }

    //Опишем модный-молодёжный switch

    public String balzakAge(short age){
        char ageCheck;
        String notice;

        //Закомментировано для перехода на 11-ю джаву
//        ageCheck= switch (age){
//            case 28 -> 'Y';
//            default -> 'N';
//        };

        switch (age) {
            case 28: ageCheck='Y';
            break;
            default: ageCheck='N';

        }



        if (ageCheck == 'Y'){
            notice = "Вот он, Бальзаковский возраст";
        }
        else {
            notice = "Не Бальзаковский возраст, нет";
        };
        return notice;
    }




}
