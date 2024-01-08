class Solution {

    public int fib(int n) {
        
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
       
        return fibo(n-1, 0, 1);
        
    }
    public int fibo(int n, int a, int b)
    {
        if(n==1)
            return a+b;
        return fibo( n-1, b, a+b);
    }

}