package barkingdog_0x02;

import java.util.Arrays;
import java.util.Scanner;

// BOJ 2309. [일곱 난쟁이]
public class BOJ_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        // 먼저 9명의 키를 입력받고 키를 모두 더해줌.
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        // Brute Force 알고리즘
        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(sum - arr[i] - arr[j] == 100) { // 일곱 난쟁이의 키의 합이 100이 되면 아래 for문을 실행시킴
                    for(int k = 0; k < 9; k++) { // 배열 전체 원소에 대해
                        if(i == k || j == k)     // 위에서 제거한 원소값을 제거하고 남은 배열을 출력
                            continue;
                        System.out.println(arr[k]);
                    }
                    System.exit(0); // 정렬한 배열을 한 번만 출력하게 해줌
                }
            }
        }
    }
}

