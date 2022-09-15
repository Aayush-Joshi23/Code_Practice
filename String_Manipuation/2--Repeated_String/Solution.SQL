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
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
    
    long l = s.length();
    long c = 0;
    
    if(l==1)
    {
        if(s.charAt(0)=='a')
        {
            return n;
        }
        else
        {
            return 0;
        }
    }
    else if(n>l)
    {
        for(int i=0;i<l; i++)
        {
            if(s.charAt(i) =='a')
            {
                c++; 
            }
        }  
        if(c==0)
        {
            return 0;
        } 
        
            c = c * (long)Math.floor(n/l);
        
            l = (long)Math.floor(n%l);
        
        
        for(int i =0;i<l;i++)
        {
            if(s.charAt(i) == 'a')
            {
                c++;
            }
        }
    }
    else 
    {
        for(int i=0;i<n; i++)
        {
            if(s.charAt(i) =='a')
            {
                c++; 
            }
        }  
    }
    // System.out.println(c);
    return c;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
