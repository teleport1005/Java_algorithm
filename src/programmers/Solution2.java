package programmers;

public class Solution2 {
    public int solution(int n, String control) {
        switch (control){
            case "w" -> n += 1;
            case "s" -> n -= 1;
            case "d" -> n += 10;
            case "a" -> n -= 10;
        }
        int answer = 0;
        return answer;
    }
}