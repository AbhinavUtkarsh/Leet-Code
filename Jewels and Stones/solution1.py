class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        counter=0
        hashtable={}
        for i in S:
            hashtable[i]=hashtable.get(i,0)+1
        for i in J:
            if i in S:
                counter+=hashtable[i]
        return counter
                
        