class Solution {
    public int missingNumber(int[] nums) {
        // int largest = Integer.MIN_VALUE ; 
        // for (int i =0 ; i<nums.length ; i++) {
        //     if(largest <nums[i]) {
        //         largest = nums[i];
        //     }
        // }
        // int sum = largest * (largest+1)/2;
        // int sum_array = 0;
        // for (int i=0 ; i<nums.length ; i++) {
        //    sum_array += nums[i];
        // }
        // int missing = sum - sum_array;
        // return missing;
        int n = nums.length ;
        int sum = n*(n+1)/2;
        int sum_array = 0;
        for (int i=0 ; i<n ; i++) {
            sum_array += nums[i];
        }
        int missing = sum - sum_array ; 
        return missing;
    }
}