package barkingdog_0x03;

import java.io.*;
import java.util.StringTokenizer;

// BOJ 10807. [개수 세기]
public class BOJ_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int v = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == v)
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
