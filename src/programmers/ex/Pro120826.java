package programmers.ex;

//문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
public class Pro120826 {
    public String solution(String my_string, String letter) {
        char[] string = my_string.toCharArray();
        char str = letter.charAt(0);
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] != str) {
                string[count++] = string[i];
            }
        }
        String answer = new String(string, 0, count);
        return answer;
    }
}
