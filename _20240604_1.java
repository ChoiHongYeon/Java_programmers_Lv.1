// 신규 아이디 추천 (https://school.programmers.co.kr/learn/courses/30/lessons/72410)
package _20240604_1;

class Solution {
    public String solution(String new_id) {

        String answer = new_id;

        // 1단계
        answer = answer.toLowerCase();

        // 2단계
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3단계
        while (answer.indexOf("..") != -1) {
            answer = answer.replace("..", ".");
        }

        // 4단계
        if (answer.length() >= 2) {
            if (answer.charAt(answer.length() - 1) == '.')
                answer = answer.substring(0, answer.length() - 1);
        }
        if (answer.length() >= 2) {
            if (answer.charAt(0) == '.')
                answer = answer.substring(1, answer.length());
        } else if (answer.length() == 1) {
            if (answer.equals("."))
                answer = "";
        }

        // 5단계
        if (answer.equals(""))
            answer = "a";

        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(14) == '.')
                answer = answer.substring(0, 14);
        }

        // 7단계
        if (answer.length() == 1)
            answer = answer + answer + answer;
        if (answer.length() == 2)
            answer = answer + answer.charAt(1);

        return answer;
    }
}

public class _20240604_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        String new_id1 = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "=.=";
        String new_id4 = "123_.def";
        String new_id5 = "abcdefghijklmn.p";
        String result1 = s.solution(new_id1);
        String result2 = s.solution(new_id2);
        String result3 = s.solution(new_id3);
        String result4 = s.solution(new_id4);
        String result5 = s.solution(new_id5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
