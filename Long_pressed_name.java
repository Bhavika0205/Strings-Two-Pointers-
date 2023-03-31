//Step:1  if the first characters do not match return false              (eg rexa and krexa)
//Step:2  if length of name is greater than that of typed then return false;         (eg roony and ron)
//Step:3  while(i<n && j<m)
        //Step:3.1   if name[i] = typed[j] i++ and j++
        //Step:3.2   if name[i-1] = typed[j] j++     (to check if this is the long pressed char or not eg alex ans aaaalex) 
        //step:3.3   if nothing toh return false
//Step:4  iterating for the leftover j's  
        //Step 4.1   if name[i-1] = typed[j] j++           eg(alexa and alexaaaaaaa)
        //Step 4.2   else return false
//Step:5  ab bhi if any i is left then return false   eg(alexan and alexaaaaaaaaaaaa)

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        int i=0;
        int j=0;
        if(name.charAt(0)!=typed.charAt(0)) return false;
        if(n>m) return false;
        while(i<n && j<m){
            if(name.charAt(i)==typed.charAt(j))
            {
                i++;
                j++;
            }
            else if(name.charAt(i-1)==typed.charAt(j))
            {
                j++;
            }
            else{
                return false;
            }
        }
        while(j<m){
            if(name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        if(i<n){
            return false;
        }
        return true;
    }
}
