package Jungol.array;

import java.util.Scanner;

public class JUNGOL157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
                break;
            if (arr[i] % 5 == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double) sum / count);
        sc.close();
    }

}
