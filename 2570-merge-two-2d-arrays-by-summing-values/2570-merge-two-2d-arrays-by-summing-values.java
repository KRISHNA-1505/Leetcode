class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[][] nums3=new int[n1+n2][2];
        for(int i=0;i<n1;i++){
            nums3[i][0]=nums1[i][0];
            nums3[i][1]=nums1[i][1];       
           }
        int k = n1; 
        for (int i = 0; i < n2; i++) {
            nums3[k][0] = nums2[i][0];
            nums3[k][1] = nums2[i][1];
            k++;
        }
        Arrays.sort(nums3, (a, b) -> Integer.compare(a[0], b[0]));
  List<int[]> mergedList = new ArrayList<>();
        int[] prev = nums3[0];

        for (int i = 1; i < nums3.length; i++) {
            if (nums3[i][0] == prev[0]) {
                prev[1] += nums3[i][1];
            } else {
                mergedList.add(prev);
                prev = nums3[i];
            }
        }
        mergedList.add(prev); 
        return mergedList.toArray(new int[mergedList.size()][]);
}
}