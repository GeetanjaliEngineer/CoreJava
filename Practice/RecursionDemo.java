package JavaPractice;

public class RecursionDemo {
	public static void main(String[] args) {
		boolean isPalindrome = isPalindrome(0, 2, "aba");
		System.out.println(isPalindrome);
	}

	public static boolean isPalindrome(int i, int j, String str) {
		if (i >= j) {

			return true;
		}
		if (str.charAt(i) != str.charAt(j)) {
			return false;
		}
		i = i + 1;
		j = j - 1;
		return isPalindrome(i, j, str);

	}
}
