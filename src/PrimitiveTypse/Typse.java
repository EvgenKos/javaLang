package PrimitiveTypse;

public class Typse {

    byte b = 0; // диапозон от -128 до 127, Wrapper class Byte
    short s = 0; // диапозон от -32 768 до 32 767, Wrapper class Short
    int i = 0; // диапозон от -2 147 483 648 до 2 147 483 647 , Wrapper class Integer
    long l = 0; // диапозон от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 , Wrapper class Long
    float f = 0.0f; // диапозон от -1,4e-54 до 3,4e+38 , Wrapper class Float
    double d = 0.0; // диапозон от -4,9e-324 до 1,8e+308 ,Wrapper class Double
    char c = 'c'; // Wrapper class Character
    boolean bool; // Wrapper class Boolean

    public static void main(String[] args) {

        // действия с примитивами
        int num = 33 + 10;
        System.out.println("num = 33 + 10 : " + num);

        num += 10;
        System.out.println("num += 10 : " + num);

        num = num - 5;
        System.out.println("num = num - 5 : " + num);

        num -= 5;
        System.out.println("num -= 5 : " + num);

        num++;
        System.out.println("num++ : " + num);

        num--;
        System.out.println("num-- : " + num);

        ++num;
        System.out.println("++num : " + num);

        --num;
        System.out.println("--num : " + num);

        System.out.println("*******************");

        int num2 = 3;

        int num3 = num2 * 2;
        System.out.println("num3 = num2 * 2 : " + num3);

        num3 *= 3;
        System.out.println("num3 *= 3 : " + num3);

        num3 = 7 / 2;
        System.out.println("Деление без остатка num3 = 7 / 2 : " + num3);

        num3 = num3 % 2;
        System.out.println("Остаток от деления num3 = num3 % 2 : " + num3);

        System.out.println("*******************");


        boolean boolNum = 3 < 2;
        System.out.println("boolNum = 3 < 2 : " + boolNum);

        boolNum = 3 == 2;
        System.out.println("boolNum = 3 == 2 : " + boolNum);

        boolNum = 3 != 2;
        System.out.println("boolNum = 3 != 2 : " + boolNum);

        System.out.println("*******************");

        // циклы
        int point = 5;
        int printInt = 0;


        // цикл for крутит действие до задданных условий

        for (int i = 0; printInt < 5; i++) {
            System.out.println("Цикл номер: " + printInt);
            printInt++;
        }

        System.out.println("*******************");

        // цикл while пока условия true (boolean)

        while (printInt > 0) {
            System.out.println("Цикл номер: " + printInt + " while true");
            printInt--;
        }

        System.out.println("*******************");

        // цикл do while выполнит условие один раз в любом случае, а дальше пока while true
        do{
            printInt++;
            System.out.println("Один раз в любом случае и пока " + printInt + " while true");
        }while(printInt < 0);


        System.out.println("*******************");


        // //////////
        int number = 123456;


    }
}
