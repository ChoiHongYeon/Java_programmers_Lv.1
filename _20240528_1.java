// 없는 숫자 더하기 (https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=java)
package _20240528_1;

class Solution {
    public int solution(int[] numbers) {

        int answer = 45;
        for(int i : numbers)
            answer -= i;
        return answer;

    }
}

public class _20240528_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] numbers1 = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};
        int result1 = s.solution(numbers1);
        int result2 = s.solution(numbers2);
        System.out.println(result1 + " " + result2);

    }
}
