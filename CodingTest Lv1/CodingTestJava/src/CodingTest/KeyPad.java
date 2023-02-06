// 키패드

package CodingTest;

public class KeyPad {
  public static void main(String[] args) {
    Left l = new Left();
    l.numbers = 1;
  }
}


class Solution {
  public String solution(int[] numbers, String hand) {
      String answer = "";
      
      return answer;
  }
}

class Left {
  int numbers;
  String Hand;

  void hand() {
    if(numbers == 1 || numbers == 4 || numbers == 7) {
      Hand = "L";
    }
  }
}