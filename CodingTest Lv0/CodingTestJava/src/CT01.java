// 양꼬치 문제

class CT01 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.solution(10, 3));
    System.out.println(sol.solution(64,6));
  }
}

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        final int GGOZI = 12000; // 변하지 않는 값은 final int로 쓴다.
        final int DRINK = 2000;

        if(n<1000) {
          int service = n/10;
          k = k-service;
          answer = (int)(n*GGOZI + k*DRINK);
        }
        return answer;
    }
}