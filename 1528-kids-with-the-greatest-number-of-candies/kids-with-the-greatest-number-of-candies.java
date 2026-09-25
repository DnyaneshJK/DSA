class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max=-1;
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        List<Boolean> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                arr.add(true);
            } else{
                arr.add(false);
            }
        }
        return arr;
    }
}