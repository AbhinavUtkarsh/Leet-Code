class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        numbers=[]
        for i in range(n):
            numbers.append((start+(2*i)))
        xor=reduce(ixor,numbers)
        return xor