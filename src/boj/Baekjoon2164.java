package boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            int front = queue.poll();
            queue.offer(front);

        }

        System.out.println(queue.poll());






    }

}
