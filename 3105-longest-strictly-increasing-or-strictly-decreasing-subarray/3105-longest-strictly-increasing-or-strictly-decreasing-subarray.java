class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int inc=1;
        int l=1;
        int dec=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]) {
                inc++;
                dec=1;
            }
            else if(nums[i]<nums[i-1]){ dec++;
            inc=1;
            }
            else {dec=1;inc=1;}
            l=Math.max(l,Math.max(inc,dec));
        }
        return l;
    }
}