package programmers.ex;

// 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
// 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
public class Pro120849 {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] != 'u') {
                chars[count++] = chars[i];
            }
        }

        String answer = new String(chars, 0, count);
        return answer;
    }



}
