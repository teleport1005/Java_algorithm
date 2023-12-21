package programmers;


public class Day1 {
    public int[] solution(String[] strlist) {
        int[] result = new int[strlist.length]; // 결과를 저장할 배열 선언

        for (int i = 0; i < strlist.length; i++) {
            String[] words = strlist[i].split(" "); // 문자열을 공백을 기준으로 나누어 단어 배열로 변환

            int totalWords = words.length; // 각 문자열의 단어 개수를 저장
            int[] wordLengths = new int[totalWords]; // 각 단어의 길이를 저장할 배열 선언

            for (int j = 0; j < totalWords; j++) {
                wordLengths[j] = words[j].length(); // 각 단어의 길이를 배열에 저장
            }

            result[i] = wordLengths[i]; // 각 문자열의 단어 길이 배열을 저장
        }

        return result; // 결과 배열 반환
    }



//    public static void main(String[] args) {
//        String strList = "We are the world!";
//        String[] words = strList.split(" ");
//        for (String word : words) {
//            System.out.print(word.length() + " "); // 각 단어의 길이를 출력합니다.
//        }
//        }


    }


