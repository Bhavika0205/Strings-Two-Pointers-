class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())  return true;
        int i=0;
        int j = s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            char first = s.charAt(i);
            char last = s.charAt(j);
            if(!Character.isLetterOrDigit(first)){
                i++;
                continue;
            }
            else if (!Character.isLetterOrDigit(last)){
                j--;
                continue;
            }
            else{
                if(first != last){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
