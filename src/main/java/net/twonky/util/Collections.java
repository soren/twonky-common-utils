package net.twonky.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Collections {

	@SuppressWarnings("rawtypes")
	public static boolean isNonEmpty(Collection collection) {
		return collection != null && !collection.isEmpty();
	}

	@SuppressWarnings("rawtypes")
	public static boolean isNonEmpty(Map map) {
		return map != null && !map.isEmpty();
	}

	public static List<?> safe(List<?> list) {
		return list == null ? java.util.Collections.EMPTY_LIST : list;
	}

}
