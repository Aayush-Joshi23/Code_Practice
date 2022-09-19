import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        List<Integer> nq = q.stream().map(i -> i - 1).collect(toList());

        for (int i = 0; i < nq.size(); i++) {
            if (nq.get(i) - i > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        boolean isNotSorted = true;
        int bribes = 0;
        int startIdx = 0;
        while (isNotSorted) {
            for (int s = startIdx; s < nq.size() - 1; s++) {
                if (nq.get(s + 1) < s + 1) {
                    Collections.swap(nq, s, s + 1);
                    bribes++;
                }
            }

            while (startIdx < nq.size() - 1) {
                isNotSorted = nq.get(startIdx) != startIdx;
                if (isNotSorted) {
                    break;
                }

                ++startIdx;
            }
        }

        System.out.println(bribes);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
