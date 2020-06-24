class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        i=0
        res=[]
        n=len(nums)
        while(i<n):
            freq=nums[i]
            val=nums[i+1]
            res.extend([val]*freq)
            i+=2
        return res