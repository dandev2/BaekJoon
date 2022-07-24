package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
문제 :
ATM 1대에 돈 인출하는데 걸리는 시간 출력
줄 서 있는 사람 수 N과 각 사람이 돈을 인추하는데 걸리는 시간 Pi주어질 때
각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값 구하는 프로그램

입력 :
n
pi

test 케이스 :
5
3 1 4 3 2
 */
public class Q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            sum += arr[i] * (n-i);
        }
        System.out.println(sum);
    }
}
