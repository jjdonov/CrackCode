package chap01;

import java.util.Arrays;

public class ArraysAndStrings {

	/**
	 * 1.1
	 */
	public static boolean isUnique(String s) {
		s = "12345";
		char[] c = s.toCharArray();
		String t = new String(c);
		return false;
	}

	/**
	 * 1.2 reverse c style string a c style string is terminate by the null char
	 */
	public static String reverseCString(String s) {
		if (s.length() < 3)
			return s;
		char[] charArray = s.toCharArray();
		int start = 0, end = s.length() - 2;
		while (start < end) {
			char t = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = t;
			end--;
			start++;
		}
		return new String(charArray);
	}

	/**
	 * 1.4 check to see if two strings are anagrams of each other
	 */
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] s1Char = s1.toCharArray();
		Arrays.sort(s1Char);
		char[] s2Char = s2.toCharArray();
		Arrays.sort(s2Char);
		s1 = String.valueOf(s1Char);
		s2 = String.valueOf(s2Char);
		return s1.equals(s2);
	}

	public static void rotate90() {
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },
				{ 9, 10, 11, 12 } };
		// assume n x n
		int rows = matrix.length;
		int cols = matrix[0].length;
		System.out.println("Rows : " + rows + ", Cols : " + cols);
		// iterate across each row, until we run out of rows
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		// iterate down each column
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(matrix[j][i] + "\t");
			}
			System.out.print("\n");
		}

		// j is column position
		// i is row position
		int i = 0, j = 0;
		// lets try iterating circularly
		//first across the top row
		for (j = 0; j < cols; j++) {
			System.out.print(matrix[i][j]);
		}
		//then down the outermost column
		for (i = 1; i < rows; i++) {
			System.out.print(matrix[i][j]);
		}
		//now iterate back across the bottom row
		
	}
}
