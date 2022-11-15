import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 15 == 0) {
                arr.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                arr.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add("" + (i + 1));
            }
        }
        return arr;

    }
}