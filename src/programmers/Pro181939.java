package programmers;

public class Pro181939 {
    public int solution(int a, int b) {
        int answer = 0;

        String resultA = "" + a + b;
        String resultB = "" + b + a;

        int resultAInt = Integer.parseInt(resultA);
        int resultBInt = Integer.parseInt(resultB);

        return Math.max(resultAInt, resultBInt);

    }

    public static void main(String[] args) {
        new Pro181939().solution(12, 3);
    }
}
