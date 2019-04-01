package pvt.hrk.utils;

import java.util.Collection;
import java.util.Map;

public class Utility {
	public static <T> boolean isNullOrEmpty(final T[] arr) {
		return arr == null || arr.length == 0;
	}
	public static boolean isNullOrEmpty(final String str) {
		return str == null || str.length() == 0;
	}
	public static <T> boolean isNullOrEmpty(final Collection<T> col) {
		return col == null || col.size() == 0;
	}
	public static <K,V> boolean isNullOrEmpty(final Map<K,V> map) {
		return map == null || map.size() == 0;
	}
}
