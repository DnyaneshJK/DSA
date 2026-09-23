class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> visited = new HashSet<>();
        Set<String> dead = new HashSet<>();
        Queue<String> q = new ArrayDeque<>();

        q.offer("0000");
        visited.add("0000");

        for (String st : deadends) {
            dead.add(st);
        }
        if (dead.contains("0000")) {
            return -1;
        }

        int c = 0;
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String s = q.poll();

                if(s.equals(target)) return c;

                for(int j=0;j<4;j++){
                    char[] arr = s.toCharArray();
                    if(arr[j]=='9'){
                        arr[j]='0';
                    } else{
                        arr[j]++;
                    }

                    String a = new String(arr);

                    if(!dead.contains(a) && !visited.contains(a)){
                        q.offer(a);
                        visited.add(a);
                    }


                    arr = s.toCharArray();

                    if(arr[j]=='0'){
                        arr[j]='9';
                    } else{
                        arr[j]--;
                    }

                     a = new String(arr);

                     if(!dead.contains(a) && !visited.contains(a)){
                        q.offer(a);
                        visited.add(a);
                    }

                }

            }

            c++;
        }
        return -1;

    }
}