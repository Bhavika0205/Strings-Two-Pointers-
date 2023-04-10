package Basics;
import java.util.*;
public class find_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = duplicate(str);
		System.out.println(ans);
	}
	public static String duplicate(String str)
	{
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char i: ch)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		String ans = "";
		for(int i = 0;i<str.length();i++)
		{
			if(map.containsKey(ch[i]) && map.get(ch[i])>1)
			{
				ans+=ch[i];
				break;
			}
		}
		return ans;
	}

}
