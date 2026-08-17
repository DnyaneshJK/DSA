class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        int r = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<r;i++){
            int nstart = intervals[i][0];
            int nend = intervals[i][1];
            if(nstart<=end){
                end= Math.max(end,nend);
            } else {
                ans.add(new int[]{start,end});
                start=nstart;
                end = nend;
            }
        }
        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);

    }
}

