// here we need to compare each revesion and tell which version is greater or not
// 1.001 == 1.1


class Solution {
    public int compareVersion(String v1, String v2) {
        int n = v1.length();
        int m = v2.length();
        int i = 0;
        int j = 0;
        while(i<n || j<m)
        {
            int x = 0;
            int y = 0;
            while(i<n && v1.charAt(i)!='.')
            {
                x = x*10 + (v1.charAt(i) - '0');
                i++;
            }
            i++;
            while(j<m && v2.charAt(j)!='.')
            {
                y=y*10 + (v2.charAt(j) - '0');
                j++;
            }
            j++;
            if(x>y) return 1;
            else if(x<y) return -1;
            // i++;
            // j++;
        }
        return 0;
    }
}
