package barkingdog_0x02.star;

import java.io.*;

// BOJ 2444. [별 찍기 - 7]
public class BOJ_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i - 1; j++)
                bw.write(" ");
            for(int k = 0; k < 2 * i + 1; k++)
                bw.write('*');
            bw.newLine();
        }
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < i + 1; j++)
                bw.write(" ");
            for(int k = 2 * i; k < 2 * N - 3; k++)
                bw.write('*');
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
