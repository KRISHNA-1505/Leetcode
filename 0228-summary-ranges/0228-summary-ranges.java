class Solution {
    public List<String> summaryRanges(int[] nums) {
        List <String> l=new ArrayList();
        if(nums.length==1){
            l.add(nums[0]+"");
    return l;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
                i++;
            }
            if(a!=nums[i])
            {
                l.add(a+"->"+nums[i]);
            }
            else
            l.add(a+"");
        }
        return l;
    }
}