package programmers;

public class Pro181938 {
    public int solution(int a, int b) {
        String leftResultStr = "" + a + b;
        int rightResult = 2 * a * b;
        int leeftResult = Integer.parseInt(leftResultStr);

        return leeftResult > rightResult ? leeftResult : rightResult;

    }
}
