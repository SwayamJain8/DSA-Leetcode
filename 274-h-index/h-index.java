class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int pC[] = new int[len+1];
        for(int i = 0; i<len; i++) {
            pC[Math.min(len, citations[i])]++;
        }
        int h = pC.length-1;
        int papers = pC[h];
        while(papers < h) {
            h--;
            papers += pC[h];
        }
        return h;
    }
}