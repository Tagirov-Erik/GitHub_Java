package com.gmail.eriktagirov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select task from lvl2:");
		System.out.println("1. About transparent array.");
		System.out.println("2. About mirror array rotation.");
		System.out.println("3. About your money in words.");

		int taskNum = sc.nextInt();

		switch (taskNum) {
		case 1:

			System.out.println("Select degree rotation:");
			System.out.println("1. 90");
			System.out.println("2. 180");
			System.out.println("3. 270");
			int degreeChoice = sc.nextInt();

			int[][] x = new int[7][7];
			int[][] a = fillArray(x);
			int[][] b = fillArray(x);
			int[][] c = fillArray(x);

			switch (degreeChoice) {
			case 1:
			case 90:
				System.out.println("90 degree rotation:");
				System.out.println("Initial array:");
				viewArray(a);
				a = turnNinety(a);
				System.out.println("After turn:");
				viewArray(a);
				break;
			case 2:
			case 180:
				System.out.println("180 degree rotation:");
				System.out.println("Initial array:");
				viewArray(b);
				a = turnOneHundredEighty(b);
				System.out.println("After turn:");
				viewArray(b);
				break;
			case 3:
			case 270:
				System.out.println("270 degree rotation:");
				System.out.println("Initial array:");
				viewArray(c);
				a = turnTwoHundredSeventy(c);
				System.out.println("After turn:");
				viewArray(c);
				break;
			default:
				System.out.println("Wrong degree rotation!");
				break;
			}

			break;
		case 2:
			int[] d = { 7, 2, 9, 4, 15, 150, -5, -4, 0 };
			System.out.println(Arrays.toString(d));
			d = mirroringArray(d);
			System.out.println(Arrays.toString(d));
			break;
		case 3:
			System.out.println("Enter your money (format: <dollars>.<cents>)");
			System.out.println("*Max limit money to convert: millions");
			double money = sc.nextDouble();
			if (money > 999999999.99) {
				System.out.println("Wrong input. Max number is 999999999.99");
				break;
			} else {
				System.out.println(inWords(money));
			}
			break;
		default:
			System.out.println("Wrong task number!");
			break;
		}
		sc.close();
	}

	/**
	 * Fill two-dimensional array every line from 1 to length of array
	 * 
	 * @param a Initial two-dimensional array
	 * @return Array with elements.
	 */

	public static int[][] fillArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = j + 1;
			}
		}
		return a;
	}

	/**
	 * Fill array from 0 to length of array with integer value
	 * 
	 * @param a Initial array
	 * @return Array with elements.
	 */

	public static int[] fillArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		return a;
	}

	/**
	 * Print array in console in matrix view.
	 * 
	 * @param a Array to view.
	 */
	public static void viewArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Turn array on 90 degree.
	 * 
	 * @param a Initial array.
	 * @return Turned array.
	 */
	public static int[][] turnNinety(int[][] a) {

		int m = 0;
		int n = 0;
		int j;

		for (int i = 0; i < a.length; i++) {

			if (i == 0) {
				j = 0;
			} else {
				j = i + 1;
			}

			while (j < a.length) {
				m = a[i][j];
				n = a[j][i];
				a[i][j] = n;
				a[j][i] = m;
				j++;
			}
		}
		return a;
	}

	/**
	 * Turn array on 180 degree.
	 * 
	 * @param a Initial array.
	 * @return Turned array.
	 */
	public static int[][] turnOneHundredEighty(int[][] a) {

		int m = 0;
		int n = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length / 2; j++) {

				m = a[i][j];
				n = a[i][a.length - 1 - j];
				a[i][j] = n;
				a[i][a.length - 1 - j] = m;
			}
		}
		return a;
	}

	/**
	 * Turn array on 270 degree.
	 * 
	 * @param a Initial array.
	 * @return Turned array.
	 */
	public static int[][] turnTwoHundredSeventy(int[][] a) {

		int m = 0;
		int n = 0;

		for (int i = 0; i < a.length; i++) {

			int j = 0;

			do {
				m = a[i][j];
				n = a[a.length - 1 - j][a.length - 1 - i];

				a[a.length - 1 - j][a.length - 1 - i] = m;
				a[i][j] = n;

				j++;

				if (i == 0 && j == a.length) {
					break;
				}
			} while (j < (a.length - i));
		}
		return a;
	}

	/**
	 * Mirroring array.
	 * 
	 * @param a Initial array.
	 * @return Mirror array.
	 */
	public static int[] mirroringArray(int[] a) {
		int m = 0;
		int n = 0;

		for (int i = 0; i < (a.length / 2); i++) {
			m = a[i];
			n = a[a.length - 1 - i];
			a[i] = n;
			a[a.length - 1 - i] = m;
		}
		return a;
	}

	public static String inWords(double money) {

		String result = "";// result String to output
		int intPart = (int) money;
		int fracPart = (int) ((money - intPart) * 100);

		String[] digitsInWords = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] teenInWords = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String[] tensInWords = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		int[] intPartDigits = numberToDigit(intPart, 9);
		int[] fracPartDigits = numberToDigit(fracPart, 2);

		String[] moneyInWords = new String[9];// storage array for dollars in words (max rank millions)
		String[] centsInWords = new String[2];// storage array for cents in words

		/*
		 * Convert to words every hundreds rank and fill corresponding position in
		 * storage array
		 */
		for (int i = 0; i < intPartDigits.length; i = i + 3) {
			if (intPartDigits[i] > 1) {
				moneyInWords[i] = digitsInWords[intPartDigits[i]] + " hundreds";
			}
			if (intPartDigits[i] == 1) {
				moneyInWords[i] = digitsInWords[intPartDigits[i]] + " hundred";
			}
		}

		/*
		 * Convert to words every tens, "teens" and "ones" rank and feel corresponding
		 * position in storage array.
		 */
		for (int i = 1; i < intPartDigits.length; i = i + 3) {
			if (intPartDigits[i] > 1) {
				moneyInWords[i] = tensInWords[intPartDigits[i]];
				moneyInWords[i + 1] = digitsInWords[intPartDigits[i + 1]];
			}
			if (intPartDigits[i] == 1) {
				moneyInWords[i + 1] = teenInWords[intPartDigits[i + 1]];
			}
			if (intPartDigits[i] == 0) {
				moneyInWords[i + 1] = digitsInWords[intPartDigits[i + 1]];
			}
		}

		/* Convert cent part to words. */
		if (fracPartDigits[0] > 1) {
			centsInWords[0] = tensInWords[fracPartDigits[0]];
			centsInWords[1] = digitsInWords[fracPartDigits[1]];
		}
		if (fracPartDigits[0] == 1) {
			centsInWords[1] = teenInWords[fracPartDigits[1]];
		}
		if (fracPartDigits[0] == 0) {
			centsInWords[1] = digitsInWords[fracPartDigits[1]];
		}

		/* Check for plural. */
		/* million */
		if ((intPartDigits[0] == 0) && (intPartDigits[1] == 0) && (intPartDigits[2] == 1)) {
			moneyInWords[2] = moneyInWords[2] + " " + "million";
		} else if ((intPartDigits[0] == 0) && (intPartDigits[1] == 0) && (intPartDigits[2] == 0)) {
			moneyInWords[2] = null;
		} else {
			moneyInWords[2] = moneyInWords[2] + " " + "millions";
		}
		/* thousand */
		if ((intPartDigits[3] == 0) && (intPartDigits[4] == 0) && (intPartDigits[5] == 1)) {
			moneyInWords[5] = moneyInWords[5] + " " + "thousand";
		} else if ((intPartDigits[3] == 0) && (intPartDigits[4] == 0) && (intPartDigits[5] == 0)) {
			moneyInWords[5] = null;
		} else {
			moneyInWords[5] = moneyInWords[5] + " " + "thousands";
		}
		/* cent */
		if ((fracPartDigits[0] == 0) && (fracPartDigits[1] == 0) && (fracPartDigits[1] == 1)) {
			centsInWords[1] = centsInWords[1] + " " + "cent";
		} else if ((fracPartDigits[0] == 0) && (fracPartDigits[1] == 0)) {
			centsInWords[0] = null;
			centsInWords[1] = null;
		} else if ((fracPartDigits[0] != 0) && (fracPartDigits[1] == 0)) {
			centsInWords[0] = centsInWords[0] + " " + "cents";
			centsInWords[1] = null;
		} else {
			centsInWords[1] = centsInWords[1] + " " + "cents";
		}
		/* dollar */
		int countDollars = 0;
		for (int j = 0; j < intPartDigits.length; j++) {
			if (intPartDigits[j] == 0) {
				countDollars++;
			}
		}
		if ((countDollars == 8) && (intPartDigits[8] == 1)) {
			moneyInWords[8] = moneyInWords[8] + " " + "dollar";
		} else {
			moneyInWords[8] = moneyInWords[8] + " " + "dollars";
		}

		/* Create result string from storage array. */
		for (int i = 0; i < moneyInWords.length; i++) {
			if (moneyInWords[i] != null) {
				result = result + moneyInWords[i] + " ";
			}
		}
		for (int i = 0; i < centsInWords.length; i++) {
			if (centsInWords[i] != null) {
				result = result + centsInWords[i] + " ";
			}
		}
		return result;
	}

	/**
	 * Create array with digits of initial integer number.
	 * 
	 * @param num Initial number.
	 * @return Array with digits.
	 */

	public static int[] numberToDigit(int num, int maxRank) {

		char[] a = String.valueOf(num).toCharArray();
		int[] digits = new int[maxRank];
		int j = a.length - 1;
		for (int i = (digits.length - 1); i >= 0; i--) {
			if (j >= 0) {
				digits[i] = Character.getNumericValue(a[j]);
				j--;
			}
		}
		return digits;
	}
}
