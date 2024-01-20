class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int a=1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=a;
            a=a*nums[i];
        }   
        a = 1;
             for(int i=n-1;i>=0;i--){
            arr[i]=arr[i]*a;
            a=a*nums[i];
        }
        return arr;
    }
}