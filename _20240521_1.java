// [PCCE 기출문제] 9번 / 이웃한 칸(https://school.programmers.co.kr/learn/courses/30/lessons/250125?language=java)

package _20240521_1;

class Solution {
    public int solution(String[][] board, int h, int w) {

        int answer = 0;
        int board_len = board.length;

        if (h - 1 >= 0)
            if (board[h - 1][w].equals(board[h][w]))
                answer++;
        if (h + 1 <= board_len - 1)
            if (board[h + 1][w].equals(board[h][w]))
                answer++;
        if (w - 1 >= 0)
            if (board[h][w - 1].equals(board[h][w]))
                answer++;
        if (w + 1 <= board_len - 1)
            if (board[h][w + 1].equals(board[h][w]))
                answer++;

        return answer;
    }
}

public class _20240521_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        String[][] board1 = {{"blue", "red", "orange", "red"},
                            {"red", "red", "blue", "orange"},
                            {"blue", "orange", "red", "red"},
                            {"orange", "orange", "red", "blue"}};
        String[][] board2 = {{"yellow", "green", "blue"},
                            {"blue", "green", "yellow"},
                            {"yellow", "blue", "blue"}};
        int h1 = 1, w1 = 1;
        int h2 = 0, w2 = 1;
        int result1 = s.solution(board1, h1, w1);
        int result2 = s.solution(board2, h2, w2);

        System.out.println(result1 + " " + result2);
    }
}
