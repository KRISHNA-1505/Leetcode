class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int ind=0;
        for(int i=0;i<=2;i++)
        {
            int c=m.getOrDefault(i,0);
            for(int j=0;j<c;j++)
            {
                nums[ind++]=i;
            }
        }

    }
}