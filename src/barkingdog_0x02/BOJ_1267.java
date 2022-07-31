package barkingdog_0x02;

import java.util.Scanner;

// BOJ 1267. [핸드폰 요금]
public class BOJ_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sec = 0;
        int ySum = 0;
        int mSum = 0;

        for(int i = 0; i < n; i++) {
            sec = sc.nextInt();
            ySum += ((sec / 30) + 1) * 10;
            mSum += ((sec / 60) + 1) * 15;
        }

        if (ySum > mSum)
            System.out.println("M "+ mSum);
        else if (ySum < mSum)
            System.out.println("Y "+ ySum);
        else
            System.out.println("Y M "+ ySum);

    }
}
