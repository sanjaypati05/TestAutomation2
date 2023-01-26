package TestAutomation.helpers;

import java.util.HashMap;
import java.util.Map;

public class TestPractice {
	
	
	public static void stringCount(String s) {
		
		String splittedStringArray[]= s.split("");
		
		
		HashMap<String ,Integer> hm=new HashMap<String ,Integer>();
		for(String s1:splittedStringArray) {
			if(hm.containsKey(s1)) {
				hm.put(s1, hm.get(s1)+1);
			}else
				hm.put(s1, 1);
		}
		hm.remove(" ");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
			
		}
		
	}
	
	public static void main(String args[]) {
		
		
		stringCount("test Sanjaya test  Akshaya Kumar Pati Test ");
		
		
		
		
	}

}
