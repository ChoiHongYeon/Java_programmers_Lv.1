// 모의고사 (https://school.programmers.co.kr/learn/courses/30/lessons/42840?language=java)
package _20240715_1;

class Solution {
    public int[] solution(int[] answers) {

        int[][] types = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] correct = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (answers[i] == types[j][i % types[j].length])
                    correct[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] > max)
                max = correct[i];
        }

        int people = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == max)
                people++;
        }

        int[] answer = new int[people];
        int n = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == max)
                answer[n++] = i + 1;
        }

        return answer;

    }
}

public class _20240715_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int return1[] = s.solution(new int[] {1, 2, 3, 4, 5});
        int return2[] = s.solution(new int[] {1, 3, 2, 4, 2});
        for (int i = 0; i < return1.length; i++) {
            System.out.print(return1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < return2.length; i++) {
            System.out.print(return2[i] + " ");
        }

    }
}
