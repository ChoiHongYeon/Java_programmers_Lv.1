// 두 개 뽑아서 더하기 (https://school.programmers.co.kr/learn/courses/30/lessons/68644?language=java)
package _20240605_1;
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

        int max_length = numbers.length * (numbers.length - 1) / 2;
        int nums[] = new int[max_length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                Arrays.sort(nums);
                if (Arrays.binarySearch(nums, numbers[i] + numbers[j]) < 0)
                    nums[0] = numbers[i] + numbers[j];
            }
        }

        Arrays.sort(nums);
        int nums_index = 0;
        for (int i = 0; i < max_length; i++) {
            if (nums[i] > 0) {
                nums_index = i;
                break;
            }
        }

        Arrays.sort(numbers);
        int zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                zero = i;
                break;
            }
        }

        if (zero >= 2)
            nums_index--;

        int[] answer = Arrays.copyOfRange(nums, nums_index, max_length);

        return answer;

    }
}

public class _20240605_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] result1 = s.solution(new int[] {2, 1, 3, 4, 1});
        int[] result2 = s.solution(new int[] {5, 0, 2, 7});

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

    }
}
