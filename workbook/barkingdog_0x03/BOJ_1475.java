package barkingdog_0x03;

import java.io.*;
import java.util.Arrays;

// BOJ 1475. [방 번호]
public class BOJ_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        N = N.replace('9', '6');
        int[] arr = new int[10];
        br.close();

        for(int i = 0; i < N.length(); i++)
            arr[N.charAt(i) - '0']++;

        arr[6] = (arr[6] / 2) + (arr[6] % 2);
        Arrays.sort(arr);

        bw.write(arr[9] + "\n");
        bw.flush();
        bw.close();
    }
}
