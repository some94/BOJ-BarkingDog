package barkingdog_0x02;

import java.io.*;
import java.util.StringTokenizer;

// BOJ 15552. [빠른 A+B]
public class BOJ_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

/*
StringBuilder를 이용하여 구현. TestCase 100만개 이하는 이게 더 빠를 듯

public class BOJ_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}
*/