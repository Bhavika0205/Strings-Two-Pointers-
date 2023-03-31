class Solution {
    public boolean canChange(String s, String t) {
        if(s.length()!=t.length()) return false;
        int i = 0;
        int j = 0;
        while(i<s.length() || j<t.length())
        {
            while(i<s.length() && s.charAt(i)=='_') i++;
            while(j<t.length() && t.charAt(j)=='_') j++;
            if(i==s.length() && j==t.length()) return true;
            if(i==s.length() || j==t.length() || s.charAt(i)!=t.charAt(j)) return false;
            if(i<s.length() && j<t.length())
            {
                if(t.charAt(j)=='L' && i<j)       // s = L_, t= _L
                {
                    return false;
                }
                if(t.charAt(j)=='R' && i>j)       // s = _R, t= R_
                {
                    return false;
                }
            }
            i++;
            j++;
        }
        return true;
    }
}
