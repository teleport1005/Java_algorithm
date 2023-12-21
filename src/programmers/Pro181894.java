package programmers;

import java.util.Arrays;

public class Pro181894 {
    public int[] solution(int[] arr) {
        int front = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                front = i;
                break;
            }
        }
        if (front == -1)
            return new int[]{-1};

        int back = 0;
        for (int i = arr.length - 1; i > -1; i--) {
            if (arr[i] == 2) {
                back = i;
                break;
            }
        }

        int[] answer = new int[back - front + 1];
        answer = Arrays.copyOfRange(arr, front, back + 1)
;        return answer;
    }
}
