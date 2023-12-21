package programmers;

public class Solution {
    public String solution(String str1, String str2) {
//        String answer = "";
//        // 문자열을 구성하는 char의 배열을 반환하는 메서드
//        char[] char1 = str1.toCharArray();
//        char[] char2 = str2.toCharArray();
//        // 1. str1의 길이만큼 반복한다
//        for (int i = 0; i < str1.length(); i++) {
//            answer += char1[i];  // 2. str1의 i번째 글자를 answer에 붙인다.
//            answer += char2[i];  // 3. str2의 i번째 글자를 answer에 붙인다.
//        }

        StringBuilder lineBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            // 정답 문자열에 붙이고 싶은 메서드를 append 메서드로 전달
            lineBuilder.append(str1.charAt(i));
            lineBuilder.append(str2.charAt(i));
        }
        String answer = lineBuilder.toString();


        return answer; // 4. 답을 반환한다



//        for (int i = 0; i < str1.length(); i++){
//            answer += str1.charAt(i);
//            answer += str2.charAt(i);
//        }
//        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("aaaaa", "bbbbb"));
    }
}
