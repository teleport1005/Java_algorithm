package programmers.ex;
//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
public class Pro120908 {
    public int solution(String str1, String str2) {
        boolean containsSubString = str1.contains(str2);
        if (containsSubString) {
            return 1;
        } else {
            return 2;
        }
    }
    }

