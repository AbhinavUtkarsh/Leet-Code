class Solution {
    public int heightChecker(int[] heights) {
        int counter=0;          // our counter variable
        int[] dummy=new int[heights.length];    // dummy array for comparison
        for(int i=0;i<heights.length;i++)
            dummy[i]=heights[i];        // copying the elements from height array to dummy array
        Arrays.sort(heights);         // sorting the heights array
        for(int i=0;i<heights.length;i++)
        {
            if(dummy[i]!=heights[i])    // comparing the old array stored in dummy with sorted one
                counter++;              // if so then incrementing the counter
        }
        return (counter);           // returning the result
        
    }
}