package barkingdog_0x00;

import java.util.Scanner;

/*
 BarkingDog Youtube 0x00 문제 4
 N 이하의 수 중에서 가장 큰 2의 거듭제곱수를 반환하는 함수 func4(int N)을 작성하라.
 N은 10억 이하의 자연수이다.
 */
public class Solve4 {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    public int func4() {
        int val = 1;
        while (2 * val <= N)
            val *= 2;
        return val;
    }
    public static void main(String[] args) {
        Solve4 solve4 = new Solve4();

        System.out.println(solve4.func4());
    }
}
