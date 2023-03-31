class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        int idx1 = process(ss);          // using this function we are making a char array that will contain only alphabets and not '#' for string s 
        int idx2 = process(tt);          // using this function we are making a char array that will contain only alphabets and not '#' for string t
        
        if(idx1!=idx2) return false;
        
        for(int i=0;i<idx1;i++)          // now we will check if the processed string are same or not
        {
            if(ss[i]!=tt[i]) return false;
        }
        return true;
    }
    public int process(char[] ans)
    {
        int idx = -1;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i] == '#')
            {
                if(idx>-1)
                {
                    idx--;
                }
            }
            else{
                idx++;
                ans[idx] = ans[i];
            }
        }
        return idx+1;
    }
}
