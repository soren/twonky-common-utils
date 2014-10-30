package net.twonky.util;

import static net.twonky.util.Arrays.isNonEmpty;

import junit.framework.TestCase;

public class ArraysTest extends TestCase {
	public void testStringArrayEmptiness() {
		String[] array = null;
		assertFalse(isNonEmpty(array));

		array = new String[0];
		assertFalse(isNonEmpty(array));
		
		array = new String[] { "foo" };
		assertTrue(isNonEmpty(array));
	}

	public void testCharArrayEmptiness() {
		char[] array = null;
		assertFalse(isNonEmpty(array));

		array = new char[0];
		assertFalse(isNonEmpty(array));
		
		array = new char[] { 'f', 'o', 'o' };
		assertTrue(isNonEmpty(array));
	}
}
