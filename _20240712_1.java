// K번째수 (https://school.programmers.co.kr/learn/courses/30/lessons/42748)
package _20240712_1;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] cut = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(cut);
            answer[i] = cut[commands[i][2] - 1];
        }

        return answer;
    }
}

public class _20240712_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] r = s.solution(array, commands);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i] + " ");
        }

    }
}
