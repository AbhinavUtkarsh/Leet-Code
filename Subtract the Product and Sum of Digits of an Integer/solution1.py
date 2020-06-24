from functools import reduce
class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        digits=[]
        while(n!=0):
            digits.append(n%10)
            n=n//10
        product=reduce(lambda a,b:a*b,digits)
        total=sum(digits)
        return product-total
        