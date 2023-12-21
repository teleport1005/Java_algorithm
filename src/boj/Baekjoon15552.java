package boj;


//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
// 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // A와 B 입력
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // A와 B의 합을 StringBuilder에 추가
            sb.append(A + B).append("\n");
        }

        br.close();

        // 결과 한꺼번에 출력
        System.out.println(sb.toString());
        }
    }

