package programmers.ex;

public class Pro181899 {

    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        int size = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                size++;
                }
            }
        System.out.println(size);
        }

    }
