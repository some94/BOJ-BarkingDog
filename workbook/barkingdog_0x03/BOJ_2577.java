package barkingdog_0x03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ 2577. [숫자의 개수]
public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];
        int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String str = String.valueOf(value);

        for(int i = 0; i < str.length(); i++)
            arr[(str.charAt(i) - 48)]++;

        for(int j : arr) {
            sb.append(j);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
