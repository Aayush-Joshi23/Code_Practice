import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lst = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        lst.add(arr1);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);

            int j = 1;

            while (j < i && j < arr1.size()) {
                arr.add(arr1.get(j - 1) + arr1.get(j));
                j++;
            }

            arr.add(1);

            lst.add(arr);
            arr1 = arr;

        }

        return lst;

    }
}