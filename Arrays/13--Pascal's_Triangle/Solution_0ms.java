import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> arrl = new ArrayList<List<Integer>>();

        ArrayList<Integer> oldarr = new ArrayList<Integer>();
        oldarr.add(1);
        oldarr.add(1);

        for (int i = 0; i < numRows; i++) {

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            if (i == 0) {
                arrl.add(arr);
                continue;
            } else if (i == 1) {
                arr.add(1);
                arrl.add(arr);
                continue;
            }

            int n = 0;

            for (int j = 1; j < i; j++) {
                n = oldarr.get(j - 1) + oldarr.get(j);
                arr.add(n);
            }

            arr.add(1);
            arrl.add(arr);
            oldarr = arr;

        }
        return arrl;

    }
}