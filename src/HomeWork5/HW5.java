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
            result = "????????????";
        }
        return result;
    }

    // ?????????????? 3
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


    // ?????????????? 4
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

    // ?????????????? 5
    // ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ???? 5 ?????????????????????? ?????????????????????? ???????? ????????.
    public static double task5(double a, double b, double c, double d, double e) {
        double average = (a + b + c + d + e) / 5;
        return average;
    }

    // ?????????????? 6
    // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????????????? ?????????? (????????????????, 10.75),
    // ?? ???????????????????? ???????????? ???10 ?????? 75 ?????????.
    public static String task6(double a) {
        String result = "";
        if (a > 0) {
            int rub = (int) a;
            double kop = (a - rub) * 100;
            int kop1 = (int) kop;
            result = rub + " ?????? " + kop1 + " ??????";

        } else {
            System.out.println("????????????");
        }
        return result;
    }

    // ?????????????? 7
    // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????????????? ?????????? ?? ???????????????????? ???????????? ???10 ???? 75 ???????.

    public static String task7(double a) {
        String result = "";
        if (a > 0) {
            int kg = (int) a;
            double gr = (a - kg) * 1000;
            int gr1 = (int) gr;
            result = kg + " ???? " + gr1 + " ????";

        } else {
            System.out.println("????????????");
        }
        return result;
    }

    // ?????????????? 8
    // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? 2 ?????????????????? -  ???????? ?? ???????????????????? ????????????
    // (?????????? ???????? ?????? ????????????, ?????? ???????????????????? ?? ????????????). ???????????????? ???????????????????? ?????????? ??????????????
    // ?? ???????? ?????????????????????? ??????????.
    public static double task8(double price, int amount) {
    double totalPrice = price * amount;
    return totalPrice;
    }

    // ?????????????? 9
    // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ?????????????????????? ??????????????????, ?? ???????????????? ??????.
    //????????????????:
    //
    //????????????
    //???????? ???? 1 ????            50 ?????? 13 ??????
    //???????????????????? ????????????             3 ???? 400 ????
    //_______________________________________
    //?????????? ?? ????????????        170 ?????? 44 ??????
    // ??????
    // ????????
    //???????? ???? 1 ????        30 ?????? 50 ??????
    //???????????????????? ????????????    5 ????
    //_______________________________________
    //?????????? ?? ????????????        152 ?????? 50 ??????

    public static String task91(double b, double a) {
        String result = "";
        String kolvo = "???????????????????? ????????????";
        String summa = "?????????? ?? ????????????";
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

        result = "????????????\n" + "???????? ???? 1 ????\t\t\t" + rub + " ?????? " + kop1 + " ??????\n" + kolvo + "\t\t\t" + kg + " ???? "
                + gr1 + " ????\n" + line + "\n" + summa + "\t\t\t" + " ?????? " + " ?????? ";

        return result;
    }

    public static String task92(double b, int a) {
        String result = "";
        String kolvo = "???????????????????? ????????????";
        String summa = "?????????? ?? ????????????";
        String line = "________________________________";

        int rub = (int)b;
        double kop = (b - rub) * 100;
        int kop1 = (int) kop;

        double multiply = b * a;
        int multiply1 = (int) multiply;
        double multiply2 = (multiply - multiply1) * 100;
        int multiply3 = (int) multiply2;

        result = "????????\n" + "???????? ???? 1 ????\t\t\t" + rub + " ?????? " + kop1 + " ??????\n" + kolvo + "\t\t\t" + a + " ????\n "
                + line + "\n" + summa + "\t\t\t" + multiply1 + " ?????? " + multiply3 + " ?????? ";

        return result;
    }

    // ?????????????? 10
    // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????????????? ?????????? ???????????? ?? ???????? ?? ?????????????????? ???????????? ???????? ????????????,
    // ?? ???????????????????? ???????????????????? ?????????? ?? ??????????.

    public static String task10(int a, int b) {
        int month = (a * b) * 22;
        return month + " ??????. ?? ??????????";
    }
    // ?????????????? 11
    // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ?????????????????????? ?????????????????? ?? ???????????????? ???????????? ?????????????????? ???????????? ???????????????? ??????????????????????.
    //????????????????:
    //
    //???????????????? ?????????? ????????????????         70000 ?????? 00 ??????
    // ?????????????????????? ?????????????????? ?????? ???????????????????? ??????????????????????, ????????????????:
    //
    //???????? 2022
    //???????????????? ?????????? ????????????????         70000 ?????? 00 ??????
    //???????????????????? ???????? ????????????????         128059 ?????? 00 ??????
    public static String task11(double a, String b) {
        String result = "";
        int rub = (int) a;
        double kop = (a - rub) * 100;
        int kop1 = (int) kop;
        result = b + "\t\t\t" + rub + " ?????? " + kop1 + " ??????\n";

        return result;
    }

    // ?????????????? 12
    // ???????????????? ?? ???????? ???????????? ???????? ?????????? ?? ??????????????:
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

    // ?????????????? 13
    // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ?????? ???????????????? ?? ???????????????????? ???????? ???????????????????? ??????????. ???????????????????? ?????????? ???????????????????????????? ???? ??????????????: ?????????? ???????? ??????????, ???????? ?????????????????? ???????????? 9, ?????????? ?????????????????? ?????????? ???????? ??????????.
    // ????????????????:
    // ?????? ???????????????? 1999
    // 1 + 9 + 9 + 9 = 28
    // 2 + 8 = 10
    // 1 + 0 = 1
    // ???????????????????? ?????????? - 1

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
            System.out.println("????????????");
        }
        return result;
    }

    // ?????????????? 14
    // ??) ???????? 3 ??????????. ???????????????????? ???????????????????? ?????????????? ?????????? ?????????????? ?????????????????? ?? ???????????????? (median) ??????????????????.
    //???????? ?????????????? ???????????? 2, ???????????????????? ???????????????? ??????????????????: ????????????????? ???????????????? ??? ???????????????????? ???? ?????????????? ??? ???? ??? ???.
    //?????????? ???????????????? ??????????????????: ????????????????? ???????????????? =  ???, ?????????????? =  ??? ???.
    //
    //b) ?????????????????? ?????? ???? ???? ?????????? ?? ?????????????? ?????????????? ???????????? Math, ?????? ???????????????? ???? ????????????????????????
    //
    //*?????????????? - ?????? ???????????????????? ?????????? ?? ?????????????????????????????? ???????????? ??????????.
    //1, 3, 9 ??? ?????????????? 3
    //12, 13, 101 ??? ?????????????? 13
    //14, 2, 12 ??? ?????????????? 12
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
            result = "?????????????? ???????????????? " + average(a, b, c) + " ???????????????????? ???? ?????????????? "
                    + mediana(a, b, c) + " ???? " + raznitsa;
        } else {
            result = "?????????????? ???????????????? = " + average(a, b, c) + ", ?? ?????????????? = "
                    + mediana(a, b, c);
        }
        return result;
    }
    // ?????????????? 15
    // ???????????????? ??????????, ?????????????? ???????????????????? ???????????? ???????????? Math, ?????????????????? ???? ???????? ?????????? ?? ???????????? (????????????????, 10.75)
    // ?? ?????????????????? ?????????? ?? ???????????? ????????????????????. ?????????? ???????????????????? ?????????? ?????????? ?? ???????????? ?? ???????? ????????????,
    // ???????????????? ???10 ?????? 00 ?????????.

    public static String task15(double a) {
        String result = "";
        int rub = (int) Math.floor(a);
        int kop = rub / 100;
        result = rub + " ?????? " + kop + "0 ??????";

        return result;
    }

    // ?????????????? 16
    // ?????????????????? ?? ?????????????? ?????????????? ???????????? Math
    //        //a = 3
    //        //b = 4
    //        //c = 20
    //        //?????????????? ???????????????? ?? ?????????????????????? ?? ?????????????? ??????????????.

    public static double task16(int a, int b, int c) {
        double Pi = 3.14;
        double subresult = Math.sqrt(((a * b + c) * Math.pow(a, b))) / Pi;
        subresult = Math.ceil(subresult);
        subresult = (int)subresult;
        return subresult;
    }
    // ?????????????? 17
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
    // item = ! (( i < 10) || (v >= 50)) - ???????? ???????? ! ?????????? ?????????? ???????? ???????????????????? ?? ??????????????, ???? ?????? ????????????
    // ???? ??????????????????????????????, && => ||, < => >= ?? ?????? ??????????

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

    // ?????????????? 18
    // ???????????????? ??????????, ?????????????? ?? ?????????????? ?????????????? ???????????? Math ?????????????????????? ?????????? ?????????????? ???????????????????????????????? ????????????????????
    // ??????????. ?????????? ???????????????????? ?????????????????????????? ?????????????????????? ?????????? ???????????????? ?? ?????????????? ???? ??????????:
    //????????????? ??? ?? ?????????????? ??? = ??????
    //
    //?????????? ?????????? ???????? ?? ???????????????? ???? 0 ???? 1 ??????????????????????????.
    //?????????????? ?????????? ?????????? ???????? ???? 0 ???? 10 ????????????????????????

    public static String task18(int a) {
        String text = "";
        double result = Math.random();
        System.out.println(result);

        if (a >= 0 && a <= 10) {
            double result1 = Math.pow(Math.random(), a);
            double result2 = Math.round(result1);
            text = "?????????? " + result + " ?? ?????????????? " + a + " = " + result2;
        } else {
        }
        return text;
    }

    // ?????????????? 19
    // ???????????????? ??????????, ?????????????? ???????????????????? ?????????????????? ?????????? ?? ???????????????? ???? 1 ???? 99 ????????????????????????.
    public static int task19() {
        int a = (int) (Math.random() * 99) + 1;
        return a;
    }

    // ?????????????? 20
    // ???????????? ?????? ???????????????????? ??????. ???????? ????????????????????, ???? boolean ???????????? ?????????????? true
    public static boolean task20(int a) {
        boolean isLeapYear = (a % 4 == 0);
        return isLeapYear;
    }

    public static void main(String[] args) {

        printTask(2);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ?????????? ???? 1 ???? 7  ?? ???????????????????? ???????? ????????????
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
        // ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ???? 5 ?????????????????????? ?????????????????????? ???????? ????????.
        System.out.println("The average temperature is " + task5(36.6, 38.1, 37.5, 35.3, 40.4));
        testDouble(task5 ( 36.6, 38.1, 37.5, 35.3, 40.4), 37.58);

        printTask(6);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????????????? ?????????? (????????????????, 10.75), ?? ???????????????????? ???????????? ???10 ?????? 75 ?????????.
        System.out.println(task6(10.75));
        testString(task6(10.75), "10 ?????? 75 ??????");

        printTask(7);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????????????? ?????????? ?? ???????????????????? ???????????? ???10 ???? 75 ???????.
        System.out.println(task7(10.075));
        testString(task7(10.075), "10 ???? 74 ????");


        printTask(8);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? 2 ?????????????????? -  ???????? ?? ???????????????????? ????????????
        // (?????????? ???????? ?????? ????????????, ?????? ???????????????????? ?? ????????????). ???????????????? ???????????????????? ?????????? ??????????????
        // ?? ???????? ?????????????????????? ??????????.
        System.out.println("?????????? ?????????????? = " + task8(10.50, 5));
        testDouble(task8(10.50, 5), 52.5);

        printTask(9);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ?????????????????????? ??????????????????, ?? ???????????????? ??????.
        //????????????????:
        //
        //????????????
        //???????? ???? 1 ????            50 ?????? 13 ??????
        //???????????????????? ????????????             3 ???? 400 ????
        //_______________________________________
        //?????????? ?? ????????????        170 ?????? 44 ??????
        // ??????
        // ????????
        //???????? ???? 1 ????        30 ?????? 50 ??????
        //???????????????????? ????????????    5 ????
        //_______________________________________
        //?????????? ?? ????????????        152 ?????? 50 ??????
        System.out.println(task91(50.13, 3.400));
        System.out.println(task92(30.50, 5));

        printTask(10);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????????????? ?????????? ???????????? ?? ???????? ?? ?????????????????? ???????????? ???????? ????????????,
        // ?? ???????????????????? ???????????????????? ?????????? ?? ??????????.
        System.out.println(task10(5, 35));
        testString(task10(5, 35), "3850 ??????. ?? ??????????");

        printTask(11);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ?????????????????????? ?????????????????? ?? ???????????????? ???????????? ?????????????????? ???????????? ???????????????? ??????????????????????.
        //????????????????:
        //
        //???????????????? ?????????? ????????????????         70000 ?????? 00 ??????
        // ?????????????????????? ?????????????????? ?????? ???????????????????? ??????????????????????, ????????????????:
        //
        //???????? 2022
        //???????????????? ?????????? ????????????????         70000 ?????? 00 ??????
        //???????????????????? ???????? ????????????????         128059 ?????? 00 ??????

        System.out.println(task11(70000.00, "???????????????? ?????????? ????????????????"));
        testString(task11(70000.00, "???????????????? ?????????? ????????????????"), "???????????????? ?????????? ????????????????\t\t\t70000 ?????? 0 ?????? ");


        printTask(12);
        // ???????????????? ?? ???????? ????????????:
        task12(8);
        testString(task12(8), "x is positive");

        printTask(13);
        // ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ?????? ???????????????? ?? ???????????????????? ???????? ???????????????????? ??????????. ???????????????????? ?????????? ???????????????????????????? ???? ??????????????: ?????????? ???????? ??????????, ???????? ?????????????????? ???????????? 9, ?????????? ?????????????????? ?????????? ???????? ??????????.
        //????????????????:
        //?????? ???????????????? 1999
        //1 + 9 + 9 + 9 = 28
        //2 + 8 = 10
        //1 + 0 = 1
        //???????????????????? ?????????? - 1
        System.out.println(task13(1999));
        testInteger(task13(1999), 1);

        printTask(14);
        // ??) ???????? 3 ??????????. ???????????????????? ???????????????????? ?????????????? ?????????? ?????????????? ?????????????????? ?? ???????????????? (median) ??????????????????.
        //???????? ?????????????? ???????????? 2, ???????????????????? ???????????????? ??????????????????: ????????????????? ???????????????? ??? ???????????????????? ???? ?????????????? ??? ???? ??? ???.
        //?????????? ???????????????? ??????????????????: ????????????????? ???????????????? =  ???, ?????????????? =  ??? ???.
        //
        //b) ?????????????????? ?????? ???? ???? ?????????? ?? ?????????????? ?????????????? ???????????? Math, ?????? ???????????????? ???? ????????????????????????
        //
        //*?????????????? - ?????? ???????????????????? ?????????? ?? ?????????????????????????????? ???????????? ??????????.
        //1, 3, 9 ??? ?????????????? 3
        //12, 13, 101 ??? ?????????????? 13
        //14, 2, 12 ??? ?????????????? 12
        System.out.println(task14(12, 13, 101));
        testString(task14(1,3,9), "?????????????? ???????????????? = 4, ?? ?????????????? = 3");

        printTask(15);
        // ???????????????? ??????????, ?????????????? ???????????????????? ???????????? ???????????? Math, ?????????????????? ???? ???????? ?????????? ?? ???????????? (????????????????, 10.75)
        // ?? ?????????????????? ?????????? ?? ???????????? ????????????????????. ?????????? ???????????????????? ?????????? ?????????? ?? ???????????? ?? ???????? ????????????, ???????????????? ???10 ?????? 00 ?????????.
        System.out.println(task15(10.75));
        testString(task15(10.75), "10 ?????? 00 ??????");

        printTask(16);
        // ?????????????????? ?? ?????????????? ?????????????? ???????????? Math
        //a = 3
        //b = 4
        //c = 20
        //
        //((a * b + c) * ab)
        //?????????????? ???????????????? ?? ?????????????????????? ?? ?????????????? ??????????????.
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
        // ???????????????? ??????????, ?????????????? ?? ?????????????? ?????????????? ???????????? Math ?????????????????????? ?????????? ?????????????? ???????????????????????????????? ????????????????????
        // ??????????. ?????????? ???????????????????? ?????????????????????????? ?????????????????????? ?????????? ???????????????? ?? ?????????????? ???? ??????????:
        //????????????? ??? ?? ?????????????? ??? = ??????
        //
        //?????????? ?????????? ???????? ?? ???????????????? ???? 0 ???? 1 ??????????????????????????.
        //?????????????? ?????????? ?????????? ???????? ???? 0 ???? 10 ????????????????????????
        System.out.println(task18(10));

        printTask(19);
        // ???????????????? ??????????, ?????????????? ???????????????????? ?????????????????? ?????????? ?? ???????????????? ???? 1 ???? 99 ????????????????????????.
        System.out.println(task19());

        printTask(20);
        // ???????????? ?????? ???????????????????? ??????. ???????? ????????????????????, ???? boolean ???????????? ?????????????? true
        System.out.println(task20(2016));


    }
}

