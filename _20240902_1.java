// 최대공약수와 최소공배수 (https://school.programmers.co.kr/learn/courses/30/lessons/12940?language=java)

package _20240902_1;

class Solution {
    public int[] solution(int n, int m) {

        int big_num = 0;
        int small_num = 0;
        if (n > m) {
            big_num = n;
            small_num = m;
        } else {
            big_num = m;
            small_num = n;
        }

        int[] answer = {0, 0};

        for (int i = small_num; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        if (answer[0] == 0) {
            answer[0] = 1;
            answer[1] = n * m;
        } else {
            if (big_num % small_num == 0)
                answer[1] = big_num;
            else {
                for (int i = 2; i < small_num + 1; i++) {
                    if ((big_num * i) % small_num == 0) {
                        answer[1] = big_num * i;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}

public class _20240902_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] return1 = s.solution(3, 12);
        int[] return2 = s.solution(2, 5);
        System.out.println(return1[0] + " " + return1[1]);
        System.out.println(return2[0] + " " + return2[1]);

    }
}
