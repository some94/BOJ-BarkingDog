package barkingdog_0x02;

import java.util.Arrays;
import java.util.Scanner;

// BOJ 2587. [대표값2]
public class BOJ_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int avg = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            avg += arr[i];
        }
        Arrays.sort(arr);

        System.out.println(avg / 5);
        System.out.println(arr[2]);
    }
}
