class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();

        for(String st : wordList){
            set.add(st);
        }

        Queue<String> q = new ArrayDeque<>();
        q.offer(beginWord);
        int count=1;

        if(!set.contains(endWord)) return 0;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){

                String word = q.poll();

                if(word.equals(endWord)){
                    return count;
                }

                char[] arr = word.toCharArray();
                for(int j=0;j<word.length();j++){
                    
                    for(char c='a';c<='z';c++){
                        arr[j]=c;
                        String s = new String(arr);

                        if(set.contains(s)){
                            set.remove(s);
                            q.offer(s);
                        }
                    }
                    arr[j] = word.charAt(j);
                }
            }
            count++;
        }
        return 0;
    }
}