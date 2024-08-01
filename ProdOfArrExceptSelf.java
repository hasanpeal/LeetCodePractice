public class ProdOfArrExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;
        int leftMult = 1;
        int rightMult = 1;

        for(int i = 1; i < nums.length; i++){
            leftMult *= nums[i-1];
            left[i] = leftMult;
        }

        for(int i = nums.length - 2; i >= 0; i--){
            rightMult *= nums[i+1];
            right[i] = rightMult;
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0) res[i] = right[i];
            else if(i == nums.length - 1) res[i] = left[i];
            else {
                res[i] = left[i] * right[i];
            }
        }
        return res;
    }
}
