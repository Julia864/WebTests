package HomeWork6;

public class HW6 {

    public static void taskNumber(int a) {
        System.out.println("***************************** Задание №" + a + " *************************************");
    }

    // Задание 10 Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
    // десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end
    public static void task10(double start, double end, double step) {
        if (step > 0) {
            if (start < end && step > 0) {
                for (start = start; start < end; start += step) {
                    System.out.print(start + " ");
                }
            } else if (start > end && step < 0) {
                for (start = start; start > end; start += step) {
                    System.out.println(start + " ");
                }
            } else {
                    System.out.print("Десятичных чисел не найдено");
                }
            }
        System.out.println(" ");
        }

    // Задание 11 Написать метод, который принимает параметр L и печатает  последовательность четных чисел от нуля.
    // Длина последовательности = L.
    public static void task11(int l) {
        int end = 0;
        for (int i = 0; end < l; i += 2) {
            System.out.print(i + " ");
            end++;
        }
        System.out.println(" ");
    }

    // Задание 12 Напишите метод, который принимает целое число n, и
    // выводит все степени числа 2 от 1 до n включительно
    public static void task12(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(Math.pow(2, i) + " ");
        }
        System.out.println(" ");
    }

    // Задание 16 Написать метод, который принимает параметры n, m, l, и печатает последовательность нечетных чисел
    // начиная с числа n, с шагом m,  длина последовательности  L.
    public static void task16(int n, int m, int l) {
        for (int i = n; i < l; i = i + m) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }

    // Задание 18 Написать метод, который принимает параметры l, n, и печатает последовательность чисел, начиная с
    // числа n, по формуле для n + 1 члена последовательности:
    //n + 1 = 2n
    // Длина последовательности l .
    public static void task18(int n, int l) {
        if(n < l) {
            System.out.print("[" + (n) + "]" + " = " + (n));
            System.out.println(" ");

            for (; n < l; n++) {
                System.out.print("[" + (n + 1) + "]" + " = " + (2 * n));
                System.out.println(" ");
            }

        } else {
            System.out.println("Invalid data");
        }
    }
    // Задание 13
    // Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
    public static void task13() {
        String result = "";
        String result1 = "";
        String result2 = "";
        String result3 = "";
        for(int i = 0; i < 10; i++) {
            result = result + i;
            result1 = result1 + i + i;
            result2 = result2 + i + i + i;
            result3 = result3 + i + i + i + i;
        }
        System.out.println(result + result1 + result2 + result3);

    }
    // Задание 17 Сгенерируйте и распечатайте последовательность по формуле:
    //n + 1 = n + 2
    public static void task17(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.print("[" + (n + 1) + "]" + " = " + (n + 2));
            System.out.println(" ");
        }

    }


    public static void main(String[] args) {
        taskNumber(1);
        // Задание 1 Распечатать последовательность чисел от 0 до 9 включительно.

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        taskNumber(2);
        // Задание 2 Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        taskNumber(3);
        // Задание 3 Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        taskNumber(4);
        // Задание 4 Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for (int i = 326; i > 299; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        taskNumber(5);
        // Задание 5 Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        for (double i = 12; i < 13.1; i = i + 0.1) {
            System.out.print(i + " ");
        }
        System.out.println("");

        taskNumber(6);
        // Задание 6 Распечатать последовательность четных чисел от 215 до 237 включительно
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        taskNumber(7);
        // Задание 7 Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        taskNumber(8);
        // Задание 8 Распечатать последовательность которая начинается с минимального значения типа данных short и
        // заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
        for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        taskNumber(9);
        // Задание 9 Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
        // должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль
        // необходимо распечатать словом ZERO.
        for (int i = -10; i < 35; i++) {
            if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + "\u001B[0m" + " ");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + "\u001B[0m" + " ");
            } else if (i == 0) {
                System.out.print("\u001B[32m" + "ZERO" + "\u001B[0m");
            }
        }
        System.out.println("");

        taskNumber(10);
        // Задание 10 Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
        // десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end
        task10(0.10, 3.00, 0.5);

        taskNumber(11);
        // Задание 11 Написать метод, который принимает параметр L и печатает  последовательность четных чисел от нуля.
        // Длина последовательности = L.
        task11(5);

        taskNumber(12);
        // Задание 12 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
        task12(3);


        taskNumber(13);
        // Задание 13 Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
       task13();

        taskNumber(14);
        // Задание 14 Распечатайте последовательность чисел:
        // 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        System.out.println(0 + " ");
        for (int i = 0; i < 6; i++) {
            System.out.print(i + " ");
            System.out.print(i * (-1) + " ");
        }
        System.out.println(" ");


        taskNumber(15);
        // Задание 15 Распечатать последовательность чисел:
        //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        for (int i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");


        taskNumber(16);
        // Задание 16 Написать метод, который принимает параметры n, m, l, и печатает последовательность нечетных чисел
        // начиная с числа n, с шагом m,  длина последовательности  L.
        task16(0, 3, 5);

        taskNumber(17);
        // Задание 17 Сгенерируйте и распечатайте последовательность по формуле:
        //n + 1 = n + 2
        task17(1);



        taskNumber(18);
        // Задание 18 Написать метод, который принимает параметры l, n, и печатает последовательность чисел, начиная с
        // числа n, по формуле для n + 1 члена последовательности:
        //n + 1 = 2n
        // Длина последовательности l .
        task18(1, 10);


        taskNumber(19);
        // Задание 19 Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница между
        // первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if (des - ed <= 3 && ed - des <= 3)
                System.out.print(i + " ");
        }
        System.out.println(" ");




    }
}

