class Solution {
    public int[][] merge(int[][] intervals) {
         // Step 1: Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> a[0]- b[0]);

        List<int[]> ans= new ArrayList<>();

        for(int[] n:intervals){
            if(ans.isEmpty()|| ans.get(ans.size()-1)[1]<n[0]){
                ans.add(n);
            }
            else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],n[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}