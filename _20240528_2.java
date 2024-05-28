// 숫자 문자열과 영단어 (https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java)
package _20240528_2;

class Solution {
    public int solution(String s) {

        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");

        int answer = Integer.parseInt(s);

        return answer;
    }
}

public class _20240528_2 {
    public static void main(String[] args) {

        Solution s = new Solution();
        String s1 = "one4seveneight";
        String s2 = "23four5six7";
        String s3 = "2three45sixseven";
        String s4 = "123";
        int result1 = s.solution(s1);
        int result2 = s.solution(s2);
        int result3 = s.solution(s3);
        int result4 = s.solution(s4);
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
    }
}
