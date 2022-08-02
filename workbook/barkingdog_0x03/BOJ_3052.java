package barkingdog_0x03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// BOJ 3052. [나머지]
public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int count = 1;

        for(int i = 0; i < 10; i++)
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        br.close();

        Arrays.sort(arr);

        for(int i = 0; i < 9; i++) {
            if(arr[i] != arr[i+1])
                count++;
        }

        System.out.println(count);
    }
}
