import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rrr {

	public static void main(String[] args) {
		String s="of the people for the people by the people";
		String[] allwords=s.split(" ");
	    Map<String, Integer> m = new HashMap <String,Integer>();//typecasting
		for (String singleword : allwords) {
			if(m.containsKey(singleword))
			{
				int i=m.get(singleword);
			m.put(singleword, i+1);
			}
			
			else
			{
			m.put(singleword, 1);//m.(key,value)of=1,2
			}
			
			
		}
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1)
			{
			System.out.println(entry);
			}
		}
	}}

		


 