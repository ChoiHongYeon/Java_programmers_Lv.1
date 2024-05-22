// [PCCE 기출문제] 10번 / 데이터 분석 (https://school.programmers.co.kr/learn/courses/30/lessons/250121?language=java)

package _20240522_1;
import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int ext_num, sort_by_num;

        if (ext.equals("code"))
            ext_num = 0 ;
        else if (ext.equals("date"))
            ext_num = 1;
        else if (ext.equals("maximum"))
            ext_num = 2;
        else
            ext_num = 3;

        if (sort_by.equals("code"))
            sort_by_num = 0 ;
        else if (sort_by.equals("date"))
            sort_by_num = 1;
        else if (sort_by.equals("maximum"))
            sort_by_num = 2;
        else
            sort_by_num = 3;

        int answer_len = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][ext_num] >= val_ext) {
                data[i][ext_num] = 0;
            } else {
                answer_len++;
            }
        }

        int sequence[] = new int[answer_len];
        int s = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][ext_num] != 0)
                sequence[s++] = data[i][sort_by_num];
        }
        Arrays.sort(sequence);

        int answer[][] = new int[answer_len][4];
        for (int i = 0; i < answer_len; i++) {
            for (int j = 0; j < data.length; j++) {
                if (sequence[i] == data[j][sort_by_num]) {
                    answer[i][0] = data[j][0];
                    answer[i][1] = data[j][1];
                    answer[i][2] = data[j][2];
                    answer[i][3] = data[j][3];
                    break;
                }
            }
        }

        return answer;

    }
}

public class _20240522_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        int[][] result = s.solution(data, ext, val_ext, sort_by);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
