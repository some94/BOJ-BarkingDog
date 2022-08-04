package barkingdog_0x02;

import java.util.Scanner;

// BOJ 10093. [숫자]
public class BOJ_10093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if(a > b) {
            System.out.println(a - b - 1);
            for(long i = b + 1; i < a; i++)
                System.out.print(i + " ");
        }

        else if (b > a) {
            System.out.println(b - a - 1);
            for(long i = a + 1; i < b; i++)
                System.out.print(i + " ");
        }

        else
            System.out.println(0);
    }
}
