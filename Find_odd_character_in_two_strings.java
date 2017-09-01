import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Find_odd_character_in_two_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="dsfad";
String s2 ="adfsdx";

Find_odd_character_in_two_strings a = new Find_odd_character_in_two_strings();
  char answer =  a.find_odd_char(s1,s2);
	}

	public char find_odd_char(String s1, String s2)
	{
		char result = 0;
		
		if (s2.length()>s1.length())
		{
			return find_odd_char(s2,s1);
		}
		HashMap<String,Integer> s1count = new HashMap<String,Integer>();
		HashMap<String,Integer> s2count = new HashMap<String,Integer>();
		
		s1count = find_count(s1);
		s2count = find_count(s2);
		
	
		Iterator it = s1count.entrySet().iterator();
	    while (it.hasNext()) {
	    	HashMap.Entry pair = (HashMap.Entry)it.next();
	       // System.out.println(pair.getKey() + " = " + pair.getValue());
	        
	        if(pair.getValue()!= s2count.get(pair.getKey()))
	        {
	        	System.out.println(pair.getKey());
	        	result = (char) pair.getKey();
	        }
	        
	        
	        it.remove(); // avoids a ConcurrentModificationException
	    }
		return result;
	}
	public HashMap find_count(String s1)
	{
		HashMap<String,Integer> text = new HashMap<String,Integer>();
		
		for (int i=0;i<s1.length();i++)
		{
			
			//System.out.println(s1.charAt(i));
			//System.out.println(text.get(String.valueOf(s1.charAt(i))));
			if(text.get(String.valueOf(s1.charAt(i)))!=null)
			{
				text.put(String.valueOf(s1.charAt(i)),text.get(String.valueOf(s1.charAt(i)))+1 );
			}
			else
			{
				text.put(String.valueOf(s1.charAt(i)), 1);
				
			}
		}
		
		return text;
	}
	
}
