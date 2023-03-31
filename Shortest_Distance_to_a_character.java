//define a variable cpos which will keep the record of the position of character c and assign it a value of int min
//first from left see the positions and keep on filling the array
//now assign the the maximum value to the cpos variable
//from right we will be updating the minimum values into the array


class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int cpos = Integer.MIN_VALUE/2;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                cpos = i;
            }
            ans[i] = i-cpos;
        }
        cpos = Integer.MAX_VALUE/2;
        for(int i = n-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
            {
                cpos = i;
            }
            ans[i] = Math.min(ans[i], cpos-i);
        }
        return ans;
    }
}
