package ArrayPrograms;

public class StringAnagram1 {

	public static void main(String[] args) {

		/*Not working for String with spaces
		String s1 = "Slot machines";
		String s2 = "cash lost in me";
		
		*/
		String s1 = "earTh";
		String s2 = "heart";
		s1.toLowerCase();
		s2.toLowerCase();
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		if (checkAnagram(str1, str2)) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Strings are Not Anagram");
		}
	}

	public static boolean checkAnagram(char[] str1, char[] str2) {
		if (str1.length != str2.length) {
			return false;
		}
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				if (str1[i] == str2[j]) {
					return true;
				}
			}

		}
		return false;
	}
}
