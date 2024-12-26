package main.java.lesson2.while_do;

import java.util.Scanner;

public class Example {

    /*
        Пример у вас соц сеть в которую можно загружать фотографии
        у пользователя с консоли спрашивают сколько фотографий
        он хотел бы загрузить в свой альбом
        но есть ограничение по размеру альбома в 100 фотографий
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPhoto = 0;
        while (countOfPhoto <= 100) {

            if (countOfPhoto == 100) {
                break;
            }

            System.out.println("Сколько фото вы бы хотели загрузить?");

            int tempCount = scanner.nextInt();

            if ((countOfPhoto + tempCount) > 100) {
                System.out.println("Вы превысили лимит");
                System.out.println("Осталось места на " + (100 - countOfPhoto));
                continue;
            }

            countOfPhoto = countOfPhoto + tempCount;
            System.out.println("Осталось места на " + (100 - countOfPhoto));
        }
        System.out.println("Галерея заполнена!!!");
    }


}
