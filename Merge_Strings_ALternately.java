class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<Math.max(n,m);i++)
        {
            if(i<n)
            {
                ans.append(word1.charAt(i));
            }
            if(i<m)
            {
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
}
