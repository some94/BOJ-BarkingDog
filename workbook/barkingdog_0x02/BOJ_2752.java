package barkingdog_0x02;

import java.util.Arrays;
import java.util.Scanner;

// BOJ 2752. [세수정렬]
public class BOJ_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }

    }
}
