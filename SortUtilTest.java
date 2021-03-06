import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortUtilTest {
	private static SortUtil obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new SortUtil();
	}

	@Test
	public void testCorrectSort() {
		int arr[] = {5, 7, -2, 9};
		int[] expected = {-2, 5, 7, 9};
		obj.bubbleSort(arr);
        assertArrayEquals(expected, arr);
	}
	
	@Test
	public void testEmptyArray() {
		int arr[] = {};
		int[] expected = {};
		obj.bubbleSort(arr);
		assertArrayEquals(expected, arr);
	}
	
}
