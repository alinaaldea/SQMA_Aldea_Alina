public class StringUtil {
	
	public String concatenate (String s1, String s2) {
		return s1 + " " + s2;
	}
	
	public boolean isFemale(String name) {
		if (name.endsWith("a") || name.equals("Carmen")) 
			return true;
	    else
			return false;
	}
	
	public boolean isSubstringContained(String s1, String substring) {
		return s1.contains(substring);
	}
	

}
