class Solution {
    public String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        List<Character> l = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        while(i<j){
            if(!l.contains(c[i])) i++;
            if(!l.contains(c[j])) j--;
            if(i<j)
            {
                if(l.contains(c[i]) && l.contains(c[j]))
                {
                    swap(c,i,j);
                    i++;
                    j--;
                }
            }
        }
        return (new String(c));
    }
    public void swap(char[] c, int i, int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
