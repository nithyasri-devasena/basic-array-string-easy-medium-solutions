class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2)
            return -1;
        int large= Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i : arr){
            if(i>large){
                second = large;
                large = i;
            }
            else if(i > second && i!=large){
                second =i;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}