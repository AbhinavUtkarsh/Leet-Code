class Solution:
    def calculateTime(self, keyboard: str, word: str) -> int:
        lastLocation=0
        distance=len(word)
        totalDistance=0
        i=0
        while(i<distance):
            standing=keyboard.index(word[i])
            totalDistance+=(abs(standing-lastLocation))
            lastLocation=standing
            i+=1
        return totalDistance
            
        
        