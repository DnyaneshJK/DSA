class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans =0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int n = (int) (0.25 * arr.length);
        n+=1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value >= n) {
                ans=key;
                break;
            }
        }
        return ans;
    }
}