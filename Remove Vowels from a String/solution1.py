class Solution:
    def removeVowels(self, S: str) -> str:
        s=""
        for i in S:
            if i not in ["a","e","i","o","u"]:
                s+=i
        return s
        