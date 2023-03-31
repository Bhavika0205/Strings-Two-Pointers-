class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int st = -1;
        int end = -1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ' && end ==-1)
            {
                end = i;
            }
            else if(s.charAt(i)==' ' && end!=-1)
            {
                st = i+1;
                ans = ans + s.substring(st, end+1)+" ";
                st = -1;
                end = -1;
            }
            if(i==0 && end != -1){
                ans+=s.substring(i,end+1);
            }
        }
        return ans.trim();
    }
}
