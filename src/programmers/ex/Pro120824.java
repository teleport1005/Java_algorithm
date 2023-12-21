package programmers.ex;

import java.util.Arrays;

//정수가 담긴 리스트 num_list가 주어질 때,
//num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class Pro120824 {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7};
        System.out.println(Arrays.toString(solution(numbers)));

    }
    public static int[] solution(int[] num_list) {
        int[] evenArr = new int[num_list.length];
        int[] oddArr = new int[num_list.length];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0){
                evenArr[evenIndex] = num_list[i];
                evenIndex++;
            } else {
                oddArr[oddIndex] = num_list[i];
                oddIndex++;
            }
        }

        int[] answer = {evenIndex, oddIndex};
        return answer;
    }
}
