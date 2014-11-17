package name.haochenxie.tryout.mark_interview_question;

import java.util.Arrays;

public class Question3 {

	public static void ranker(int[] numbers) {
		Arrays.sort(numbers);

		for (int per : new int[] { 25, 50, 75, 90, 95, 99, 100 }) {
			double percent = (double) per / 100;
			System.out.println(String.format(
					"%d%% of the numbers are less than or equal to %d", per,
					atPercent(numbers, percent)));
		}
		System.out.println();
	}

	/**
	 * 
	 * @param numbers
	 *            sorted int array
	 * @param percent
	 *            double that presents the percentage
	 * @return the number in the int array at the specified percentage
	 */
	public static int atPercent(int[] numbers, double percent) {
		int idx = (int) Math.ceil(numbers.length * percent) - 1;
		if (idx < 0) idx = 0;

		return numbers[idx];
	}

}
