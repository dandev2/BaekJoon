package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = Integer.MAX_VALUE;
        String[] number = br.readLine().split("-");

        for (int i = 0; i < number.length; i++) {
            int temp = 0;
            String[] subNum = number[i].split("\\+");

            for (int j = 0; j < subNum.length; j++) {
                for (int k = 0; k < subNum.length; k++) {
                    System.out.println("subNum = " + subNum[k]);
                }
                temp += Integer.parseInt(subNum[j]);
            }

            if (ans == Integer.MAX_VALUE) {
                ans = temp;
            } else {
                ans -= temp;
            }
        }
        System.out.println(ans);

    }
}