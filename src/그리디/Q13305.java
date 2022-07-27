package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제 :
1km당 1리터 기름 사용
각 도시에 하나의 주유소 있음.
도시마다 리터당 가격 다름.(가격 단위 : 원)
각 도시 주유소 기름가격과, 도로 길이 입력받아 최소 비용 계산

입력 :
(내가 만든 예젠데 꼭 해보기) - 모든 조건 다 들어가있음.
8
1 2 1 2 1 2 1
3 2 5 3 4 6 1 2

 */
public class Q13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int city = Integer.parseInt(br.readLine());

        Long[] distance = new Long[city - 1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < city - 1; i++) {
            distance[i] = Long.parseLong(st1.nextToken());
        }

        Long[] oilCost = new Long[city];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < city; i++) {
            oilCost[i] = Long.parseLong(st2.nextToken());
        }

        Long cost = 0L; // 비용
        for (int i = 0; i < city - 1; i++) {
            if(i<city-2) {
                if (oilCost[i]>oilCost[i+1]) {
                    cost += distance[i] * oilCost[i];
                }else {
                    cost += distance[i] * oilCost[i];
                    oilCost[i+1] = oilCost[i];
                }
            }else {
                if(oilCost[i-1] > oilCost[i]) {
                    cost += distance[i] * oilCost[i];
                }else {
                    cost += distance[i] * oilCost[i - 1];
                }
            }
        }
        System.out.println(cost);
    }
}