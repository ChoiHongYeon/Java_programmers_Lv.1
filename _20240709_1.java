// 크레인 인형뽑기 게임 (https://school.programmers.co.kr/learn/courses/30/lessons/64061?language=java)
package _20240709_1;
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {

        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        for (int i = 0; i < moves.length; i++) {
            int doll = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] > 0) {
                    doll = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
            if (doll > 0) {
                basket.push(doll);
                while (basket.size() >= 2 && basket.peek() == basket.get(basket.size() - 2)) {
                    basket.pop();
                    basket.pop();
                    answer += 2;
                }
            }
        }

        return answer;

    }
}

public class _20240709_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int result = s.solution(board, moves);
        System.out.println(result);

    }
}
