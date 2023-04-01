class Solution {
    public void reverseString(char[] s) {
        int lo= 0;
        int end = s.length-1;
        while(lo<end){
            char temp = s[lo];
            s[lo] = s[end];
            s[end] = temp;
            lo++;
            end--;
        }
    }
}
