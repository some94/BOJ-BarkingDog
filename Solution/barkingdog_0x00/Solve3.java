package barkingdog_0x00;

import java.util.Scanner;

/*
BarkingDog Youtube 0x00 문제 3
N이 제곱수이면 1을 반환하고 제곱수가 아니면 0을 반환하는 함수 func3(int N)을 작성하라.
N은 10억 이하의 자연수이다.
 */
public class Solve3 {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    public int func3() {
        for (int i = 1; i * i <= N; i++) {
            if (i * i == N)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solve3 solve3 = new Solve3();

        System.out.println(solve3.func3());

    }
}
