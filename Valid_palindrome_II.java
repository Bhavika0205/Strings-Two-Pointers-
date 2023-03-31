class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))      // this is when we find a point of conflict ki jb humare front se sur back se same na ho then we will give it a chance ki aage se ek miss keke if palindrome then true ya phir piche se ek miss krke if palindrome then true otherwise false 
            {
                return ispal(s,i+1,j) || ispal(s,i,j-1);    
            }
            else{                     //this means ki we are iterating jb tk aage se ur peeche se words same hai
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean ispal(String s, int i, int j){
        // int i=0;
        // int j= s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
