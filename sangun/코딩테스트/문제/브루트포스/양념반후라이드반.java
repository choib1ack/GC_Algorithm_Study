package 브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class 양념반후라이드반 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        long ans = 0;
        if(A + B >= 2 * C){
            if(X >= Y){
                ans += 2 * C * Y + A * (X - Y);
            } else {
                ans += 2 * C * X + B * (Y - X);
            }
        } else {
            ans += A * X + B * Y;
        }
        long temp = 0;
        if(X >= Y) {
            temp += 2 * C * X;
        } else {
            temp += 2 * C * Y;
        }
        ans = Math.min(ans, temp);
        bw.write(ans + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

}
