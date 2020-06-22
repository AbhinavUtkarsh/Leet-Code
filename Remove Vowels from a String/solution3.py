class Solution:
    def removeVowels(self, S: str) -> str:
        return re.sub("a|e|i|o|u","",S)
    