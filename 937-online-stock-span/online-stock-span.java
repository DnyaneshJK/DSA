class StockSpanner {

    Deque<int[]> stack;

    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {

        int s =1;

        while(!stack.isEmpty() && price>=stack.peek()[0]){
            s += stack.pop()[1];
        }
        stack.push(new int[]{price,s});

        return s;
        
    }
}



//  ArrayList<Integer> arr;
//     public StockSpanner() {
//         arr = new ArrayList<>();
        
//     }
//     public int next(int price) {
//         int c=1;
//         int i=arr.size()-1;
//         while(i>=0){
//             if(price>=arr.get(i)) {
//                 c++;
//                 i--;
//             } else{
//                 break;
//             }
//         }
//         arr.add(price);
//         return c;
//     }


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */