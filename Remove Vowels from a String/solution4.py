class Solution:
    def removeVowels(self, S: str) -> str:
        vov={"a","e","i","o","u"}
        res=[]
        for i in S:
            if i not in vov:
                res.append(i)
        return "".join(res)
    