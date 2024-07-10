// 실패율 (https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=java)
package _20240710_1;
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {

        int reach[] = new int[N];
        int fail[] = new int[N];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1)
                reach[stages[i] - 2]++;
            else {
                reach[stages[i] - 1]++;
                fail[stages[i] - 1]++;
            }

        }
        for (int i = 0; i < reach.length; i++) {
            for (int j = i + 1; j < reach.length; j++) {
                reach[i] += reach[j];
            }
        }

        double percent[] = new double[N];
        for (int i = 0; i < percent.length; i++) {
            if (reach[i] > 0)
                percent[i] = fail[i] * 1.0 / reach[i] * 1.0;
        }

        int count_smaller[] = new int[N];
        for (int i = 0; i < percent.length; i++) {
            for (int j = 0; j < percent.length; j++) {
                if (percent[i] > percent[j])
                    count_smaller[i]++;
            }
        }

        int answer[] = new int[N];
        int n = 0;
        for (int i = N - 1; i > -1; i--) {
            for (int j = 0; j < count_smaller.length; j++) {
                if (n < N && count_smaller[j] == i)
                    answer[n++] = j + 1;
            }
        }

        return answer;
    }
}

public class _20240710_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int result1[] = s.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
        int result2[] = s.solution(4, new int[] {4, 4, 4, 4, 4});

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

    }
}
