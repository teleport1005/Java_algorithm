package boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        // 고무오리 디버깅 시작
        String line = reader.readLine();

        // 문제 세기
        int count = 0;

        // 종료 조건
        while (true) {
            line = reader.readLine();
            if (line.equals("고무오리 디버깅 끝")) {
                break;
            }
            // 입력이 문제면 count++
            if (line.equals("문제")) {
                count++;
            }
            // 입력이 고무오리면 count--
            else if (line.equals("고무오리") && count != 0) {
                count--;
            }
            // 단 count == 0일 때 입력시 count += 2
            else {
                count += 2;
            }
        }
        if (count == 0) {
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }
        }

    }

