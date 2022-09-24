public class Leedcode {
        public static void main(String[] args){
            int[] nums = {-1,0,3,5,9,12};
            int target =9;
            int start =0;
            int end = nums.length-1;

            while(start<end){

                int mid = (end - start)/2;

                if(nums[mid]==target)
                    System.out.println(mid);;

                if(nums[mid]>target)
                    end = mid;
                else
                    start = mid;

            }
            System.out.println("-1");;
        }

    }
