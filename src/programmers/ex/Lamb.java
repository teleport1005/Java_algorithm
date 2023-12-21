package programmers.ex;

public class Lamb {
    public static void main(String[] args) {
    int n = 64;
    int k = 6;
    int answer = 0;
    int service = 0;
    if (n >= 10){
        service += ((n / 10) * 2000);
    }
    answer = (n * 12000) + (k * 2000);
        System.out.println(answer-service);
    }
}

