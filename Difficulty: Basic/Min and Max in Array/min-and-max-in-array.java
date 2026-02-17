class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        if(arr ==null || arr.length==0){
            return new ArrayList<>();
        }
        
        int min=arr[0];
        int max= arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[i]>max){
                max = arr[i];
            }
        }
        return new ArrayList<>(Arrays.asList(min, max));
    }
}
