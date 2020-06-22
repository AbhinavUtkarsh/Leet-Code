class Solution:
    def numberOfSteps (self, num: int) -> int:
        if num==0:
            return 0
        num=bin(num)[2:]
        counter=0
        for i in num:
            if i=="0":
                counter+=1
            else:
                counter+=2
        return counter-1
        
            
                