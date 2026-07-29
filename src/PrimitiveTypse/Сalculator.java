package PrimitiveTypse;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();


        int two;
        while(true){
            System.out.println("Введите второе число, которое меньше первого: ");
            two = sc.nextInt();

            if ((one < two)) {
                System.out.println("Не корректное значение! Повторите попытку: ");
            }else {
                break;
            }
        }

        char action;
        while(true) {
            System.out.println("Введите знак действия: + сложение, - вычитание, * умножение, / деление, % остаток от деления");
            action = sc.next().charAt(0);

            if(action == '+' || action == '-' || action == '*' || action == '/' || action == '%') {
                break;
            }else {
                System.out.println("Не корректное значение, повторите попытку!");
            }
        }

        switch (action) {
            case '+'-> System.out.println(one + " + " + two + " = " + (one + two));
            case '-'-> System.out.println(one + " - " + two + " = " + (one - two));
            case '*'-> System.out.println(one + " * " + two + " = " + (one * two));
            case '/'-> System.out.println(one + " / " + two + " = " + (one / two));
            case '%'-> System.out.println(one + " % " + two + " = " + (one % two));
            default -> System.out.println("Упсссс какая-то ошибка(");

        }

        int month;
        int year;
        while(true){
            System.out.println("Введите число месяца: ");
            month = sc.nextInt();
            if(month < 1 || month > 12){
                System.out.println("Такого месяца не существует! повторите попытку");
            }else {
                break;
            }
        }

        while(true){
            System.out.println("Введите год: ");
            year = sc.nextInt();
            if(year < 1 || year > 9999){
                System.out.println("Вы помоему переборщили xD, повторите попытку:");
            }else {
                break;
            }
        }

        switch(month){
            case 1, 3, 5, 7, 8, 10, 12 :
                System.out.println("31 день.");
                break;
            case 2 :

                if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                    System.out.println("Это високосный год и имеет 29 дней.");
                }else {
                    System.out.println("Это не високосный год и имеет 28 дней.");
                }
                break;
            case 4, 6, 9,11 :
                System.out.println("30 день.");
                break;
            default: break;
        }

        System.out.println("Выберите валюту для конвертирования доллара: \n 'E' → Евро (курс 1 USD = 0.92 EUR)\n" +
                "\n" +
                "'P' → Фунты стерлингов (1 USD = 0.78 GBP)\n" +
                "\n" +
                "'Y' → Японские йены (1 USD = 148.50 JPY)\n" +
                "\n" +
                "'R' → Российские рубли (1 USD = 92.50 RUB)");
        char exchange = sc.next().charAt(0);
        System.out.println("Сколько у вас долларов: ");

        double dollars = sc.nextDouble();
        double result = 0.0;
        if (exchange == 'E' || exchange == 'P' || exchange == 'Y' || exchange == 'R' ) {
            switch(exchange){
                case 'E', 'e' -> result = dollars * 0.92;
                case 'P', 'p' -> result = dollars * 0.78;
                case 'Y', 'y' -> result = dollars * 148.50;
                case 'R', 'r' -> result = dollars * 92.50;
                default -> System.out.println("Ошибка обмена!");
            }
        }

        System.out.printf("Вы получаете %.2f%n", result);
    }
}
