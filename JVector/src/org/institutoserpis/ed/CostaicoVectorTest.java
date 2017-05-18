package org.institutoserpis.ed;

import static org.junit.Assert.*;
import org.junit.Test;

public class CostaicoVectorTest {

	@Test
	public void testIndexOf() {
		assertEquals(3, Vector.indexOf(new int[]{32, 15, 7, 9, 12},9));
	}
	public void min() {
		assertEquals(7, Vector.min(new int[ {32, 15, 7, 9, 12}]));
	}
}
