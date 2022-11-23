import java.util.Arrays;

/*
 * 
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. 
If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 */

public class Q496 {
    public int [] nextGreaterElement(int [] num1, int [] num2){
        int n = num1.length;
        int [] ans = new int [n];
        for (int i = 0; i < n; i++){
            if(!searchNumbers(num1[i], num2)){
                ans[i] = num1[i];
            }
            if(searchNumbers(num1[i], num2)){
                int j = 0;
                
            }
        }

        return new int[] {0, 0, 0};
    }

    public boolean searchNumbers(int target, int [] numbers){
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (target == numbers[mid]){
                return true;
            }
            if (target < numbers[mid]){
                left = mid + 1;
            }
            if (target > numbers[mid]){
                right = mid - 1;
            }
        }
        return false;
    }
}
