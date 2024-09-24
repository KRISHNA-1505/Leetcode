class Solution {
    
    public int missingNumber(int[] nums) {
        int sum =0;
        
        for(int num:nums){ 
            sum+=num;
        }
        int  totalNum=nums.length*(nums.length+1)/2;
        int misNum=totalNum-sum;
        return misNum; 
    }
}