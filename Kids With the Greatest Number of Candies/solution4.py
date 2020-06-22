class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maximal=max(candies)
        res=[]
        for candy in candies:
            if candy+extraCandies >=maximal:
                res.append(True)
            else:
                res.append(False)
        return res
                
        
        