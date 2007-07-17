/**
 * 
 */
package net.azib.ipscan.core.values;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

import org.junit.Test;


/**
 * @author Anton Keks Keks
 */
public class NumericListValueTest {

	@Test
	public void testToString() {
		assertEquals("", new NumericListValue(Collections.<Integer>emptyList(), true).toString());
		assertEquals("1", new NumericListValue(Arrays.asList(1), true).toString());
		assertEquals("1-3", new NumericListValue(Arrays.asList(1, 2, 3), true).toString());
		assertEquals("1-3", new NumericListValue(new TreeSet<Integer>(Arrays.asList(2, 3, 1)), true).toString());
		assertEquals("1,2,3", new NumericListValue(Arrays.asList(1, 2, 3), false).toString());
		assertEquals("1,5-6,15", new NumericListValue(Arrays.asList(1, 5, 6, 15), true).toString());
		assertEquals("103,85,89,1", new NumericListValue(Arrays.asList(103, 85, 89, 1), true).toString());
	}
}