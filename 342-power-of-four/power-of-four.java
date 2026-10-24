class Solution {
    public boolean isPowerOfFour(int n) {
    if(n==1) return true;
    if(n<=0 || n%4!=0) return false;

    return isPowerOfFour(n/4);
    }
}





// BIT MANUPULATION
//   int count = 0;
//         if(n<=0) return false;

//         while((n&1)==0){
//             n = n>>1;
//             count++;
//         }
        
//         return n==1 && count%2==0;