class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int n = (int) (0.25 * arr.length)+1;
        for(int i : map.keySet()){
            if(map.get(i)>=n){
                return i;
            }
        }
        return -1;
    }
}