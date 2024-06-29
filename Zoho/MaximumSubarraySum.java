public class MaximumSubarraySum {

  public static int maxSubArraySum(int[] arr) {
    int max = arr[0];
    int sum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      sum = Math.max(arr[i], sum + arr[i]);
      max = Math.max(max, sum);
    }

    return max;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, -2, 5};
    int[] arr2 = {-1, -2, -3, -4};
    int[] arr3 = {5, 4, 7};

    System.out.println("Maximum contiguous subarray sum for arr1: " + maxSubArraySum(arr1));
    System.out.println("Maximum contiguous subarray sum for arr2: " + maxSubArraySum(arr2));
    System.out.println("Maximum contiguous subarray sum for arr3: " + maxSubArraySum(arr3));
  }
}
