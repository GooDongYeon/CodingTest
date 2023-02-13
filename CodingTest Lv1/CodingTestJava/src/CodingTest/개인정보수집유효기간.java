package CodingTest;

import java.util.Arrays;

public class 개인정보수집유효기간 {
  public static void main(String[] args) {
    Solution3 sol3 =  new Solution3();
    String today = "2022.05.19";
    String[] trems = {"A 6", "B 12", "C 3"};
    String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
    System.out.println(Arrays.toString(sol3.solution(today, trems, privacies)));
  }
}

class Solution3 {
  public int[] solution(String today, String[] terms, String[] privacies) {
      int[] answer = {};
      String[] t = today.split("\\.");
      System.out.println(Arrays.toString(t)); // split을 사용하여 나눔

      int years = Integer.parseInt(t[0]);
      int months = Integer.parseInt(t[1]);
      int days = Integer.parseInt(t[2]);

      int totalDay = (years * 12 * 28) + (months * 28) + days;
      System.out.println(totalDay);

      String[] priv = {};
      String[] privlist = {};
      for (int i = 0; i < privacies.length; i++) {
        priv = privacies[i].split("\\s");
        privlist = priv[i].split("\\.");
        int privYears = Integer.parseInt(privlist[0]);
        int privMonths = Integer.parseInt(privlist[1]);
        int privDays = Integer.parseInt(privlist[2]);

        priv[0] = Integer.toString((privYears * 12 * 28) + (privMonths* 28) + privDays);
      }


      return answer;
  }
}