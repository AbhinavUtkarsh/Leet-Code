class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maximal=max(candies)
        res=[False for i in range(len(candies))]
        for i in range(len(candies)):
            if candies[i]+extraCandies >=maximal:
                res[i]=True
        return res
                
        
        