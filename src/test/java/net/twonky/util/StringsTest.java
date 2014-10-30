package net.twonky.util;

import static net.twonky.util.Strings.isNonEmpty;

import junit.framework.TestCase;

public class StringsTest extends TestCase {
	public void testStringEmptiness() {
		String string = null;
		assertFalse(isNonEmpty(string));

		string = "";
		assertFalse(isNonEmpty(string));

		string = "foo";
		assertTrue(isNonEmpty(string));		
	}
}
