package barkingdog_0x02.star;

import java.io.*;

// BOJ 2443. [별 찍기 - 6]
public class BOJ_2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 0; i < N; i++) {
            // 공백 for 문 0 - 1 - 2 - 3 - 4
            for(int j = 0; j < i; j++)
                bw.write(" ");
            // 별 for 문 9 - 7 - 5 - 3 - 1
            for(int k = 2 * i + 1; k <= 2 * N - 1; k++)
                bw.write('*');
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
