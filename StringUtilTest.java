import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtilTest {
	private static StringUtil obj;
	
	@BeforeClass
	public static void setareObject() {
		obj = new StringUtil();
	}
	
	@Test
	public void testConcatenation() {
		assertEquals("alina aldea", obj.concatenate("alina", "aldea"));
	}
	
	@Test
	public void testFemaleName() {
		assertTrue(obj.isFemale("Andreea"));
	}
	
	@Test
	public void testIsSubstring() {
		assertFalse(obj.isSubstringContained("munte", "a"));
	}

}
