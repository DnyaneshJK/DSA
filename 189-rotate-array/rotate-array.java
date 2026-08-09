class Solution {
    public void rotate(int[] nums, int k) {
        int y=nums.length-1;
        int n= nums.length;
        k=k%n;
        reverse(nums,0,y);
        reverse(nums,0,k-1);
        reverse(nums,k,y);
    }
     public static void reverse(int[] arr,int left,int right){
            while(left<right){
                int temp=arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
}