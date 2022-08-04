package barkingdog_0x03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ 11720. [숫자의 합]
public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String sNum = br.readLine();
        br.close();

        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i < N; i++)
            sum += cNum[i] - '0';

        System.out.println(sum);
    }
}
