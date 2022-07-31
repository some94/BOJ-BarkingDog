package barkingdog_0x03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ 10808. [알파벳 개수]
public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            arr[(int) str.charAt(i) - 97] += 1;
        }

        for (int j : arr) {
            sb.append(j);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
