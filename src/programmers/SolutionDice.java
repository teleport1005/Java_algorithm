package programmers;

import java.util.Arrays;

public class SolutionDice {
    public int solution(int a, int b, int c) {
        // 1. 배열로 나열함
        int[] numbers = {a, b, c};
        // 2. 정렬함.. 왜?
        Arrays.sort(numbers);

        if (numbers[0] == numbers[2]){
            return (a + b + c) * (a * a + b * b + c * c) *
                    (a * a * a + b * b * b + c * c * c);
        } else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
            return (a + b + c) * (a * a + b * b + c * c);
        } else {
            return (a + b + c);
        }
    }
}
