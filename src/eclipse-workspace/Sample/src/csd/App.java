/*----------------------------------------------------------------------------------------------------------------------	
	 Point sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		Point p1, p2;
		
		p1 = new Point();
		p2 = new Point();
		
		p1.x = 100;
		p1.y = 200;
		
		p2.x = 50;
		p2.y = -45;
		
		p1.display();
		p2.display();
		
		p1.offset(30);
		p2.offset(10);
		
		System.out.println("---------------------");
		
		p1.display();
		p2.display();		
	}
}

class Point {
	public int x;
	public int y;
	
	//...
	
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
	
	public void display()
	{
		System.out.printf("{x: %d, y: %d}%n", x, y);
	}
}
