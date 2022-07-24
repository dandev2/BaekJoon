package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
        문제 :
        준규가 가진 동전 n종류
        적절히 사용해 합이 K인 동전 만들 때 동전 개수 최솟값 구하기

        입력 :
        n k
        n개의 줄게 동전 가치 오름차순으로 주어짐.

        test 케이스 :
        10 4200
        1
        5
        10
        50
        100
        500
        1000
        5000
        10000
        50000
         */
public class Q11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int money[] = new int[n];
        for(int i=0; i<n; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i=n-1; i>=0; i--) {
            if(k/money[i] > 0) {
                count += k/money[i];
                k = k%money[i];
            }else {
                continue;
            }
         }
        System.out.println(count);
    }
}
