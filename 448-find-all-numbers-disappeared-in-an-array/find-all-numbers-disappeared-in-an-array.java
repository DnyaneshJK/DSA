class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> lis = new ArrayList<>();
        int n= nums.length;

        for(int num : nums) {
            set.add(num);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                lis.add(i);
            }
        }
        return lis;
    }
}