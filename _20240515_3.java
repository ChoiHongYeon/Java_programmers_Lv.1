// 가장 많이 받은 선물 (https://school.programmers.co.kr/learn/courses/30/lessons/258712)
package _20240515_3;

import java.util.Arrays;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        Arrays.sort(friends);
        Arrays.sort(gifts);

        String[][] gifts2 = new String[gifts.length][2];
        for (int i = 0; i < gifts.length; i++) {
            gifts2[i] = gifts[i].split(" ");
        } // gifts 나누기

        int[][] relation = new int[friends.length][friends.length];
        for (int i = 0; i < friends.length; i++) {
            Arrays.fill(relation[i], 0);
        } // 주고받은 선물 표 만들기

        for (int i = 0; i < gifts2.length; i++) {
            relation[Arrays.binarySearch(friends, gifts2[i][0])][Arrays.binarySearch(friends, gifts2[i][1])]++;
        } // 주고받은 선물 표 채우기

        int[] gift_point = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            gift_point[i] = 0;
            for (int j = 0; j < friends.length; j++) {
                gift_point[i] += relation[i][j];
                gift_point[i] -= relation[j][i];
            }
        } // 선물지수 구하기

        int[] gifts3 = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            gifts3[i] = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i != j) {
                    if (relation[i][j] > relation[j][i])
                        gifts3[i]++;
                    else if (relation[i][j] == relation[j][i] && gift_point[i] > gift_point[j])
                        gifts3[i]++;
                }
            }
        } // 받을 선물수 구하기

        int answer = 0;
        for (int i : gifts3) {
            answer = Math.max(answer, i);
        } // 최대값 구하기

        return answer;
    }
}

public class _20240515_3 {
    public static void main(String[] args) {

        Solution s = new Solution();
        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] friends3 = {"a", "b", "c"};
        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};
        int result1 = s.solution(friends1, gifts1);
        int result2 = s.solution(friends2, gifts2);
        int result3 = s.solution(friends3, gifts3);

        System.out.println(result1 + " " + result2 + " " + result3);

    }
}
