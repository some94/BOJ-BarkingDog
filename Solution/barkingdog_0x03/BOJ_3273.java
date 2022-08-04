package barkingdog_0x03;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// BOJ 3273. [두 수의 합] --> 투 포인터 문제. 이중 for 문으로 풀면 시간 초과
public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j > 0; j--) {
                if(x - arr[i] == arr[j])
                    count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}


