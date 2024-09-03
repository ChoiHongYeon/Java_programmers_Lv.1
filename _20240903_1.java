// 약수의 합 (https://school.programmers.co.kr/learn/courses/30/lessons/12928?language=java)

package _20240903_1;

class Solution {
    public int solution(int n) {

        double s = Math.sqrt(n);
        int m = 0;
        if (s % 1.0 == 0)
            m = (int)s;

        int answer = 0;
        for (int i = 1; i <= (int)s; i++) {
            if (n % i == 0)
                answer += i + (n / i);
        }

        return answer - m;

    }
}

public class _20240903_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(12) + " " +s.solution(5));

    }
}
