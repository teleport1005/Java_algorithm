package boj;
//첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
//동혁이가 발견한 흰색 피스의 개수가 주어졌을 때,
//몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int[] chessBasic = {1, 1, 2, 2, 2, 8};

        String input = reader.readLine();
        String[] splitString = input.split(" ");
        for (int i = 0; i < 6; i++){
            int chess = Integer.parseInt(splitString[i]);
            int diff = chessBasic[i] - chess;
            System.out.print(diff + " ");
        }

    }

}
