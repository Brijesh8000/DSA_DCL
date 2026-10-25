class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer ,Integer> h=new HashMap<>();
        for(int n:nums){
            if(h.containsKey(n)){
                return true;
            }
            
            h.put(n,1);
        }
        return false;
        
    }
}