package PrimitiveTypse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrays {
    // одномерный массив
    int [] arraysInt = new int[10];
    int [] arraysInt2 = new int[]{1,2,3,4,5,6,7,8,9,10};

    // двумерный массив
    char [][] arraysChar = new char[10][3];
    char [][] arraysChar2 = new char[][]{{'a'},{'b'},{'c'},{'d'}};



    public static void main(String[] args) {


       /* // Task 1 сумма и среднее значение массива
        int[] nums = {5, 12, 8, 23, 7, 15, 3};
        int summ = 0;
        double average = 0;
        for (int i = 0; i < nums.length; i++) {
            summ += nums[i];
        }
        average = (double) summ / nums.length;
        System.out.println(" Summa is: " + summ);
        System.out.printf("The average is: %.2f%n", average);


        // Task 2 колличество чёт и нечёт чисел + сумма чёт

        int [] arrays = {4, 9, 12, 7, 5, 8, 3, 10};
        int evenCount = 0;
        int oddCount = 0;
        summ = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                evenCount++;
                summ += arrays[i];
            }else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount +
                " Odd count: " + oddCount + " Summ: " + summ);


        // Task 3 минимальное и максимальное число с индексом

        arrays = new int[]{45, 12, 89, 3, 67, 21, 54, 9, 76};
        int min = arrays[0];
        int indexMin = 0;
        int indexMax = 0;
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < min) {
                min = arrays[i];
                indexMin = i;
            }else if (arrays[i] > max) {
                max = arrays[i];
                indexMax = i;
            }
        }
        System.out.println("Min: " + min + " index: " + indexMin +
                ". Max: " + max + " index: " + indexMax);


        // Task 4 подчёт вхождений
        arrays = new int[]{2, 5, 3, 2, 8, 2, 9, 2, 4};
        int numsCount = 2;
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == numsCount) {
                count++;
            }
        }
        System.out.println("Number of elements: " + count);*/


        // Task 5 удаление дублей
        int [] arrays = new int[]{1, 2, 2, 3, 4, 4, 4, 5};
        int count = 0;
        int index = 0;

        for (int i = 0; i < arrays.length; i++) {
            boolean isDubl = false;
            for (int j = 0; j < i; j++) {
                if (arrays[i] == arrays[j]) {
                    isDubl = true;
                    break;
                }
            }
            if (!isDubl) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arrays));

        int [] arraysInt2 = new int[count];

        for (int i = 0; i < arrays.length; i++) {
            boolean isDubl = false;
            for (int j = 0; j < i; j++) {
                if (arrays[i] == arrays[j]) {
                    isDubl = true;
                    break;
                }
            }
            if (!isDubl) {
                arraysInt2[index] = arrays[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arraysInt2));


        // Task 6 слияние массивов по очереди
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        index = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if(i < arr1.length){
                arr3[i] = arr1[i];
            }else {
                arr3[i] = arr2[index];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr3));


        // Task 8 сумма диагонали
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int summ = (matrix[0][0] + matrix[1][1] + matrix[2][2]);
        int summ2 = (matrix[2][0] + matrix[1][1] + matrix[0][2]);
        System.out.println("Первая диагональ: " + summ + ", вторая диагональ: " + summ2);


        // Task 9 в строку
        int [][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String oneStr = matrix2[0][0] + " " + matrix2[0][1] + " " + matrix2[0][2];
        String twoStr = matrix2[1][0] + " " + matrix2[1][1] + " " + matrix2[1][2];
        String threeStr = matrix2[2][0] + " " + matrix2[2][1] + " " + matrix2[2][2];
        System.out.println(oneStr + "\n" + twoStr + "\n" + threeStr);


        // Task 10
        int[] arrReverce = {1, 2, 3, 4, 5, 6, 7};
        int[] arrReverce2 = new int [arrReverce.length];
        index = 0;
        for (int i = arrReverce.length - 1; i >= 0 ; i--) {
            arrReverce2[index] = arrReverce[i];
            index++;
        }
        System.out.println(Arrays.toString(arrReverce));
        System.out.println(Arrays.toString(arrReverce2));




    }

}
