// 키패드 누르기 (https://school.programmers.co.kr/learn/courses/30/lessons/67256?language=java)
package _20240702_1;
import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {

        int key_position[][] = {{1, 3}, {0, 0}, {1, 0}, {2, 0}, {0, 1}, {1, 1}, {2, 1}, {0, 2}, {1, 2}, {2, 2}};
        int left_hand[] = {0, 3};
        int right_hand[] = {2, 3};
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1:
                case 4:
                case 7:
                    answer += "L";
                    left_hand = key_position[numbers[i]];
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    right_hand = key_position[numbers[i]];
                    break;
                default:
                    int left = Math.abs(left_hand[0] - key_position[numbers[i]][0]) + Math.abs(left_hand[1] - key_position[numbers[i]][1]);
                    int right = Math.abs(right_hand[0] - key_position[numbers[i]][0]) + Math.abs(right_hand[1] - key_position[numbers[i]][1]);
                    if (left > right) {
                        answer += "R";
                        right_hand = key_position[numbers[i]];
                    } else if (right > left) {
                        answer += "L";
                        left_hand = key_position[numbers[i]];
                    } else {
                        if (hand.equals("left")) {
                            answer += "L";
                            left_hand = key_position[numbers[i]];
                        } else {
                            answer += "R";
                            right_hand = key_position[numbers[i]];
                        }
                    }
            }
        }

        return answer;
    }
}

public class _20240702_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        String result1 = s.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        String result2 = s.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        String result3 = s.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");

        System.out.println(result1 + " " + result2 + " " + result3);

    }
}
