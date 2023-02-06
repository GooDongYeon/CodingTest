// 각도기 문제

public class CT02 {
  public static void main(String[] args) {
    Solution2 sol = new Solution2();
    System.out.println(sol.solution(90));
  }
}

class Solution2 {
  public int solution(int angle) {
    int answer = 0;
    if (angle == 180) {
      answer = 4;
    } else if (0 < angle && angle < 90) {
      answer = 1;
    } else if (angle == 90) {
      answer = 2;
    } else {
      answer = 3;
    }
    return answer;
  }
}