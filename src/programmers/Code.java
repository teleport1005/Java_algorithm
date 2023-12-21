package programmers;

public class Code {
    public String solution(String code) {
        StringBuilder answerBuilder = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++){
            char letter = code.charAt(i);
            if (letter == '1'){
                if (mode == 0) mode = 1;
                else mode = 0;
            }
            else {
                if (mode == 1 && i % 2 == 1)
                    answerBuilder.append(letter);
                if (mode == 0 && i % 2 == 0)
                    answerBuilder.append(letter);
            }
        }

        // 결과
        String answer = answerBuilder.toString();
        return answer.isEmpty() ? "EMPTY" : answer;
    }

    public static void main(String[] args) {

    }
}
