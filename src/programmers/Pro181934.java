package programmers;

public class Pro181934 {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else {
                return n > m ? 1 : 0;
            }
        } else {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else {
                return n < m ? 1 : 0;
            }
        }
    }
}
