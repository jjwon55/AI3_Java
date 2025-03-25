package Day12.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("해원", 100);
		map.put("설윤", 90);
		map.put("릴리", 80);
		map.put("지우", 60);
		map.put("지니", 95);
		map.put("규진", 85);
		map.put("베이", 55);
		map.put("조은", 20);
		
		
		map.put("해원", 99);
		
		System.out.println("총 개수: " + map.size());
		System.out.println();
		
		System.out.println("해원의 코딩 성적 : " + map.get("해원"));
		System.out.println("설윤의 코딩 성적 : " + map.get("설윤"));
		
		//제거
		map.remove("조은");
		
		//map 반복 1
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		//Map 반복2 - Iterartor 사용
		//map.entrySet() : itera
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
		    Map.Entry<String, Integer> entry = entryIterator.next();
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println(key + " : " + value);
		}
		System.out.println();

		// Map 반복 3 - for map
		//formap: ctrl + space
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    String key = entry.getKey();
		    Integer val = entry.getValue();
		    System.out.println(key + " : " + val);
		}
		System.out.println();

		System.out.println("총 개수 : " + map.size());
		map.clear();
		System.out.println("empty 여부 : " + map.isEmpty());
		
		
	}
}
