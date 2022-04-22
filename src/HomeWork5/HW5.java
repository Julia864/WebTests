package HomeWork5;

public class HW5 {

    public static void printTask(int i) {

        System.out.println("********************** Task " + i + "************************");

    }

    public static String testString(String actual, String expected) {
        String result = "";

        if (expected.equals(actual)) {
            result = "Pass";
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            result = "Fail";
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        return result;
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

    public static String testDouble(double actual, double expected) {

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

    public static String testBoolean(boolean actual, boolean expected) {
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

    public static String task2(int a) {

        String result = "";

        if (a == 1) {
            result = "Monday";
        } else if (a == 2) {
            result = "Tuesday";
        } else if (a == 3) {
            result = "Wednesday";
        } else if (a == 4) {
            result = "Thursday";
        } else if (a == 5) {
            result = "Friday";
        } else if (a == 6) {
            result = "Saturday";
        } else if (a == 7) {
            result = "Sunday";
        } else {
            result = "Ошибка";
        }
        return result;
    }

    // Задание 3
    // Given 3 values (x, y, z), determine the largest value and assign it to the variable Largest
    public static int task3(int x, int y, int z) {
        int largest;
        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest > z) {

        } else {
            largest = z;
        }
        return largest;
    }


    // Задание 4
    // Using nested if statements, write a fragment of code that prints the
    // smallest value contained in the variables a, b and c.

    public static int task4(int a, int b, int c) {
        int smallest;

        if (a < b) {
            smallest = a;
        } else {
            smallest = b;
        }
        if (smallest > c) {
            smallest = c;
        } else {
        }
        return smallest;
    }

    // Задание 5
    // Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
    public static double task5(double a, double b, double c, double d, double e) {
        double average = (a + b + c + d + e) / 5;
        return average;
    }

    // Задание 6
    // Написать метод, который принимает на вход десятичное число (например, 10.75),
    // и возвращает строку “10 руб 75 коп”.
    public static String task6(double a) {
        String result = "";
        if (a > 0) {
            int rub = (int) a;
            double kop = (a - rub) * 100;
            int kop1 = (int) kop;
            result = rub + " руб " + kop1 + " коп";

        } else {
            System.out.println("Ошибка");
        }
        return result;
    }

    // Задание 7
    // Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

    public static String task7(double a) {
        String result = "";
        if (a > 0) {
            int kg = (int) a;
            double gr = (a - kg) * 1000;
            int gr1 = (int) gr;
            result = kg + " кг " + gr1 + " гр";

        } else {
            System.out.println("Ошибка");
        }
        return result;
    }

    // Задание 8
    // Написать метод, который принимает на вход 2 параметра -  цену и количество товара
    // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки
    // в виде десятичного числа.
    public static double task8(double price, int amount) {
    double totalPrice = price * amount;
    return totalPrice;
    }

    // Задание 9
    // Написать метод, который принимает на вход необходимые параметры, и печатает чек.
    //Например:
    //
    //Яблоки
    //Цена за 1 кг            50 руб 13 коп
    //Количество товара             3 кг 400 гр
    //_______________________________________
    //Сумма к оплате        170 руб 44 коп
    // или
    // Хлеб
    //Цена за 1 шт        30 руб 50 коп
    //Количество товара    5 шт
    //_______________________________________
    //Сумма к оплате        152 руб 50 коп

    public static String task91(double b, double a) {
        String result = "";
        String kolvo = "Количество товара";
        String summa = "Сумма к оплате";
        String line = "________________________________";
        int kg = (int)a;
        double gr = (a - kg) * 1000;
        int gr1 = (int) gr;

        int rub = (int)b;
        double kop = (b - rub) * 100;
        int kop1 = (int) kop;

        //double multiply = b * a;
        //int multiply1 = (int) multiply;
        //double multiply2 = (multiply - multiply1) * 100;
        //int multiply3 = (int) multiply2;

        result = "Яблоки\n" + "Цена за 1 кг\t\t\t" + rub + " руб " + kop1 + " коп\n" + kolvo + "\t\t\t" + kg + " кг "
                + gr1 + " гр\n" + line + "\n" + summa + "\t\t\t" + " руб " + " коп ";

        return result;
    }

    public static String task92(double b, int a) {
        String result = "";
        String kolvo = "Количество товара";
        String summa = "Сумма к оплате";
        String line = "________________________________";

        int rub = (int)b;
        double kop = (b - rub) * 100;
        int kop1 = (int) kop;

        double multiply = b * a;
        int multiply1 = (int) multiply;
        double multiply2 = (multiply - multiply1) * 100;
        int multiply3 = (int) multiply2;

        result = "Хлеб\n" + "Цена за 1 шт\t\t\t" + rub + " руб " + kop1 + " коп\n" + kolvo + "\t\t\t" + a + " шт\n "
                + line + "\n" + summa + "\t\t\t" + multiply1 + " руб " + multiply3 + " коп ";

        return result;
    }

    // Задание 10
    // Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
    // и возвращает заработную плату в месяц.

    public static String task10(int a, int b) {
        int month = (a * b) * 22;
        return month + " руб. в месяц";
    }
    // Задание 11
    // Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
    //Например:
    //
    //Смирнова Мария Ивановна         70000 руб 00 коп
    // Распечатать ведомость для нескольких сотрудников, например:
    //
    //Март 2022
    //Смирнова Мария Ивановна         70000 руб 00 коп
    //Серебряков Иван Петрович         128059 руб 00 коп
    public static String task11(double a, String b) {
        String result = "";
        int rub = (int) a;
        double kop = (a - rub) * 100;
        int kop1 = (int) kop;
        result = b + "\t\t\t" + rub + " руб " + kop1 + " коп\n";

        return result;
    }

    // Задание 12
    // Записать в виде метода блок схему с рисунка:
    public static String task12(int x) {
        String result = "";
        if (x < 0) {
            result = "x is negative";
            System.out.println(x + " is negative");
        } else if (x > 0) {
            result = "x is positive";
            System.out.println(x + " is positive");
        } else {
            result = "x is zero";
            System.out.println(x + " is zero");
        }
        return result;
    }

    // Задание 13
    // Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
    // Например:
    // год рождения 1999
    // 1 + 9 + 9 + 9 = 28
    // 2 + 8 = 10
    // 1 + 0 = 1
    // Счастливое число - 1

    public static int task13(int a) {
        int result = 0;
        if (a > 0 && a < 10000) {
            int first = a % 10;
            int second = a / 10 % 10;
            int third = a / 100 % 10;
            int fourth = a / 1000 % 10;

            int summa = first + second + third + fourth;
            int sum1 = summa % 10;
            int sum2 = summa / 10 % 10;
            int ss = sum1 + sum2;

            int amount1 = ss % 10;
            int amount2 = ss / 10 % 10;
            int sss = amount1 + amount2;

            result = sss;
        } else {
            System.out.println("Ошибка");
        }
        return result;
    }

    // Задание 14
    // а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
    //
    //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
    //
    //*Медиана - это серединное число в отсортированном наборе чисел.
    //1, 3, 9 → медиана 3
    //12, 13, 101 → медиана 13
    //14, 2, 12 → медиана 12
    public static int mediana(int a, int b, int c) {
        int mediana;
        if ((a < b && a > c) || (a > b && a < c)) {
            mediana = a;
        } else if ((b < a && b > c) || (b > a && b < c)) {
            mediana = b;
        } else {
            mediana = c;
        }
           return mediana;
    }

    public static int average(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static String task14(int a, int b, int c) {
        String result = "";
        int raznitsa = mediana(a, b, c) - average(a, b, c);
        if (raznitsa < 0) {
            raznitsa = raznitsa * (-1);
        }

        if (raznitsa > 2) {
            result = "Среднее значение " + average(a, b, c) + " отличается от медианы "
                    + mediana(a, b, c) + " на " + raznitsa;
        } else {
            result = "Среднее значение = " + average(a, b, c) + ", а медиана = "
                    + mediana(a, b, c);
        }
        return result;
    }
    // Задание 15
    // Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки,
    // например “10 руб 00 коп”.

    public static String task15(double a) {
        String result = "";
        int rub = (int) Math.floor(a);
        int kop = rub / 100;
        result = rub + " руб " + kop + "0 коп";

        return result;
    }

    // Задание 16
    // Посчитать с помощью методов класса Math
    //        //a = 3
    //        //b = 4
    //        //c = 20
    //        //Вернуть значение с округлением в бОльшую сторону.

    public static double task16(int a, int b, int c) {
        double Pi = 3.14;
        double subresult = Math.sqrt(((a * b + c) * Math.pow(a, b))) / Pi;
        subresult = Math.ceil(subresult);
        subresult = (int)subresult;
        return subresult;
    }
    // Задание 17
    // a) Write statement that assigns 1 to x if y is greater than 0
    public static int task17a(int x, int y) {
        String result = "";
        if (y > 0) {
            x = x + 1;
            return x;
        } else {
            return x;
        }
    }

    // b) Suppose that score is a variable of type double. Write statement that increases the score by 5 marks
    // if score is between 80 and 90
    public static double task17b(double a) {
        if (a > 80 && a < 90) {
            a = a + 5;
            return a;
        } else {
            return a;
        }
    }

    // c) Rewrite the statement without using the NOT (!) operator:
    // item = ! (( i < 10) || (v >= 50)) - если знак ! стоит перед всем выражением в скобках, то все меняет
    // на противоположное, && => ||, < => >= и так далее

    public static boolean task17c(int i, int v) {
        boolean item = (i >= 10) || (v < 50);

        return item;
    }

    // d) Write statement that prints true if x is an odd number and positive

    public static boolean task17d(int x) {
        boolean result = (x % 2 == 0) && (x >= 0);
            return result;
        }

    // e) Write statement that prints true if both x and y are positive numbers

    public static boolean task17e(int x, int y) {
        boolean result = (x > 0) && (y > 0);
        return result;
    }
    // f) Write statement that prints true if x and y have the same sign (- / +)

    public static boolean task17f(int x, int y) {
        boolean result = ((x > 0) && (y > 0)) || ((x < 0) && (y < 0));
        return result;
    }

    // Задание 18
    // Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного
    // числа. Метод возвращает математически округленное целое значение и выводит на экран:
    //“Число … в степени … = …”
    //
    //Число может быть в пределах от 0 до 1 исключительно.
    //Степень числа может быть от 0 до 10 включительно

    public static String task18(int a) {
        String text = "";
        double result = Math.random();
        System.out.println(result);

        if (a >= 0 && a <= 10) {
            double result1 = Math.pow(Math.random(), a);
            double result2 = Math.round(result1);
            text = "Число " + result + " в степени " + a + " = " + result2;
        } else {
        }
        return text;
    }

    // Задание 19
    // Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
    public static int task19() {
        int a = (int) (Math.random() * 99) + 1;
        return a;
    }

    // Задание 20
    // задача про високосный год. Если високосный, то boolean должен вернуть true
    public static boolean task20(int a) {
        boolean isLeapYear = (a % 4 == 0);
        return isLeapYear;
    }

    public static void main(String[] args) {

        printTask(2);
        // Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели
        System.out.println(task2(9));
        testString(task2(9), "Monday");


        printTask(3);
        // Given 3 values (x, y, z), determine the largest value and assign it to the variable Largest
        System.out.println("The largest value is " + task3(8, 10, 3));
        testInteger(task3(8, 10, 3), 10);

        printTask(4);
        // Using nested if statements, write a fragment of code that prints the
        // smallest value contained in the variables a, b and c.
        System.out.println("The smallest value is " + task4(15, 25, 0));
        testInteger(task4(15, 25, 0), 0);

        printTask(5);
        // Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
        System.out.println("The average temperature is " + task5(36.6, 38.1, 37.5, 35.3, 40.4));
        testDouble(task5 ( 36.6, 38.1, 37.5, 35.3, 40.4), 37.58);

        printTask(6);
        // Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
        System.out.println(task6(10.75));
        testString(task6(10.75), "10 руб 75 коп");

        printTask(7);
        // Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
        System.out.println(task7(10.075));
        testString(task7(10.075), "10 кг 74 гр");


        printTask(8);
        // Написать метод, который принимает на вход 2 параметра -  цену и количество товара
        // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки
        // в виде десятичного числа.
        System.out.println("Сумма покупки = " + task8(10.50, 5));
        testDouble(task8(10.50, 5), 52.5);

        printTask(9);
        // Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        //Например:
        //
        //Яблоки
        //Цена за 1 кг            50 руб 13 коп
        //Количество товара             3 кг 400 гр
        //_______________________________________
        //Сумма к оплате        170 руб 44 коп
        // или
        // Хлеб
        //Цена за 1 шт        30 руб 50 коп
        //Количество товара    5 шт
        //_______________________________________
        //Сумма к оплате        152 руб 50 коп
        System.out.println(task91(50.13, 3.400));
        System.out.println(task92(30.50, 5));

        printTask(10);
        // Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
        // и возвращает заработную плату в месяц.
        System.out.println(task10(5, 35));
        testString(task10(5, 35), "3850 руб. в месяц");

        printTask(11);
        // Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
        //Например:
        //
        //Смирнова Мария Ивановна         70000 руб 00 коп
        // Распечатать ведомость для нескольких сотрудников, например:
        //
        //Март 2022
        //Смирнова Мария Ивановна         70000 руб 00 коп
        //Серебряков Иван Петрович         128059 руб 00 коп

        System.out.println(task11(70000.00, "Смирнова Мария Ивановна"));
        testString(task11(70000.00, "Смирнова Мария Ивановна"), "Смирнова Мария Ивановна\t\t\t70000 руб 0 коп ");


        printTask(12);
        // Записать в виде метода:
        task12(8);
        testString(task12(8), "x is positive");

        printTask(13);
        // Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
        //Например:
        //год рождения 1999
        //1 + 9 + 9 + 9 = 28
        //2 + 8 = 10
        //1 + 0 = 1
        //Счастливое число - 1
        System.out.println(task13(1999));
        testInteger(task13(1999), 1);

        printTask(14);
        // а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
        //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
        //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
        //
        //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
        //
        //*Медиана - это серединное число в отсортированном наборе чисел.
        //1, 3, 9 → медиана 3
        //12, 13, 101 → медиана 13
        //14, 2, 12 → медиана 12
        System.out.println(task14(12, 13, 101));
        testString(task14(1,3,9), "Среднее значение = 4, а медиана = 3");

        printTask(15);
        // Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
        // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
        System.out.println(task15(10.75));
        testString(task15(10.75), "10 руб 00 коп");

        printTask(16);
        // Посчитать с помощью методов класса Math
        //a = 3
        //b = 4
        //c = 20
        //
        //((a * b + c) * ab)
        //Вернуть значение с округлением в бОльшую сторону.
        System.out.println(task16(3, 4, 20));
        testDouble(task16(3,4,20), 17.0);

        printTask(17);
        // a) Write statement that assigns 1 to x if y is greater than 0
        // b) Suppose that score is a variable of type double. Write statement that increases the score by 5 marks
        // if score is between 80 and 90
        // c) Rewrite the statement without using the NOT (!) operator:
        // item = ! (( i < 10) || (v >= 50))
        // d) Write statement that prints true if x is an odd number and positive
        // e) Write statement that prints true if both x and y are positive numbers
        // f) Write statement that prints true if x and y have the same sign (- / +)

        System.out.println(task17a(6, 5));
        testInteger(task17a(6,5), 7);

        System.out.println(task17b(79.5));
        testDouble(task17b(79.5), 79.5);

        System.out.println(task17c(15, 100));
        testBoolean(task17c(15, 100), true);

        System.out.println(task17d(3));
        testBoolean(task17d(3), false);

        System.out.println(task17e(3,-8));
        testBoolean(task17e(3,-8), false);

        System.out.println(task17f(-1, -8));
        testBoolean(task17f(-1, -8), true);


        printTask(18);
        // Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного
        // числа. Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”
        //
        //Число может быть в пределах от 0 до 1 исключительно.
        //Степень числа может быть от 0 до 10 включительно
        System.out.println(task18(10));

        printTask(19);
        // Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
        System.out.println(task19());

        printTask(20);
        // задача про високосный год. Если високосный, то boolean должен вернуть true
        System.out.println(task20(2016));


    }
}

