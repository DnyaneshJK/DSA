class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0;
        int max=0;

        for(int r=0;r<fruits.length;r++){

            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            while(map.size()>2){
                int fr = fruits[l];
                map.put(fr,map.get(fr)-1);

                if(map.get(fr) == 0){
                    map.remove(fr);
                }
                 l++;
            }
            max = Math.max(max,r-l+1);

        }
        return max;
        
    }
}