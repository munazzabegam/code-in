public class Array1 {
    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{1, 2, 6}));
        System.out.println(sameFirstLast(new int[]{1, 2, 6}));
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean sameFirstLast (int[] nums){
        if (nums.length >=1){
            if(nums[0]== nums[nums.length-1]){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}



