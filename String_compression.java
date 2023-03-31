class Solution {
    public int compress(char[] c) {
        String s = "";
        int count = 1;
        int i;
        for(i=0;i<c.length-1;i++)
        {
            if(c[i] == c[i+1])
            {
                count++;
            }
            else{
                if(count>1)
                {
                    s+=c[i]+""+count;
                }
                else{
                    s+=c[i];
                }
                count = 1;
            }
        }
        if(count>1) s+=c[i] + ""+ count;
        else s+=c[i];
        int idx = 0;
        for(char k:s.toCharArray())
        {
            c[idx] = k;
            idx++;
        }
        return s.length();
    }
}
