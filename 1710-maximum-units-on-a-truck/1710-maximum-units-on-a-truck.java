class Solution {
    // learned sorting on the basis of one column in a 2d array and lieral use of compare() function as it avoids overflow
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(numberOfBoxes,numberOfUnitsPerBox)->Integer.compare(numberOfUnitsPerBox[1],numberOfBoxes[1]));
        int units=0;
        for(int[]box:boxTypes){
            int count=Math.min(box[0],truckSize);
            units+=count*box[1];
            truckSize-=count;
            if(truckSize==0) break;
        }
        return units;
        
    }
}