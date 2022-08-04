package barkingdog_0x02;

import java.io.*;
import java.util.StringTokenizer;

// BOJ 10804. [카드 역배치]
public class BOJ_10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[21];
        for(int i = 1; i <= 20; i++)
            arr[i] = i;

        for(int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j = 0; j <= (b - a) / 2; j++) {
                int tmp = arr[a + j];
                arr[a + j] = arr[b - j];
                arr[b - j] = tmp;
            }
        }

        for(int i = 1; i <= 20; i++)
            bw.write(arr[i] + " ");

        bw.flush();
        br.close();
        bw.close();
    }
}
