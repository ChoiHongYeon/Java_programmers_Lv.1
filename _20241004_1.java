// 나누어 떨어지는 숫자 배열 (https://school.programmers.co.kr/learn/courses/30/lessons/12910?language=java)
package _20241004_1;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                n++;
        }
        if (n == 0)
            return new int[] {-1};

        int[] result = new int[n];
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                result[m++] = arr[i];
        }
        Arrays.sort(result);

        return result;

    }
}

public class _20241004_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] return1 = s.solution(new int[] {5, 9, 7, 10}, 5);
        int[] return2 = s.solution(new int[] {2, 36, 1, 3}, 1);
        int[] return3 = s.solution(new int[] {3, 2, 6}, 10);
        for (int i = 0; i < return1.length; i++) {
            System.out.print(return1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < return2.length; i++) {
            System.out.print(return2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < return3.length; i++) {
            System.out.print(return3[i] + " ");
        }

    }
}
