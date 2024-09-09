// 소수 찾기 (https://school.programmers.co.kr/learn/courses/30/lessons/12921?language=java)

package _20240909_1;

class Solution {
    public int solution(int n) {

        int[] numbers = new int[n + 1];
        int answer = 0;

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                answer++;
                if (i * 2 <= n) {
                    for (int j = i * 2; j < numbers.length; j += i) {
                        numbers[j]++;
                    }
                }
            }
        }

        return answer;

    }
}

public class _20240909_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(5));

    }
}