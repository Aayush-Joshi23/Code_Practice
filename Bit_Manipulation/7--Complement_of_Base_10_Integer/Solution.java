class Solution {
    public int bitwiseComplement(int n) {

        int count = 0, num=n;
        while(n > 0){
            n = n/2;
            count++;
        }
        int tmp = (int) (Math.pow(2,count)-1);
        return tmp - num;
    }

}