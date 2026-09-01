class Solution {

    public int[] nse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Deque<Integer> s = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }

    public int[] pse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Deque<Integer> s = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[i] < arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(i);
        }
         return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long total =0;
        long mod = 1000000007;

        int pse[] = pse(arr);
        int nse[] = nse(arr);

        for(int i=0;i<n;i++){
            long l = i-pse[i];
            long r = nse[i]-i;

            long c = (long) arr[i]*l*r;

            total = (total + c ) % mod; 
        }


        return (int) total;
    }
}

// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int n=arr.length;
//         long ans=0;
//         if(n==1){
//             return arr[0];
//         }
//         for(int i=0;i<n-1;i++){
//             long mins=arr[i];
//             int min = Integer.MAX_VALUE;
//             for(int j=i+1;j<n;j++){
//                 min = Math.min(min,arr[j]);
//                 mins += min;
//             }
//             ans +=mins;
//         }
//         return (int)(ans % 1000000007);
//     }
// }