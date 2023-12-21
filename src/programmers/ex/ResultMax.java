package programmers.ex;

public class ResultMax {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 3};
        int answer = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >  num1){
                num1 = numbers[i];
                num2 = i;
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if (j != num2 && answer < num1 * numbers[j]){
                    answer = num1 * numbers[j];

                System.out.println(answer);
            }


        }
    }
}
