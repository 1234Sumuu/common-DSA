public class missingNumberFinder {
  public static int findMissingNumber(int[] nums){
    int n = nums.length + 1;
    int totalSum = (n * (n+1)) /2;
    
    int arraySum = 0;
    for(int num : nums){
      arraySum += n;
    }
    return totalSum - arraySum;
  }
  public static void main (String[] args){
    int[] nums = {1, 2, 3, 5, 6};
    int misingNumber = findMissingNumber(nums);
    
    System.out.println("Misiing number is: " + missingNumber);
  }
}
