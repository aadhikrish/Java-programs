import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ReptitivePgm {

	public static void main(String[] args) {
		String s="of the people for of the people by the people";
		String[] word=s.split(" ");
		Map<String,Integer>m=new LinkedHashMap<String,Integer>();
		for (String sword : word) {
			
		if(m.containsKey(sword))
		{
		Integer value=m.get(sword);
		m.put(sword, value+1);
		}
		else{
		m.put(sword, 1); //(key,value)
		}
		
	
	}System.out.println(m);
	Set<Entry<String,Integer>> e=m.entrySet();
	System.out.println(e);
	
	for (Entry<String, Integer> entry : e) {
		
	
	if(entry.getValue()>1)
	{
		System.out.println(entry);}}
	}}
