package edu.cnm.deepdive;

  /*

Return true if the array contains, somewhere, three increasing adjacent numbers
like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
   */

public class CodingBatTripleItUp {

  private static int[] one = {1, 4, 5, 6, 2};
  private static int[] two = {1, 2, 3};
  private static int[] three = {1, 2, 4};

  public static void main(String[] args) {
    System.out.println("Given the array [1, 4, 5, 6, 2], the result will be " + tripleUp(one) + ".");
    System.out.println("Given the array [1, 2, 3], the result will be " + tripleUp(two) + ".");
    System.out.println("Given the array [1, 2, 4], the result will be " + tripleUp(three) + ".");
  }

  public static boolean tripleUp(int[] nums) {

    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == nums[i + 1] - 1 && nums [i + 1] == nums[i + 2] - 1) {
        return true;
      }
    }
    return false;
  }


}
