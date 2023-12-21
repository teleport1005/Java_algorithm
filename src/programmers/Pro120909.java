package programmers;

//문제 설명
//어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
//정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

public class Pro120909 {
    public static void main(String[] args) {
        System.out.println(solution(976));
    }
    public static int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);
        if (sqrt - Math.floor(sqrt) == 0) {
            return answer += 1;
        } else {
            return answer += 2;
        }
    }
}
