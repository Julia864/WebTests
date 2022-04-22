package HomeWork7;

import java.util.Arrays;

import static java.lang.System.*;

public class HW7 {

    public static void taskName(int a) {
        out.println("************************ Задание " + a + " *********************");
    }
    // Задание 18. Написать метод, который принимает на вход массив int, и возвращает среднее значение.
    // Проверить работу метода тестом, если параметр - массив catsAges

    public static int task18(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int averageAge = sum / arr.length;
        System.out.println("Средний возраст котов = " + averageAge);
        return averageAge;

    }

    public static String testInteger(int actual, int expected) {

        String result = "";
        if (actual == expected) {
            result = "Pass";
            System.out.println("\u001B[32m" + result + "\u001B[0m");
        } else {
            result = "Fail";
            System.out.println("\u001B[31m" + result + "\u001B[0m");
        }
        return result;
    }

    // Задание 21 Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
    // максимальное значение и среднее значение всех чисел массива.
    // Проверить работу метода на массиве из задания 20.

    public static int[] task21 (int[] arr) {

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int sum = 0;
        int averageAge;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        averageAge = sum / arr.length;

        int[] result = {min, max, averageAge};

        return result;
    }






    public static void main(String[] args) {
        taskName(1);
        // Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        String[] catsNames = {"Том", "Пупсик", "Пушок", "Пират", "Каспер", "Зло"};
        System.out.println(Arrays.toString(catsNames));

        taskName(2);
        //В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        // а значение элемента с индексом 1 на “Черныш”.
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        System.out.println(Arrays.toString(catsNames));

        taskName(3);
        //Создать массив catsColors и заполнить его значениями.
        String[] catsColors = {"Белый", "Серый", "Рыжий", "Черный", "Полосатый", "Черепаховый"};
        System.out.println(Arrays.toString(catsColors));

        taskName(4);
        //Создать массив catsAges и заполнить его любыми значениями.
        int[] catsAges = {2, 5, 3, 1, 8, 6};
        System.out.println(Arrays.toString(catsAges));

        taskName(5);
        //Создать массив isCatRed и заполнить его соответствующими значениями
        boolean[] isCatRed = new boolean[catsColors.length];

        for (int i = 0; i < catsColors.length; i++) {
            if(catsColors[i].equals("Red")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
        }

        System.out.println(Arrays.toString(isCatRed));

        taskName(6);
        //Распечатать для массивов catsNames и catsColors:
        //имя кота в коробке с номером 6
        //имена котов из коробок с четными индексами
        //имена котов из коробок, чьи индексы кратны 4
        //цвет котов из коробок с нечетными индексами
        //цвет котов из коробок, чьи индексы кратны 3

        System.out.println(catsNames[5]);// в кв скобках будет 6, просто у меня всего 5 позиций
        // или еще один вариант с перебиранием коробок (см ниже)
        for(int i = 0; i < catsNames.length; i++) {
            if (i == 5) {
                System.out.println(catsNames[i]);
            }
        }

        System.out.println("____________________");

        for(int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }

        System.out.println("____________________");
        for(int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }
        System.out.println("____________________");

        for(int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 1) {
                System.out.print(catsNames[i] + " ");
            }
        }
        System.out.println("____________________");
        for(int i = 0; i < catsNames.length; i++) {
            if (i % 3 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }
        System.out.println("____________________");

        taskName(7);
        //Распечатать “Накорми кота!” для всех серых котов
        for(int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println(catsColors[i] + " - Накорми кота!");
            }
        }
        taskName(8);
        //Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for(int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println(catsAges[i] + " - Отнеси кота на прививку!");
            }
        }

        taskName(9);
        //Для кота в последней коробке распечатать имя, цвет, возраст
        System.out.println(catsAges[5]);
        System.out.println(catsNames[5]);
        System.out.println(catsColors[5]);

        taskName(10);
        //Распечатать имена всех котов, чей возраст больше 2 лет
        for(int i = 0; i < catsNames.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }

        taskName(11);
        //Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        for(int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                System.out.println("Накорми кота!");
            } else {
                System.out.println("Ошибка");
            }
        }


        taskName(12);
        //Распечатать средний возраст котов из массива catsAges
        System.out.println((catsAges[0] + catsAges[1] + catsAges[2] + catsAges[3] + catsAges[4] + catsAges[5]) / 6.0);
        // еще вариант

        int sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum += catsAges[i];
        }
        double averageAge = sum / catsAges.length;
        System.out.println("Средний возраст котов = " + averageAge);

        taskName(13);
        //Распечатать возраст самого молодого кота
        int min = catsAges[0];

        for(int i = 0; i < catsAges.length; i++) {

            if (catsAges[i] < min) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        taskName(14);
        //Распечатать возраст самого старого кота
        int max = catsAges[0];

        for(int i = 0; i < catsAges.length; i++) {

            if (catsAges[i] > max) {
                max = catsAges[i];
            }
        }
        System.out.println(max);


        taskName(15);
        //Распечатать количество серых котов
        int j = 0;
        for(int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                j++;
            }
        }
        System.out.println(j);

        taskName(16);
        //Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        for(int i = 0; i < catsNames.length; i++) {
            if (catsAges[i] <= 3 && i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        taskName(17);
        //Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)
        int count = 0;
        for(int i = 0; i <= 10; i+=2) {
            count++;
            }

        int[] massiv = new int[count];
        int num = 0;
        for(int i = 0; i < massiv.length; i++) {
            massiv[i] = num;
            num += 2;
            }
        System.out.println(Arrays.toString(massiv));

        taskName(18);
        //Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        // Проверить работу метода тестом, если параметр - массив catsAges
        task18(catsAges);
        testInteger (task18(catsAges), 4);

        taskName(19);
        //Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        int count1 = 0;
        for(int i = -1000; i < -900; i++) {
            if(i % 2 != 0)
                count1++;
        }

        int[] massiv1 = new int[count1];
        int num1 = 0;
        for (int i = -1000; i < -900; i++) {
            int j1 = 0;
            if(i % 2 != 0) {
                if (j1 < massiv1.length) {
                    massiv1[j1] = i;
                    System.out.print(massiv1[j1] + " ");
                    j1++;
                }
            }
        }
        System.out.println(" ");
        // Еще вариант через метод
        // public static int[] task18 (int begin, int end) {
        // int len = 0;
        // for (int i = begin; i <= end; i++) {
        // if (i % 2 != 0) {
        // len++;
        // }
        // }
        // int[] arr1 = new int[len];
        // int count = 0;
        // for (int i = begin; i < end; i++) {
        // if (i % 2 != 0) {
        // arr1[count] = i;
        // count++;
        // }
        // }
        // return arr1;
        // }
        // }

        taskName(20);
        //Создать массив из 10 случайных положительных целых чисел
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = ((int) (Math.random() * 10));
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");

        taskName(21);
        //Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
        // максимальное значение и среднее значение всех чисел массива.
        // Проверить работу метода на массиве из задания 20.


        taskName(22);
        //Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
        int lengthEven = 0;
        int lengthOdd = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                lengthEven++;
            } else {
                lengthOdd++;
            }
        }
        int[] even = new int [lengthEven];
        int[] odd = new int [lengthOdd];
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                even[countEven] = arr2[i];
                countEven++;
            } else {
                odd[countOdd] = arr2[i];
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        taskName(23);
        //Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
        //Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
        String[][] array23 = new String[3][8];
        array23[0] = catsNames;

        String[] catsAges1 = new String[8];
        for (int i = 0; i < catsAges.length; i++) {
            catsAges1[i] = Integer.toString(catsAges[i]);
        }

        array23[1] = catsAges1;
        array23[2] = catsColors;


        for (int i = 0; i < array23.length; i++) {
            for (int p = 0; p < array23.length; p++) {
                if (p % 2 == 0) {
                    System.out.print(array23[i][p] + " ");
                }
            }
            System.out.println(" ");
        }
        taskName(24);
        //Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        int[][] array24 = new int[4][8];
        for (int i = 0; i < array24.length; i++) {
            for (int m = 0; m < array24[i].length; m++) {
                array24[i][m] = (int) (Math.random() * (10) + 1);
                System.out.print(array24[i][m] + " ");
            }
            System.out.println(" ");
        }

        taskName(25);
        //Вывести сумму всех четных чисел массива из задания 24.
        int sumForArray = 0;
        for (int i = 0; i < array24.length; i++) {
            for (int c = 0; c < array24[i].length; c++) {
                sumForArray += array24[i][c];
            }
        }
        System.out.println("Сумма всех элементов массива из задания 24 = " + sumForArray);
    }
}
