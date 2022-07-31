package barkingdog_0x00;

import java.util.Scanner;
/*
 BarkingDog Youtube 0x00 문제 1
 N 이하의 자연수 중에서 3의 배수이거나 5의 배수인 수를 모두 합한 값을 반환하는 함수 func1(int N)을 작성하라.
 N은 10만 이하의 자연수이다.
 */
public class Solve1 {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    long answer = 0;
    public long func1() {
        for (int i = 1; i < N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solve1 solve1 = new Solve1();

        System.out.println(solve1.func1());
    }
}
