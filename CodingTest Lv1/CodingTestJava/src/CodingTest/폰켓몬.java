
import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
  public static void main(String[] args) {
    Solution4 sol = new Solution4();
    int[] x = {3,1,2,3};
    System.out.println(sol.solution(x));
  }
}

class Solution4 {
  public int solution(int[] nums) {
    int answer = 0;
    int pokmon = nums.length/2;
    
    Set<Integer> set = new HashSet<Integer>();

    for (int i : nums) {
      set.add(i);
    }
    
    for (Integer element : set) {
      System.out.println(element);
    }

    if(set.size() <= pokmon) {
      answer =  set.size();
    } else {
      answer =  pokmon;
    }
    return answer;
  }
}