package homework2;

import java.sql.SQLOutput;

public class HomeWork2 {
    public static void main (String [] args) {
        int k = 5;
        int l = 10;
        int m = 15;


        System.out.println("<<<<<<<<<<<<<<<< Task 12 >>>>>>>>>>>>>>>>>>");
        // Вывести значения переменных в столбик

        System.out.println(k + " " + l + " " + m);
        System.out.print(k + " ");
        System.out.print(l + " ");
        System.out.println(m );

        System.out.println("<<<<<<<<<<<<<<<< Task 13 >>>>>>>>>>>>>>>>>>");
        // Вывести значения переменных в строку

        System.out.println(k + "\n" + l + "\n" + m);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.println("<<<<<<<<<<<<<<<< Task 14 >>>>>>>>>>>>>>>>>>");
        // Используя конкатенацию, вывести значения переменных в строку через запятую

        System.out.println(k + ", " + l + ", " + m);

        System.out.println("<<<<<<<<<<<<<<<< Task 15 >>>>>>>>>>>>>>>>>>");
        // Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится

        System.out.println("int k = " + k);
        System.out.println("int l = " + l);
        System.out.println("int m = " + m);

        System.out.println("<<<<<<<<<<<<<<<< Task 16 >>>>>>>>>>>>>>>>>>");
        // Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
        //Sum of k and l = …
        //k * m = …
        //Разность переменных l и m = …

        int sumkl = k + l;
        int multkm = k * m;
        int dellm = l - m;

        System.out.println("Sum of k and l = " + sumkl);
        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + multkm);
        System.out.println("Разность переменных l и m = " + dellm);

        System.out.println("<<<<<<<<<<<<<<<< Task 17 >>>>>>>>>>>>>>>>>>");
        // Распечатать следующие выражения:
        // Результат деления k на l = …, а остаток от деления  = …
        // Результат деления k на m = …, а остаток от деления  = …
        // Результат деления l на m = …, а остаток от деления  = …
        // Результат деления m на k = …, а остаток от деления  = …

        System.out.println("Результат деления k на l = " + (k + 0.0)/l + " а остаток от деления = " + k%l);
        System.out.println("Результат деления k на m = " + (k + 0.0)/m + " а остаток от деления = " + k%m);
        System.out.println("Результат деления l на m = " + (l + 0.0)/m + " а остаток от деления = " + l%m);
        System.out.println("Результат деления m на k = " + (m + 0.0)/k + " а остаток от деления = " + (m + 0.0)%k);

        System.out.println("<<<<<<<<<<<<<<<< Task 18 >>>>>>>>>>>>>>>>>>");
        // Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
        //Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        //
        //Распечатать это же выражение со значениями 100 и 21.

        int apple = 40;
        int student = 6;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников,"
                + " то каждый ученик получит по " + (apple / student) + " яблок(a), и "
                + (apple % student) + " яблок(а) останется учителю.");

       apple = 100;
       student = 21;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников,"
                + " то каждый ученик получит по " + apple / student + " яблок(a), и "
                + apple % student + " яблок(а) останется учителю.");


        System.out.println("<<<<<<<<<<<<<<<< Task 19 >>>>>>>>>>>>>>>>>>");
        // Распечатать вычисления и итоговый результат:
        //Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …

        int sumKLM = k + l + m;
        int p = m++;
        int KLM2 = sumKLM--;


        System.out.println("Сумма чисел k, l и m++ и sumKLM-- = " + (k + l + p + KLM2) + ", а разность " +
                "m++ и sumKLM = " + (p - sumKLM));

        System.out.println("<<<<<<<<<<<<<<<< Task 20 >>>>>>>>>>>>>>>>>>");
        // Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.

        System.out.println(48%8);
        System.out.println(48%2);
        System.out.println(8%2);
        System.out.println(47%2);
        System.out.println(49%2);


        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        System.out.println("<<<<<<<<<<<<<<<< Task 21 >>>>>>>>>>>>>>>>>>");
        System.out.println("(x + 3) * (x + 3)");
        System.out.println((x + 3) * (x + 3));
        int result21 = (x + 3) * (x + 3);

        System.out.println("<<<<<<<<<<<<<<<< Task 22 >>>>>>>>>>>>>>>>>>");
        System.out.println("(3 + 4 * x) / 5 - 10 * (y - 5) * (a + b + c) / x + 9 * (4 / x + 9 / x / y)");
        System.out.println((3 + 4 * x) / 5 - 10 * (y - 5) * (a + b + c) / x + 9 * (4 / x + 9 / x / y));
        int result22 = (((3 + 4 * x) / 5)) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x + ((9 + x) / y)));

        System.out.println("<<<<<<<<<<<<<<<< Task 23 >>>>>>>>>>>>>>>>>>");
        System.out.println(((5 * x + 7 * y) / (8 * x + 10 * y)) * ((x + y) / (3 * x - y))
                / (a + b + c / d + (a + b) / (c + d) + a * b));
        int result23 = ((5 * x + 7 * y) / (8 * x + 10 * y)) * ((x + y) / (3 * x - y))
                / (a + b + c / d + (a + b) / (c + d) + a * b);


        System.out.println("<<<<<<<<<<<<<<<<< Part 3 - b >>>>>>>>>>>>>>");
        String line1 = "--------------------------";
        String line2 = "|";

        System.out.println(line1);
        System.out.println(line2 + "   task" + "\t" + line2 + "  result   " + line2);
        System.out.println(line1);
        System.out.println(line2 + "   21   " + "\t" + line2 + "\t" + result21 + "\t" + "\t" + line2);
        System.out.println(line1);
        System.out.println(line2 + "   22   " + "\t" + line2 + "\t" + result22 + "\t" + "\t" + line2);
        System.out.println(line1);
        System.out.println(line2 + "   23   " + "\t" + line2 + "\t" + result23 + "\t" + "\t" + line2);
        System.out.println(line1);

    }
}
