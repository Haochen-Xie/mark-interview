package name.haochenxie.tryout.mark_interview_question;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Question3Test {

	@Test
	public void testAtPercent() {
		int[] arr = new int[] { 8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2 };
		
		double[] percents = new double[] {.25, .5, .75, .9, .95, .99, 1};
		int[] expected = new int[] {3, 8, 16, 20, 22, 22, 22};

		Arrays.sort(arr);
		
		for (int i = 0; i < expected.length; ++i) {
			assertEquals(expected[i], Question3.atPercent(arr, percents[i]));
		}
	}

}
