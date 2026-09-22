class Solution {
    public int maxScore(int[] cardPoints, int k) {
         int n=cardPoints.length;
   int psum=0;
    for(int i=0;i<k;i++){
      psum+=cardPoints[i];
    }
    int maxPoint=psum;
    int ssum=0;
    for(int i=0;i<k;i++){
      ssum+=cardPoints[n-i-1];
      psum-=cardPoints[k-i-1];
      maxPoint=Math.max(maxPoint,psum+ssum);
    }
    return maxPoint;     
    }
}