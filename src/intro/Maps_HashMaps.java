package intro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_HashMaps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap....does not retain order, and can't have two of the same keys
		Map m = new HashMap();
		m.put("eric",38);
		m.put("sam",25);
		m.put("Dad",62);
		m.put("mom",63);
		System.out.println(m);
		System.out.println(m.containsValue("sam"));
		System.out.println(m.containsValue(25));
		System.out.println(m.containsKey("sam"));
		System.out.println(m.containsKey(25));
		System.out.println(m.get("Sam"));
		System.out.println(m.get("sam"));
		m.remove("eric");
		System.out.println(m);
		m.clear();
		System.out.println(m);
		
		//TreeMap....contains order based on the key (key has to be the same datatype)
		Map t = new TreeMap();
		t.put("eric",38);
		t.put("sam",25);
		t.put("Dad",62);
		t.put("mom",63);
		System.out.println(t);
		System.out.println(t.get("eric"));
		System.out.println(t.values());
		
		//LinkedHashMap....contains order as added into the LHM
		Map l = new LinkedHashMap();
		l.put("eric",38);
		l.put("sam",25); 
		l.put("Dad",62);
		l.put("mom",63);
		System.out.println(l);
		System.out.println(l.get("eric"));
		
		

	}

}
