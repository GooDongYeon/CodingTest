package CodingTest;

import java.util.Arrays;

public class 명예의전당 {
  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    // result 1)
    int[] listbox = { 10, 100, 20, 150, 1, 100, 200 };
    System.out.println(Arrays.toString(sol.solution(3, listbox)));

    // result 2)
    // int[] listbox = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
    // System.out.println(Arrays.toString(sol.solution(4, listbox)));

    // runtime error
    // int[] listbox = { 0, 300, 40 };
    // System.out.println(Arrays.toString(sol.solution(10, listbox)));
  }
}

class Solution1 {
  public int[] solution(int k, int[] score) {
    int[] answer = new int[score.length];
    int[] winner = new int[k];

    for (int i = 0; i < k; i++) {
      try {
        winner[i] = score[i];
        Arrays.sort(winner, 0, i+1); // Arrays.sort()메서드의 매개값으로 배열, 시작 index, 끝 index를 넣어주면 일부분만 정렬할 수 있습니다.
        answer[i] = winner[0];
      } catch (Exception e) {
        break;
      }
      System.out.println(Arrays.toString(winner));
    }


    for (int i = k; i < score.length; i++) {
      if (min(winner)[0] < score[i]) {
        winner[min(winner)[1]] = score[i];
        answer[i] = min(winner)[0];
      } else {
        answer[i] = min(winner)[0];
      }
    }
    System.out.println(Arrays.toString(winner));
    System.out.println(Arrays.toString(min(winner)));

    return answer;
  }

  public int[] min(int[] winner) {
    int min = winner[0];
    int idx = 0;
    for (int i = 0; i < winner.length; i++) {
      if (winner[i] < min) {
        min = winner[i];
        idx = i;
      }
    }
    int[] min_idx = { min, idx };
    return min_idx;
  }
}