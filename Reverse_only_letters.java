class Solution {
    public String reverseOnlyLetters(String s) {
        char c[] = s.toCharArray();
        int i=0;
        int j = c.length-1;
        while(i<j)
        {
            if(Character.isLetter(c[i]) && Character.isLetter(c[j]))
            {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            else if(!Character.isLetter(c[i]) && Character.isLetter(c[j]))
            {
                i++;
            }
            else{
                j--;
            }
        }
        String ans="";
        for(int k=0;k<c.length;k++){
            ans=ans+c[k];
        }
        return ans;
    }
}
