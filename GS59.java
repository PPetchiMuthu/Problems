//string2 is a substring of string1 return starting index position else -1

import com.sun.jdi.StringReference;

public class GS59 {
        public static int search(int[] nums, int target) {
            int start =0;
            int end = nums.length-1;

            while(start<end){

                int mid = (end - start)/2;

                if(nums[mid]==target)
                    return mid;

                if(nums[mid]>target)
                    end = mid;
                else
                    start = mid;

            }
            return -1;
        }


    public static void main(String args[]){
        int[] nums = {-1,0,3,5,9,12};
        int target =9;
        System.out.println(search(nums, target));
    }
}