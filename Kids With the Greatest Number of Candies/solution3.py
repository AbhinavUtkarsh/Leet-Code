class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maximal=max(candies)
        return [candy+extraCandies >=maximal for candy in candies]
                
        
        