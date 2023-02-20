public class 삼총사 {
  public static void main(String[] args) {
    Solution2 sol = new Solution2();
    int[] threeMan = {-2, 3, 0, 2, -5};
    System.out.println(sol.solution(threeMan));
  }
}

class Solution2 {
  public int solution(int[] number) {
    int answer = 0;

    for (int i = 0; i < number.length; i++) {
      for (int j = i + 1; j < number.length; j++) {
        for (int j2 = j + 1; j2 < number.length; j2++) {
          if((number[i]) + number[j] + number[j2] == 0) {
            answer += 1;
          }
        }
      }
    }
    return answer;
  }
}