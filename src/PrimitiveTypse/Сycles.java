package PrimitiveTypse;

public class Сycles {
    public static void main(String[] args) {

        // Task 1 сумма всех чисел в диапозоне
        int num = 100;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Task 2 квадраты чётных чисел в диапозоне

        for (int i = 10; i <= 30; i+=2) {
            System.out.println("Квадрат четного числа " + i + " = " + (i * i));
        }

        // Task 3 факториал числа
        num = 7;
        long result = 1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }
        System.out.println(result);

        // Task 4 сколько знаков в числе
        int number = 9876543;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;

        }
        System.out.println(count);

        // Task 5 сумма всех чисел
        sum = 0;
        for (int i = 1; i <=99 ; i+=2) {
            sum += i;
        }
        System.out.println(sum);

        // Task 6 таблица умножения
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " * 5 = " + (i * 5));
        }

        // Task 7 вывод всех делителей
        number = 36;
        String sumStr = "";
        for (int i = 1; i <= number ; i++) {
            if(36 % i == 0){
                sumStr = sumStr + (i + " ");
            }
        }
        System.out.println(sumStr);

        // Task 8 возвести число в степень
        int base = 3;
        int exp = 6;
        result = 1;
        for (int i = 1; i <= exp ; i++) {
            result = result * base;
        }
        System.out.println(result);


        // Task 9 палиндром число или нет
        number = 12322;
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }

        // Task 10 пирамида чисел
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
