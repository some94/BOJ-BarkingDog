package barkingdog_0x00;

/*
BarkingDog Youtube 0x00 문제 2
주어진 길이 N의 int 배열 arr 에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1을,
존재하지 않으면 0을 반환하는 함수 func2(int arr[], int N)을 작성하라.
arr 의 각 수는 0 이상 100 이하이고 N은 1000 이하이다.
 */

public class Solve2 {

    public int func2(int[] arr, int N) {
        for(int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == 100)
                    return 1;
            }
        }
        return 0;
    }



    public static void main(String[] args) {
        Solve2 solve2 = new Solve2();

        System.out.println(solve2.func2(new int[]{1, 52, 48},3));
        System.out.println(solve2.func2(new int[]{50,42},2));
        System.out.println(solve2.func2(new int[]{4,13,63,87},4));

    }
}
