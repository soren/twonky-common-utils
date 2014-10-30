package net.twonky.util;


public class Arrays {
	public static boolean isNonEmpty(Object[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(byte[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(short[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(int[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(long[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(float[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(double[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(boolean[] array) {
		return array != null && array.length > 0;
	}

	public static boolean isNonEmpty(char[] array) {
		return array != null && array.length > 0;
	}

	public static String stringify(String[] array) {
		if (array != null) {

			StringBuilder buf = new StringBuilder("[");

			for (int i = 0; i < array.length; i++) {
				buf.append(array[i]);
				if (i < array.length - 1) buf.append(",");
			}

			return buf.append("]").toString();
		} else {
			return "null";
		}
	}

	public static String stringify(char[] array) {
		if (array != null) {

			StringBuilder buf = new StringBuilder("[");

			for (int i = 0; i < array.length; i++) {
				buf.append(array[i]);
				if (i < array.length - 1) buf.append(",");
			}

			return buf.append("]").toString();
		} else {
			return "null";
		}
	}
}
