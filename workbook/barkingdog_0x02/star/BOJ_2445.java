package barkingdog_0x02.star;

import java.io.*;

// BOJ 2445. [별 찍기 - 8]
public class BOJ_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= N; i++) {
            for(int k = 0; k < i; k++)
                bw.write('*');
            for(int j = 0; j < 2 * (N - i); j++)
                bw.write(" ");
            for(int k = 0; k < i; k++)
                bw.write('*');
            bw.newLine();
        }

        for(int i = 0; i < N - 1; i++) {
            for(int k = 1; k < N - i; k++)
                bw.write('*');
            for(int j = 0; j < 2 * i + 2; j++)
                bw.write(" ");
            for(int k = 1; k < N - i; k++)
                bw.write('*');
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
