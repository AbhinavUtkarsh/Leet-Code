class Solution:
    def calculateTime(self, keyboard: str, word: str) -> int:
        lastLocation=0
        distance=len(word)
        totalDistance=0
        hashtable={}
        for i in range(len(keyboard)):
            hashtable[keyboard[i]]=i
        i=0
        while(i<distance):
            standing=hashtable[word[i]]
            totalDistance+=(abs(standing-lastLocation))
            lastLocation=standing
            i+=1
        return totalDistance
            