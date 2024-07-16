// 정수 내림차순으로 배치하기 (https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java)
package _20240716_1;
import java.util.*;

class Solution {
    public long solution(long n) {

        String n_string = Long.toString(n);
        char[] n_array = n_string.toCharArray();
        Arrays.sort(n_array);
        String n_reverse = "";
        for (int i = n_array.length - 1; i > -1; i--) {
            n_reverse += n_array[i];
        }

        return Long.parseLong(n_reverse);

    }
}

public class _20240716_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        long r = s.solution(118372);
        System.out.println(r);

    }
}