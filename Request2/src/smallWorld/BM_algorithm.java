package smallWorld;

public class BM_algorithm {
	private static int dist(char c, char T[]) {
		int n = T.length;
		if (c == T[n - 1]) {
			return n;
		}

		for (int i = n; i >= 1; i--) {
			if (T[i - 1] == c)
				return n - i;
		}

		return n;
	}

	public static boolean bm_match(String source, String pattern) {

		char[] s = source.toCharArray();
		char[] p = pattern.toCharArray();
		int slen = s.length, plen = p.length;

		if (slen < plen) {
			return false;
		} else {
			int i = plen, k, j;

			while (i <= slen) {
				k = i;
				j = plen;
				while (j > 0 && s[i - 1] == p[j - 1]) {
					i--;
					j--;
				}

				if (0 == j) {
					return true;
				} else {
					i = i + dist(s[i - 1], p);

					if (i > slen) {
						return false;
					}
				}

			}
		}
		return false;
	}
	
}
