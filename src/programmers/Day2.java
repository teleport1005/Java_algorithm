package programmers;

import java.util.Arrays;

public class Day2 {
    public int[] solution(int[] arr, int[] query) {
        int leftBound = 0;
        int rightBound = arr.length;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                rightBound = leftBound + query[i] + 1;
            } else {
                leftBound += query[i];
            }
        }
        return Arrays.copyOfRange(arr, leftBound, rightBound);
    }
}
