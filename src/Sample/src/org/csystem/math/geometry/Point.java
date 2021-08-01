/*----------------------------------------------------------------------------------------------------------------------
	Point sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.math.geometry;

import static java.lang.Math.sqrt;
import static java.lang.String.format;

public class Point {
	public int x;
	public int y;

	Point(Point other)
	{
		x = other.x;
		y = other.y;
	}

	public Point()
	{		
	}
	
	public Point(int x)
	{
		this.x = x;
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double distance()
	{
		return this.distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return this.distance(other.x, other.y);
	}
	
	public double distance(int x, int y)
	{
		return sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	
	public void offset(int dxy)
	{
		this.offset(dxy, dxy);
	}
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return format("{x: %d, y: %d}", x, y);
	}
}