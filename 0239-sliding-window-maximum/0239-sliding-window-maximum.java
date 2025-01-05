class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res=new ArrayList<>();
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(!deque.isEmpty()&& deque.getLast()<num){
                deque.pollLast();
                
            }
            deque.addLast(num);
            if(i>=k && nums[i-k]==deque.getFirst()){
                deque.pollFirst();
            }
            if(i>=k-1)
            res.add(deque.getFirst());
        
        }
        return res.stream().mapToInt(i->i).toArray();
    }

}