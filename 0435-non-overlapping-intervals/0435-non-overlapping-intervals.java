class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int count=0;

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        for(int[] n:intervals){
            if(ans.isEmpty()|| ans.get(ans.size()-1)[1]<=n[0]){
                ans.add(n);
            }
            else{
                ans.get(ans.size()-1)[1]=Math.min(ans.get(ans.size()-1)[1],n[1]);
                count++;
            }
        }
        return count;
        
    }
}