package barkingdog_0x02.star;

import java.io.*;

// BOJ 2446. [별 찍기 - 9]
public class BOJ_2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++)
                bw.write(" ");
            for(int k = 2 * i + 1; k <= 2 * N - 1; k++)
                bw.write('*');
            bw.newLine();
        }
        for(int i = 1; i <= N - 1; i++) {
            for(int j = 0; j < N - i - 1; j++)
                bw.write(" ");
            for(int k = 0; k < 2 * i + 1; k++) {
                bw.write('*');
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
