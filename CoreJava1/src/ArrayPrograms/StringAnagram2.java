package ArrayPrograms;

public class StringAnagram2 {

	public static void main(String[] args) {
		String s1 = "eleven plus two";
		String s2 = "twelve plus one";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (isAnagram(s1, s2)) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Strings are not Anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] count1 = new int[127];
		int[] count2 = new int[127];

		for (int i = 0; i < str1.length(); i++) {
			count1[str1.charAt(i)]++;
			count2[str2.charAt(i)]++; 
		}

		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != count2[i]) {
				return false;
			}
		}

		return true;

	}
}
