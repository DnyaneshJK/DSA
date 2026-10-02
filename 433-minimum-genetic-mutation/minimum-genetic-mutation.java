class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        HashSet<String> set = new HashSet<>();
        char[] genes = {'A','C','G','T'};

        for (String ch : bank) {
            set.add(ch);
        }

        Queue<String> q = new ArrayDeque<>();
        q.offer(startGene);
        int count = 0;

        if (!set.contains(endGene))
            return -1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String word = q.poll();

                if (word.equals(endGene))
                    return count;

                char[] arr = word.toCharArray();

                for (int a = 0; a < word.length(); a++) {
                    for (char j : genes) {
                        arr[a] = j;
                        String mut = new String(arr);
                        if (set.contains(mut)) {
                            set.remove(mut);
                            q.offer(mut);
                        }
                    }
                    arr[a] = word.charAt(a);
                }

            }
            count++;
        }
        return -1;
    }
}