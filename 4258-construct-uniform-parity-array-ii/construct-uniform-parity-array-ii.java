class Solution {
    public boolean uniformArray(int[] nums1) {
        int c=0;
        int d=0;
        int[] nums2 = new int[nums1.length];
        int mine=Integer.MAX_VALUE;
        int mino=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                c++;
                mine = Math.min(mine,nums1[i]);
            } else{
                d++;
                mino = Math.min(mino,nums1[i]);
            }
        }
        if(nums1.length==c || nums1.length==d) return true;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0 && nums1[i]<=mino){
                return false;
            }
        }


        return true;
        
    }
}