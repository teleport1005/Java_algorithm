package programmers.ex;

//머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
// 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
// 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class Pro120819 {
    public static void main(String[] args) {

    }
    public static int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 0;
        int leftMoney = 0;
        if (money % 5500 == 0){
            coffee = money / 5500;
        } else {
            coffee = (int) (double) money / 5500;
        }
        leftMoney = money % 5500;
        answer[0] = coffee;
        answer[1] = leftMoney;
        return answer;
    }
}
