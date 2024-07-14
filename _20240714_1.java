// 체육복 (https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=java)
package _20240714_1;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int p[] = new int[n];
        Arrays.fill(p, 1);
        for (int i = 0; i < lost.length; i++) {
            p[lost[i] - 1]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            p[reserve[i] - 1]++;
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i] == 2 && i > 0 && p[i - 1] == 0) {
                p[i]--;
                p[i - 1]++;
            }
            if (p[i] == 2 && i < p.length - 1 && p[i + 1] == 0) {
                p[i]--;
                p[i + 1]++;
            }
        }

        int answer = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] > 0)
                answer++;
        }

        return answer;

    }
}

public class _20240714_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int return1 = s.solution(5, new int[] {2, 4}, new int[] {1, 3, 5});
        int return2 = s.solution(5, new int[] {2, 4}, new int[] {3});
        int return3 = s.solution(3, new int[] {3}, new int[] {1});
        System.out.println(return1 + " " + return2 + " " + return3);

    }
}