// Permutations of given String
public class string10 {
	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		string10 permutation = new string10();
		permutation.permute(str, 0, n - 1);
	}

	private void permute(String str, int start, int end) {
		if (start == end)
			System.out.println(str);
		else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permute(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] cArray = a.toCharArray();
		temp = cArray[i];
		cArray[i] = cArray[j];
		cArray[j] = temp;
		return String.valueOf(cArray);
	}
}
