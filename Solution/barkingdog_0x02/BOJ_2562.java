package barkingdog_0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// BOJ 2562. [최댓값]
public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.println(max + "\n" + index);
    }
}
