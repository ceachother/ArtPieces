package com.lixar.interview;


public class NumberWords {

	/**
	 * This test can be completed with access to the Internet and has no time limits.
	 * <p>
	 * The output should be this file which, when run, will output your answers to the following problems.
	 * <p>
	 * 1. When passed a single integer between 0 and 10 the program should print out the textual representation
	 * of that integer in English.  E.g. given the integer 4 your program should print 'four'.
	 * <p>
	 * 2. Extend your solution in Q1 to support all integers between 0 and 99999.  Consider all cases necessary;
	 * for example
	 * - '10001' should print 'Ten Thousand and One'.
	 * - '6415'  should print 'Six Thousand Four Hundred and Fifteen'.
	 * - '93467' should print 'Ninety Three Thousand Four Hundred and Sixty Seven'.
	 * <p>
	 * You program should compile and will be passed each of the integers below as the first entry in the args array passed to the main method.
	 * It should print out each one in the form '1234 : One Thousand Two Hundred and Thirty Four'.
	 * <p>
	 * Question 1 Test Numbers: 0, 2, 4, 6, 8, 10
	 * Question 2 Test Numbers: 0, 2, 11, 17, 23, 100, 114, 756, 1010, 5500, 10000, 10001, 14389, 99999
	 */

	private static final String[] BelowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

	private static final String[] Tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	private static final String HUNDRED = " Hundred ";

	private static final String THOUSAND = " Thousand ";

	public static void main(String[] args) {
		Integer input;
		try {
			input = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Invalid input: " + args[0]);
			return;
		}

		if (0 == input) {
			System.out.println("0 : Zero");
		}
		else if (input > 99999) {
			System.out.println("Invalid input: "+ input);
		}
		else {
			System.out.println(input + " : " + getWords(input));
		}
	}

	private static String getWords(Integer num) {
		String result;
		//when the input is less than 20,
		// get word from BelowTwenty array
		if (num < 20) {
			result = BelowTwenty[num];
		}
		//when the input is less than 100 but greater than 20
		else if (num < 100) {
			result = Tens[num / 10] + " " + BelowTwenty[num % 10];
		}
		//when the input is less than 1000 but greater than 100,
		//using recursion to get the words below 1000
		else if (num < 1000) {
			String hundreds = (0 == num % 100) ? HUNDRED : HUNDRED + "and ";
			result = getWords(num / 100) + hundreds + getWords(num % 100);
		}

		//when the input is greater than 1000,
		//using two recursions to get the part greater than 1000 and below 1000
		else {
			String thousand = (num % 1000 > 99) ? THOUSAND : THOUSAND + "and ";
			result = getWords(num / 1000) + thousand + getWords(num % 1000);
		}
		return result.trim();
	}

}
