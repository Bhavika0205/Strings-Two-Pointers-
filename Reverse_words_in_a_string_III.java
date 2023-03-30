public String reverseWords(String s) {
        char c[] = s.toCharArray();
        int st =0;
        for(int end = 0;end<=c.length;end++)
        {
            if(end==c.length || c[end] == ' ')
            {
                swap(c,st,end-1);
                st = end+1;
            }
            
        }
        return new String(c);
    }
    public void swap(char c[], int i, int j)
    {
        while(i<j){
           char temp=c[i];
           c[i] = c[j];
           c[j] = temp;
           i++;
           j--;
        }
    }
