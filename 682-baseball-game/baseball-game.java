class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];

            if (s.equals("C") && arr.size() > 0) {
                arr.remove(arr.size() - 1);
            } else if (s.equals("D") && arr.size() > 0) {
                arr.add(2 * arr.get(arr.size() - 1));
            } else if (s.equals("+") && arr.size() > 1) {
                int j = arr.get(arr.size() - 2) + arr.get(arr.size() - 1);
                arr.add(j);
            } else {
                int k = Integer.parseInt(s);
                arr.add(k);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            c += arr.get(i);
        }
        return c;

    }
}