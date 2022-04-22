package HomeWork3;

public class HW3 {
    public static void main (String [] args) {

        System.out.println("************************ Task 2 ***************************");
        // Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.

        byte a;
        byte b;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        a = 10;
        b = 5;
        System.out.println(a + "\n" + b);


        System.out.println("************************ Task 3 ***************************");
        // Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE - 60000;
        System.out.println(s + "\n" + t);


        System.out.println("************************ Task 4 ***************************");
        // Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        // Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:

        int i;
        System.out.println(Integer.MIN_VALUE);
        int iMin = -2147483648;
        System.out.println(Integer.MAX_VALUE);
        int iMax = 2147483647;

        String line = "_________________________________";
        String line1 = "|";
        String line2 = "____________________________________________";

        System.out.println(line);
        System.out.println(line1 + "int min" + "\t" + line1 + "\t" + iMin + "\t\t" + line1);
        System.out.println(line);
        System.out.println(line1 + "int max" + "\t" + line1 + "\t" + iMax + "\t\t" + line1);
        System.out.println(line);

        System.out.println("************************ Task 5 ***************************");
        // Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны
        // и города (можно ненастоящий номер телефона, например, 18009998877)

        long p;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        p = 18009998877L;

        System.out.println("************************ Task 6 ***************************");
        // Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double
        // и присвоить ей значение 100.101101. Распечатать результат в виде таблицы:

        float f;
        double d;


        f = 100.101101F;
        d = 100.101101;

        System.out.println(line2);
        System.out.println(line1 + "float f = 100.101101" + "\t" + line1 + "\t" + f + "\t\t" + line1);
        System.out.println(line2);
        System.out.println(line1 + "double d = 100.101101" + "\t" + line1 + "\t" + d + "\t\t" + line1);
        System.out.println(line2);


        System.out.println("************************ Task 7 ***************************");
        // Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999
        // и 20.099999. b) Создать переменную типа Float с именем ff  и инициализировать её результатом
        // суммы чисел 10.09999 и 20.099999.

        Double dd;
        Float ff;

        dd = 10.09999 + 20.099999;
        System.out.println(dd);

        ff = 10.09999F + 20.099999F;
        System.out.println(ff);

        System.out.println(line2);
        System.out.println(line1 + "float f = 100.101101" + "\t" + line1 + "\t" + f + "\t\t" + line1);
        System.out.println(line2);
        System.out.println(line1 + "double d = 100.101101" + "\t" + line1 + "\t" + d + "\t\t" + line1);
        System.out.println(line2);
        System.out.println(line1 + "Float ff" + "\t" + line1 + "\t" + ff + "\t\t\t\t" + line1);
        System.out.println(line2);
        System.out.println(line1 + "Double dd" + "\t" + line1 + "\t" + dd + "\t\t" + line1);
        System.out.println(line2);

        System.out.println("************************ Task 8 ***************************");
        // Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)

        double result;
        result = (10 + 0.0)/3;
        System.out.println(result);

        System.out.println("************************ Task 9 ***************************");
        // Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);


        System.out.println("************************ Task 10 ***************************");
        // Распечатать слово HELLO точками

        String print1 = "*  *  ";
        String print2 = "***   ";
        String print3 = "****  ";
        String print4 = "*     ";

        System.out.println (print1 + print3 + print4 + print4 + print3);
        System.out.println (print1 + print4 + print4 + print4 + print1);
        System.out.println (print3 + print2 + print4 + print4 + print1);
        System.out.println (print1 + print4 + print4 + print4 + print1);
        System.out.println (print1 + print3 + print3 + print3 + print3);

        System.out.println("************************ Task 11 ***************************");
        // Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
        //t1 = 0;
        //t2 = 150;
        //t3 = -120;
        //t4 = - 505.505;
        //t5 = 100100;
        //t6 = 100010001000;
        //t7 = 2.66666666666666;
        //t8 = - 1000000.001;
        //t9 = 1010;


        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F; // float начинает глючить, если 4-5 знаков после точки, и он меньше чем double
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666; // здесь только double
        Double t8 = - 1000000.001; // может быть и Float??
        Short t9 = 1010;

        System.out.println("Byte t1 = " + t1);
        System.out.println("Short t2 = " + t2);
        System.out.println("Byte t3 = " + t3);
        System.out.println("Double t4 = " + t4);
        System.out.println("Integer t5 = " + t5);
        System.out.println("Long t6 = " + t6);
        System.out.println("Float t7 = " + t7);
        System.out.println("Double t8 = " + t8);
        System.out.println("Short t9 = " + t9);

        System.out.println("************************ Task 12 ***************************");
        // С помощью полей классов ссылочного типа распечатать таблицу:

        String line3 = "_________________________________________________";
        System.out.println(line3);
        System.out.println(line1 + "\tType\t" + line1 + "\tSize in bits\t" + line1 + "\tmin\t" + line1
                + "\tmax\t" + line1);
        System.out.println(line3);
        System.out.println(line1 + "\tbyte\t" + line1 + "\t" + Byte.SIZE + "\t" + line1 + "\t" + Byte.MIN_VALUE
                + "\t" + line1 + "\t" + Byte.MAX_VALUE + "\t" + line1);;
        System.out.println(line3);
        System.out.println(line1 + "\tshort\t" + line1 + "\t" + Short.SIZE + "\t" + line1 + "\t" + Short.MIN_VALUE
                + "\t" + line1 + "\t" + Short.MAX_VALUE + "\t" + line1);;
        System.out.println(line3);
        System.out.println(line1 + "\tint\t" + line1 + "\t" + Integer.SIZE + "\t" + line1 + "\t" + Integer.MIN_VALUE
                + "\t" + line1 + "\t" + Integer.MAX_VALUE + "\t" + line1);;
        System.out.println(line3);
        System.out.println(line1 + "\tlong\t" + line1 + "\t" + Long.SIZE + "\t" + line1 + "\t" + Long.MIN_VALUE
                + "\t" + line1 + "\t" + Long.MAX_VALUE + "\t" + line1);;
        System.out.println(line3);
        System.out.println(line1 + "\tfloat\t" + line1 + "\t" + Float.SIZE + "\t" + line1 + "\t" + Float.MIN_VALUE
                + "\t" + line1 + "\t" + Float.MAX_VALUE + "\t" + line1);;
        System.out.println(line3);
        System.out.println(line1 + "\tdouble\t" + line1 + "\t" + Double.SIZE + "\t" + line1 + "\t" + Double.MIN_VALUE
                + "\t" + line1 + "\t" + Double.MAX_VALUE + "\t" + line1);;
        System.out.println(line3);


        System.out.println("************************ Task 13 ***************************");
        // Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения, сравнить 2
        // переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать в виде выражения:
        //“Если num1 = num2, то результат сравнения методом .equal = …”
        //
        //Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        //“Если num1 не равно num2, то результат сравнения методом .equal = …”

        Integer num1 = 3;
        Integer num2 = 3;
        System.out.println(num1.equals(num2));
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num1 = 3;
        num2 = 4;
        System.out.println(num1.equals(num2));
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));

        System.out.println("************************ Task 14 ***************************");
        // Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        //а) одинаковыми значениями
        //b) number1 < number2
        //c) number1 > number2
        //сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
        // и вывести результаты сравнения на печать в виде выражений:
        //“Если number1 = number2, то результат сравнения методом … = …”
        //“Если number1 < number2, то результат сравнения методом … = …”
        //“Если number1 > number2, то результат сравнения методом … = …”

        int number1 = 5;
        int number2 = 5;

        Integer.compare(number1, number2);
        System.out.println(Integer.compare(number1, number2));
        System.out.println("Если number1 = number2, то результат сравнения методом Integer.compare = "
                + Integer.compare(number1, number2));

        number1 = 4;
        number2 = 5;
        Integer.compare(number1, number2);
        System.out.println(Integer.compare(number1, number2));
        System.out.println("Если number1 < number2, то результат сравнения методом Integer.compare = "
                + Integer.compare(number1, number2));

        number1 = 6;
        number2 = 5;
        Integer.compare(number1, number2);
        System.out.println(Integer.compare(number1, number2));
        System.out.println("Если number1 > number2, то результат сравнения методом Integer.compare = "
                + Integer.compare(number1, number2));

        System.out.println("************************ Task 15 ***************************");
        // Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int

        Float w = 234.9999F;
        w.intValue();
        System.out.println(w.intValue());

        System.out.println("************************ Task 16 ***************************");
        // С помощью метода sum() класса Double посчитать сумму двух переменных типа double.

        double g = 5.6;
        double g1 = 5.7;
        Double.sum(g, g1);
        System.out.println(Double.sum(g, g1));

        System.out.println("************************ Task 17 ***************************");
        // С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.

        Float q = 7.8F;
        Float q1 = 8.7F;

        q.intValue();
        q1.intValue();
        Integer.sum(q.intValue(), q1.intValue());
        System.out.println(Integer.sum(q.intValue(), q1.intValue()));;

        System.out.println("************************ Task 18 ***************************");
        // Создать 2 переменные типа Short:
        //short1 = 12000
        //short2 = 12300
        //Распечатать фразу:
        //“12000 - 12300 = -300”
        //где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
        //Присвоить переменной short1 значение 12500, вывести фразу:
        //“12500 - 12300 = 200”
        //где значение 200 выведено с помощью метода класса Short, а не операцией вычисления

        Short short1 = 12000;
        Short short2 = 12300;
        Short.compare(short1, short2);
        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));

        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));

        System.out.println("************************ Task 19 ***************************");
        // Создать переменные:
        //String str1 = "123.56";
        //String str2 = "123.55";
        //Double doub1 = 123.56;
        //Double doub2 = 123.55;
        // Распечатать результат doub1 - doub2 . Используя методы ссылочного типа данных,
        // посчитать и распечатать результат str1 - str2

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        System.out.println("doub1 - doub2 = " + (doub1-doub2));

        Double nomer = Double.parseDouble(str1);
        Double nomer1 = Double.parseDouble(str2);
        System.out.println(nomer - nomer1); // или еще ниже
        System.out.println(Double.valueOf(nomer) - Double.valueOf(nomer1));

        System.out.println("************************ Task 20 ***************************");
        // Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
        // (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение, затем
        // минимальное значение. Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
        // Распечатать результат среднего значения температуры тела кота

        Double temp = 37.3;
        Double average = temp/2;
        temp = 35.6; // min value

        average = average + temp/2;

        System.out.println("Средняя температура кота = " + Math.round(average));


        System.out.println("************************ Task 21 ***************************");
        // Создать переменную n типа Number, присвоить ей максимально возможное значение.
        //Присвоить n значение 10, затем присвоить n значение 10.999999999.
        //Распечатать результаты в виде выражения: “Переменная n может принимать значения:
        // n =  …
        // n =  …
        // n =  …
        // Это возможно, потому что …”

        Number n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999999999;

        System.out.println("Переменная n может принимать значения\n" + "n = " + Double.MAX_VALUE + "\n" + "n = " + n.intValue() + "\n" + "n = "
                + n + "\n" + "Это возможно, потому что   "); // или sout писать после каждой переменной n

        System.out.println("************************ Task 22 ***************************");
        // Создать переменную Integer numberInteger = 100. Доказать, что numberInteger имеет тип Integer,
        // а numberInteger.toString() имеет тип String.
        Integer numberInteger = 100;
        System.out.println(numberInteger + 10);
        numberInteger.toString();
        System.out.println(numberInteger.toString() + 10);


        System.out.println("************************ Task 23 ***************************");
        // Вывести на экран следующие выражения, используя для печати только переменные:
        //“36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту должно быть
        // вычислено по формуле “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам

        double massa = 5;
        double massafunty = massa * 2.205;

        System.out.println("50 kilogram = " + massafunty + " lbs");

        double zelsij = 36.6;
        double fareng = zelsij * 1.8 + 32;
        System.out.println(zelsij + " градусов по Цельсию = " + fareng + " градусов по Фаренгейту");


    }
}
