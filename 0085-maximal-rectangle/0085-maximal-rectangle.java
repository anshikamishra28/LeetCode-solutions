class Solution {
     public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int pse[]=new int[n];
        int nse[]=new int[n];

        Stack<Integer> st=new Stack<>();
        //push index in stack not element because we are using index for further calculations
        //nse

        nse[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while(st.size()>0)st.pop();
        // empty the stack to use it again;
        
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int []heights=new int[n];
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1') heights[j]+=1;
                else
                heights[j]=0;
            }
              max=Math.max(max,largestRectangleArea(heights));
           
        }      
        return max;
        
    }
}