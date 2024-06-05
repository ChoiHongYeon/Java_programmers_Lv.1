// 두 개 뽑아서 더하기 (https://school.programmers.co.kr/learn/courses/30/lessons/68644?language=java)
package _20240605_1;
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

        Arrays.sort(numbers);
        int zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                zero = i;
                break;
            }
        }

        int nums[] = new int[numbers[numbers.length - 1] + numbers[numbers.length - 2] + 1];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (Arrays.binarySearch(numbers, i - numbers[j]) >= 0) {
                    if (numbers[j] * 2 != i) {
                        nums[i] = i;
                        break;
                    } else {
                        if (j + 1 < numbers.length) {
                            if (numbers[j] == numbers[j + 1]) {
                                nums[i] = i;
                                break;
                            }
                        }
                    }
                }
            }
        }

        Arrays.sort(nums);
        int nums_index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums_index = i;
                break;
            }
        }

        if (zero >= 2)
            nums_index--;

        int[] answer = Arrays.copyOfRange(nums, nums_index, nums.length);
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
