package java_sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapNest {

	public static void main(final String[] args) {
		final ArrayList<Map<String, Integer>> name = new ArrayList<>();
		final Map<String, Integer> map = new HashMap<>();
		map.put("佐藤", 3);
		map.put("加藤", 7);
		map.put("武藤", 5);
		map.put("尾藤", 6);
		map.put("首藤", 9);

		name.add(map);
		for (final Map<String, Integer> d : name) {
			System.out.println(d);
		}
	}

}
