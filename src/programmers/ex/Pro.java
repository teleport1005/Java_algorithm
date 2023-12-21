package programmers.ex;
//첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
// 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
// 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class Pro {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = lcm(denom1, denom2);
        // 두 분수의 분모를 통분하여 분자를 새로 계산
        int newNumer1 = numer1 * (lcm / denom1);
        int newNumer2 = numer2 * (lcm / denom2);

        // 두 분수의 분자를 더함
        int sumNumer = newNumer1 + newNumer2;

        // 결과의 분모는 통분한 분모로 설정
        int sumDenom = lcm;

        // 결과 분수를 기약 분수로 만듦
        int gcd = gcd(sumNumer, sumDenom);
        sumNumer /= gcd;
        sumDenom /= gcd;

        return new int[]{sumNumer, sumDenom};
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    // 최소공배수를 구하는 함수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
