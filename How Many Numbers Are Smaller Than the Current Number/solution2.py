class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        counter=[0]*102
        result=[]
        for i in nums:
            counter[i+1]+=1
        for i in range(1,len(counter)):
            counter[i]+=counter[i-1]
        for i in range(len(nums)):
            result.append(counter[nums[i]])
        return result
    
        