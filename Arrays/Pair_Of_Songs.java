class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] temp = new int[60];
        int count = 0;
        for(int i: time)
        {
            int rem = i%60;
            int need = (60-rem)%60;
            count+=temp[need];
            temp[rem]++;
        }
        return count;
    }
}
