class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        shuffle=[0 for i in range(2*n)]
        i=0
        while(i<n):
            shuffle[2*i]=nums[i]
            shuffle[2*i+1]=nums[n+i]
            i+=1
            
        return shuffle
            
            
        