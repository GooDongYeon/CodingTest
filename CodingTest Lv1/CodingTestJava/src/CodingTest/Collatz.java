public class Collatz {
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.solution(6));
  }
}

class Solution {
  public int solution(int num) {
      int answer = 0;
      long sol_num = (long)num;
      while(true) {
        if(sol_num == 1)
        answer++;
        return answer;
      }
  }
}
