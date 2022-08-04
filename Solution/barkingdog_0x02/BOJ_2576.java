package barkingdog_0x02;

import java.util.Scanner;

// BOJ 2576. [홀수]
public class BOJ_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int sum = 0;
        int min = 100;

        for(int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 1)  {
                sum += arr[i];
                if (min > arr[i]) min = arr[i];
            }
        }

        if (sum == 0) System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
