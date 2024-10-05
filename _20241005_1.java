// 같은 숫자는 싫어 (https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java)
package _20241005_1;
import java.util.*;

class Solution {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                stack.push(arr[i]);
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;

    }
}

public class _20241005_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] answer1 = s.solution(new int[] {1, 1, 3, 3, 0, 1, 1});
        int[] answer2 = s.solution(new int[] {4, 4, 4, 3, 3});
        for (int i = 0; i < answer1.length; i++) {
            System.out.print(answer1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < answer2.length; i++) {
            System.out.print(answer2[i] + " ");
        }

    }
}
