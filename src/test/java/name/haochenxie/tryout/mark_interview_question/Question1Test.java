package name.haochenxie.tryout.mark_interview_question;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Question1Test {
	
	public List<Point> getSampleData() {
		Point[] points = new Point[] { 
				new Point(-1, 0), new Point(2, 2), new Point(1, 3) 
			};
		
		return Arrays.asList(points);
	}
	
	@Test
	public void testGetBottomLeft() {
		assertEquals(Question1.getBottomLeft(getSampleData()), new Point(-1, 0));
	}

	@Test
	public void testGetTopRight() {
		assertEquals(Question1.getTopRight(getSampleData()), new Point(2, 3));
	}

}
