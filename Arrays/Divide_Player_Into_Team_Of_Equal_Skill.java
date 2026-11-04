class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int i=0;
        int j=n-1;
        long res = 0;
        long x = (long)skill[0]+skill[n-1];
        while(i<j)
        {
            if((skill[i]+skill[j])==x)
            {
                res+=(long)skill[i]*skill[j];
            }
            else
            {
                return -1;
            }
            i++;
            j--;
        }
        return res;
    }
}
