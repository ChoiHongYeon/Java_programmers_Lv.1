// 최소직사각형 (https://school.programmers.co.kr/learn/courses/30/lessons/86491)
package _20240515_2;

class Solution {
    public int solution(int[][] sizes) {

        int long_length = 0, short_length = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (Math.max(sizes[i][0], sizes[i][1]) > long_length)
                long_length = Math.max(sizes[i][0], sizes[i][1]);
            if (Math.min(sizes[i][0], sizes[i][1]) > short_length)
                short_length = Math.min(sizes[i][0], sizes[i][1]);
        }
        int answer = long_length * short_length;

        return answer;
    }
}

public class _20240515_2 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int result1 = s.solution(sizes1);
        int result2 = s.solution(sizes2);
        int result3 = s.solution(sizes3);

        System.out.println(result1 + " " + result2 + " " + result3);

    }
}
