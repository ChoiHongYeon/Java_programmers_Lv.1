// 나머지가 1이 되는 수 찾기 (https://school.programmers.co.kr/learn/courses/30/lessons/87389?language=java)
package _20240515_1;

class Solution {
    public int solution(int n) {

        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

public class _20240515_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int result1 = s.solution(10);
        int result2 = s.solution(12);

        System.out.println(result1 + " " + result2);

    }
}
