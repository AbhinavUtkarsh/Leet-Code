class Solution {
    public int[] sortedSquares(int[] A) {
         int size=A.length;          // our total length of the array
        int j=0;        // index to find the start of positive elements
        while(j<size && A[j]<0){
             j++;       // finding the first positive element
        }
        int i=j-1;          //will now use i as the index for negative elements but from their behind
        int [] result = new int [size];          // our final array to store the sorted result
        int t=0;                                 // to maintain the index of our resultant array
        while(i>=0 && j<size)                // iterating until one of the half if completed
        {
            if(A[i]*A[i]<A[j]*A[j]){      // comparison for the negative half, if they are smaller then placing
                                         // them in the array
            
                result[t++]=A[i]*A[i];      // placing their squares in the array
                i--;                            // reducing the tailing negative index
            }else{               // or else for the positive half, if they are smaller then placing them in the array
                result[t++]=A[j]*A[j];           // placing their squares in the array
                j++;        // increasing the heading positive index
                
            }
        }
        while(i>=0)                 // let's say there were not equal number of negatives and positives. Hence the positives were exhausted, so placing the rest of the negative elements.
        {       
            result[t++]=A[i]*A[i];
            i--;
        }
        while(j<size)            // doing the same for the positive elements if the negatives were exhausted
        {
            result[t++]=A[j]*A[j];
            j++;
        }
        return result;                  // returning our final result
        
    }
}

    