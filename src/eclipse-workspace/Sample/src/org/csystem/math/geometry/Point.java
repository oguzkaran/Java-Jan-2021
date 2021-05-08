/*----------------------------------------------------------------------------------------------------------------------
	Point sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.math.geometry;


public class Point {
	public int x;
	public int y;
	
	public Point()
	{		
	}
	
	public Point(int a)
	{
		x = a;
	}
	
	public Point(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);				
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(int a, int b)
	{
		return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
	}
	
	public void offset(int dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}	
	
	
	public String toString()
	{
		return String.format("{x: %d, y: %d}", x, y);
	}
}