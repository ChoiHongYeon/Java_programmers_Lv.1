// [PCCE 기출문제] 9번 / 지폐 접기 (https://school.programmers.co.kr/learn/courses/30/lessons/340199?language=java)

package _20240910_1;

class Solution {
    public int solution(int[] wallet, int[] bill) {

        int max_wallet = Math.max(wallet[0], wallet[1]);
        int min_wallet = Math.min(wallet[0], wallet[1]);

        if (max_wallet >= Math.max(bill[0], bill[1]) && min_wallet >= Math.min(bill[0], bill[1]))
            return 0;

        int answer = 0;
        while(true) {
            answer++;
            if (bill[0] > bill[1])
                bill[0] = bill[0] / 2;
            else
                bill[1] = bill[1] / 2;
            if (max_wallet >= Math.max(bill[0], bill[1]) && min_wallet >= Math.min(bill[0], bill[1]))
                break;
        }

        return answer;

    }
}

public class _20240910_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(new int[] {30, 15}, new int[] {26, 17}));
        System.out.println(s.solution(new int[] {50, 50}, new int[] {100, 241}));

    }
}
