package barkingdog_0x02.star;

import java.io.*;

// BOJ 2441. [별 찍기 - 4]
public class BOJ_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < i - 1; j++)
                bw.write(" ");
            for(int k = N + 1 - i; k >= 1; k--)
                bw.write('*');
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
