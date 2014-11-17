package name.haochenxie.tryout.mark_interview_question;

import java.util.Arrays;
import java.util.List;

public class Question1 {

	public static void printPoints(Point[] points) {
		List<Point> list = Arrays.asList(points);
		Point bl = getBottomLeft(list);
		Point tr = getTopRight(list);
		
		System.out.println("Bottom-left: " + bl);
		System.out.println("Top-right: " + tr);
	}
	
	public static Point getBottomLeft(List<Point> points) {
		if (points.size() <= 0)
			throw new IllegalArgumentException();
		
		int x = points.get(0).x;
		int y = points.get(0).y;
		
		for (Point p : points) {
			if (p.x < x)
				x = p.x;
			if (p.y < y)
				y = p.y;
		}
		
		return new Point(x, y);
	}
	
	public static Point getTopRight(List<Point> points) {
		if (points.size() <= 0)
			throw new IllegalArgumentException();
		
		int x = points.get(0).x;
		int y = points.get(0).y;
		
		for (Point p : points) {
			if (p.x > x)
				x = p.x;
			if (p.y > y)
				y = p.y;
		}
		
		return new Point(x, y);
	}

}

class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
