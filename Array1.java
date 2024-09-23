public class Array1 {
    public static void main(String[] args) {
        //firstLast6
        System.out.println(firstLast6(new int[]{1, 2, 6}));

        //sameFirstLast
        System.out.println(sameFirstLast(new int[]{1, 2, 6}));

        //makePi
        System.out.println(makePi());
    }

    

    //firstLast6
    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }


    //sameFirstLast
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

    //makePi
    public static int[] makePi (){
        return new int[] {3,1,4};
    }
}



