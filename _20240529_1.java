// 로또의 최고 순위와 최저 순위 (https://school.programmers.co.kr/learn/courses/30/lessons/77484?language=java)
package _20240529_1;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int same_nums = 0;
        int zero = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j])
                    same_nums++;
            }
            if (lottos[i] == 0)
                zero++;
        }

        int[] answer = new int[2];

        if (same_nums + zero >= 2)
            answer[0] = 7 - same_nums - zero;
        else
            answer[0] = 6;

        if (same_nums >= 2)
            answer[1] = 7 - same_nums;
        else
            answer[1] = 6;

        return answer;
    }
}

public class _20240529_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        int[] result1 = s.solution(lottos1, win_nums1);
        int[] result2 = s.solution(lottos2, win_nums2);
        int[] result3 = s.solution(lottos3, win_nums3);

        System.out.println(result1[0] + " " + result1[1]);
        System.out.println(result2[0] + " " + result2[1]);
        System.out.println(result3[0] + " " + result3[1]);

    }
}
