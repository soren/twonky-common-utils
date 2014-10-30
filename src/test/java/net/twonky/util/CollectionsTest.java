package net.twonky.util;

import static net.twonky.util.Collections.isNonEmpty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

public class CollectionsTest extends TestCase {
	public void testListEmptiness() {
		List<String> list = null;
		assertFalse(isNonEmpty(list));

		list = new ArrayList<String>();
		assertFalse(isNonEmpty(list));

		list.add("foo");
		assertTrue(isNonEmpty(list));

	}

	public void testSetEmptiness() {
		Set<Integer> set = null;
		assertFalse(isNonEmpty(set));

		set = new HashSet<Integer>();
		assertFalse(isNonEmpty(set));

		set.add(123);
		assertTrue(isNonEmpty(set));

	}
	
	public void testMapEmptiness() {
		Map<String,String> map = null;
		assertFalse(isNonEmpty(map));

		map = new HashMap<String,String>();
		assertFalse(isNonEmpty(map));

		map.put("foo","bar");
		assertTrue(isNonEmpty(map));

	}
	
//	public void testSafeList() {
//		List<String> list;
//		for (String s : safe(list));
//		
//	}

}
