class Solution {
    public boolean isCover(int n,int[][] ranges){
        for(int i=0;i<ranges.length;i++){
            if(n>=ranges[i][0] && n<=ranges[i][1]){
                return true;
            }
        }return false;
    }
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left;i<=right;i++){
          if(!isCover(i,ranges)){
            return false;
        }}return true;
    }
}