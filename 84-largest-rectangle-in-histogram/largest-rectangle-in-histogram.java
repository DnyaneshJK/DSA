class Solution {

    public int[] pse(int arr[]){
        int n = arr.length;
        Deque<Integer> s = new ArrayDeque<>();
        int ans[] = new int[n];
        
        for(int i=0;i<n;i++){

            while(!s.isEmpty() && arr[s.peek()] > arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = -1;
            } else{
                ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }

    public int[] nse(int arr[]){
        int n = arr.length;
        Deque<Integer> s = new ArrayDeque<>();
        int ans[] = new int[n];
        
        for(int i=n-1;i>=0;i--){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = n;
            } else{
                ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }



    public int largestRectangleArea(int[] heights) {
        int[] pse = pse(heights);
        int[] nse = nse(heights);
        int area = 0;

        for(int i=0;i<heights.length;i++){
            int l = heights[i];
            int b = (i-pse[i]) + (nse[i] - i) - 1;
            area = Math.max(area,l*b);
        }

            return area;

     }
}