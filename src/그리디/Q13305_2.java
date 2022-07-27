package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// st-lab님 포스팅보고 따라 작성(공부)
// 출처 : https://st-lab.tistory.com/192
public class Q13305_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] dist = new long[N-1];
        long[] cost = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }


        long sum = 0;
        long minCost = cost[0]; // 이전 까지의 과정 중 주유 최소 비용

        for(int i=0; i<N-1; i++) {
            // 현재 주유소가 이전 주유소 기름값보다 쌀 경우 minCost 갱신
            if(cost[i]<minCost) {
                minCost = cost[i];
            }
            sum += (minCost * dist[i]);
        }
        System.out.println(sum);
    }
}
