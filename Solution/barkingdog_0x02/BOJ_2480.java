package barkingdog_0x02;

import java.util.Scanner;

// BOJ 2480. [주사위 세개]
public class BOJ_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == c && b == c) {
            System.out.print(10000 + a * 1000);
        }
        else if(a == b || a == c) {
            System.out.print(1000 + a * 100);
        }
        else if(b == c) {
            System.out.print(1000 + b * 100);
        }
        else {
            System.out.print((Math.max(a, Math.max(b,c)) * 100));
        }
    }
}
