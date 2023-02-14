package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 개인정보수집유효기간 {
  public static void main(String[] args) {
    Solution3 sol3 = new Solution3();
    String today = "2022.05.19";
    String[] terms = { "A 6", "B 12", "C 3" };
    String[] privacies = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
    System.out.println(sol3.solution(today, terms, privacies));
  }
}

class Solution3 {
  public List<Integer> solution(String today, String[] terms, String[] privacies) {
    List<Integer> answer = new ArrayList<Integer>();
    String[] t = today.split("\\.");
    System.out.println(Arrays.toString(t)); // split을 사용하여 나눔

    int years = Integer.parseInt(t[0]);
    int months = Integer.parseInt(t[1]);
    int days = Integer.parseInt(t[2]);

    int totalDay = (years * 12 * 28) + (months * 28) + days;
    System.out.println(totalDay); //

    // trems 공백 나눔
    ArrayList<String[]> tmplist = new ArrayList<String[]>();
    for (int i = 0; i < terms.length; i++) {
      String[] tmp = terms[i].split("\\s");
      tmp[1] = Integer.toString(Integer.parseInt(tmp[1]) * 28);
      tmplist.add(tmp);
    }
    for (String[] element : tmplist) {
      System.out.println(Arrays.toString(element)); //
    }
    System.out.println((tmplist.get(0)[0]));

    ArrayList<String[]> plist = new ArrayList<String[]>();

    for (int i = 0; i < privacies.length; i++) {
      String[] mixArray = new String[2];
      int pyears = Integer.parseInt(privacies[i].substring(0, 4));
      int pmonths = Integer.parseInt(privacies[i].substring(5, 7));
      int pdays = Integer.parseInt(privacies[i].substring(8, 10));
      String level = privacies[i].substring(11, 12);

      int ptotalDay = (pyears * 12 * 28) + (pmonths * 28) + pdays;
      mixArray[0] = Integer.toString(ptotalDay);
      mixArray[1] = level;

      plist.add(mixArray);

    }
    for (String[] element : plist) {
      System.out.println(Arrays.toString(element)); //
    }

    System.out.println(plist.get(0)[1].equals(tmplist.get(0)[0]));
    System.out.println(plist.get(0)[1].equals("A"));

    for (int j = 0; j < plist.size(); j++) {
      for (int k = 0; k < tmplist.size(); k++) {
        if (plist.get(j)[1].equals(tmplist.get(k)[0])) {
          int pnum = Integer.parseInt(plist.get(j)[0]);
          int tnum = Integer.parseInt(tmplist.get(k)[1]);
          int ptDays = pnum + tnum;
          if (totalDay >= ptDays) {
            answer.add(j + 1);
          } 
        }
      }
    }
    return answer;
  }
}