package barkingdog_0x02.star;

import java.io.*;

// BOJ 2438. [별 찍기 - 1]
public class BOJ_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++)
                bw.write('*');
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
