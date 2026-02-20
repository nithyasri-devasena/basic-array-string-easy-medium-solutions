class Solution {
    public int rob(int[] nums) {
         int prevMax = 0; 
        int currMax = 0; 
        
        for (int amount : nums) {
            int temp = currMax;
           
            currMax = Math.max(prevMax + amount, currMax);
            prevMax = temp;
        }
        
        return currMax;
    }
}