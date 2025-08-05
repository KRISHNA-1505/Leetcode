class Solution {
    public List<String> buildArray(int[] target, int n) {
        // Stack<Integer> st=new Stack<>();
        List<String> s=new ArrayList<>();
        int k=1;
        for(int i:target){
            while(k<i){
                s.add("Push");
                s.add("Pop");
                k++;
            }
            s.add("Push");
            k++;

        }
        return s;
    }
}