class Solution:
    def numberOfSteps (self, num: int) -> int:
        counter=0
        power=1
        if num==0:
            return 0
        while(power<=num):
            if power&num ==0:
                counter+=1
            else:
                counter+=2
            power*=2
        return counter-1
        
            
                