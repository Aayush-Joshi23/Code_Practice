class Solution {
    public int findComplement(int num) {

        int count = 0, n=num;
        while(n > 0){
            n = n/2;
            count++;
        }
        int tmp = (int) (Math.pow(2,count)-1);
        return tmp - num;
    }

}