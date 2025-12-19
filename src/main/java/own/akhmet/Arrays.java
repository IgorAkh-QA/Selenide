package own.akhmet;

import java.sql.SQLOutput;

public class Arrays {

    public static void main(String... args) {

        //Запись массива
        int[] arrayA = new int[3]; //Массив с количеством объектов-3. Массивы являются неизменяеммыми объектами.
        int[] arrayB = new int[]{100, 150, -1, 90}; //Сразу определилил скоуп значений в массиве
        int[] arrayC = {100, 1150, -1, 910}; //Сразу определилил скоуп значений в массиве
        String[] arrayStr = {"Dima", "Vasya"};

        //Двумерный массив - массив массивов
        int[][] arrayBC = {arrayB, arrayC};
        //System.out.println(Arrays.toString(arrayBC));

        //Работа с массивом методы работы с массивом Arrays

        //Цикл
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] != -1) {
                continue; //Прерывает операцию
            }
            //Сложное вычисление
            System.out.println("Радуемся, нашли: " + arrayB[i]);
            break;
        }

            //Перечисление в обратном порядке

            //Завершение цикла при совпадении условияfor (int i = arrayB.length - 1; i >= 0; i--) {

            //Еще цикл
        /*
            int index = 0;
        while (index < arrayB.length) {
          //  System.out.println(arrayB[index]);
            index++;


        } */

        /*
        boolean done = false;
        while (!false){
            что- то ищем
                if (нашли) {
                    done = true;
                    }
         */

            for (String str :arrayStr) {
                //System.out.println(str);
            }

            arrayB[2] = 123; //Смена значения в массиве под индексом 2;
            //System.out.println(Arrays.toString(arrayB));

    }
    public static void someMethod() { //Если метод содержит только цикл, то для выхода из цикла вместо break, можно сделать return
        int[] arrayB = {11, 12};

        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] != -1) {
                return;
            }
        }

    }
}