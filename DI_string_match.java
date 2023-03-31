// explanation
//we will initialize two pointers 'st' ans 'end' where st = 0 and end = s.length()
//now if we encounter an I then ans mein st add kro and st++
//else ans mein end add kro and end--
//last mein ans ke last index mein end ki jo bhi value abhi tk hai add kro


class Solution {
    public int[] diStringMatch(String s) {
        int st =0;
        int end = s.length();
        int ans[] = new int[s.length()+1];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'I')
            {
                ans[i] = st;
                st++;
            }
            else{
                ans[i] = end;
                end--;
            }
        }
        ans[s.length()] = end;
        return ans;
    }
    
}
