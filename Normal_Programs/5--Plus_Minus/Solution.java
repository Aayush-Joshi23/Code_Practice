import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        
        float num = 0, p = 0, n = 0, z = 0;
        for (int i = 0; i<arr.size(); i++)
        {
            num  = arr.get(i);
            if(num>0)     
                p += 1;
            else if (num<0)
                n += 1;
            else 
                z += 1;
        }
        num = arr.size();
        System.out.printf("%.6f",(p/num) );
        System.out.printf("\n %.6f",(n/num) );
        System.out.printf("\n %.6f",(z/num) );
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
