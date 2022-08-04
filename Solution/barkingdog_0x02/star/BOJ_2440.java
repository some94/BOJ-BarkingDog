package barkingdog_0x02.star;

import java.io.*;

// BOJ 2440. [별 찍기 - 3]
public class BOJ_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= N; i++) {
            for(int j = N + 1 - i; j >= 1; j--)
                bw.write('*');
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
