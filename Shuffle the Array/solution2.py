class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        shuffle=[0 for i in range(2*n)]
        i=1
        j=n
        while(i<2*n):
            shuffle[i]=nums[j]
            j+=1
            i+=2
        i=0
        j=0
        while(i<2*n):
            shuffle[i]=nums[j]
            i+=2
            j+=1
            
        return shuffle
            
            
        