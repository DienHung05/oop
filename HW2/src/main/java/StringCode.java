import java.util.HashSet;
import java.util.Set;

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int n = str.length();
		int res = 0;
		for(int i = 0; i < n - 1; i++) {
			int cnt = 0;
			for(int j = i; j < n - 1; j++) {
				if(str.charAt(j) == str.charAt(j + 1)) cnt++;
			}
			res = Math.max(res, cnt);
		}
		return res;
	}

	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public String blowup(String str) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char cur = str.charAt(i);
			if (Character.isDigit(cur)) {
				if (i + 1 < str.length()) {
					int cnt = Character.getNumericValue(cur);
					for (int j = 0; j < cnt; j++) {
						res.append(str.charAt(i + 1));
					}
				}
			}
			else {
				res.append(cur);
			}
		}
		return res.toString();
	}

	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		HashSet<String> st = new HashSet<>();
		if (len > a.length() || len > b.length()) {
			return false;
		}
		for (int i = 0; i <= a.length() - len; i++) {
			st.add(a.substring(i, i + len));
		}
		for (int i = 0; i <= b.length() - len; i++) {
			if (st.contains(b.substring(i, i + len))) {
				return true;
			}
		}
		return false;
	}
}
