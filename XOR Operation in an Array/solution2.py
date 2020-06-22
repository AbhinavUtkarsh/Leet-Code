class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        numbers=[]
        for i in range(n):
            numbers.append((start+(2*i)))
        xor=reduce(lambda x,y:x^y,numbers)
        return xor
        
        
        