class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> ele=new HashSet<>();
        long curr=0,max=0;
        int begin=0;
        for(int end=0;end<n;end++)
        {
            if(!ele.contains(nums[end])){
                curr+=nums[end];
                ele.add(nums[end]);
                if(end-begin+1==k){
                    max=Math.max(max,curr);
                    curr-=nums[begin];
                    ele.remove(nums[begin]);
                    begin++;
                }
            }
            else{
                while(nums[begin]!=nums[end]){
                    curr-=nums[begin];
                    ele.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }
        return max;

        }
    }
