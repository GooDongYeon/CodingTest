// 나이계산

public class CT03 {
  public static void main(String[] args) {
    Solution3 sol = new Solution3();
    System.out.println(sol.solution(40));
    System.out.println(sol.solution(23));
  }
}

class Solution3 {
  public int solution(int age) {
      int answer = 0;
      final int years = 2022;

      if(age<=120) {
        answer = (years - age) + 1;
      }
      return answer;
  }
}