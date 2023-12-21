package programmers.ex;

//순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
// 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
public class Pro120836 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // i와 n/i가 서로 다른 경우에만 경우의 수를 2개씩 추가
                if (i != n / i) {
                    answer += 2;
                } else {
                    // i와 n/i가 같은 경우에는 경우의 수를 1개 추가
                    answer++;
                }
            }
        }
        return answer;
    }
}
