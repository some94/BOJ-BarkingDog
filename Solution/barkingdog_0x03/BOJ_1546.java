package barkingdog_0x03;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// BOJ 1546. [평균]
public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        br.close();
        Arrays.sort(arr);

        double sum = 0;
        for(int i = 0; i < N; i++)
            sum += arr[i];

        System.out.println(sum * 100.0 / arr[N-1] / N);
    }
}
