/*----------------------------------------------------------------------------------------------------------------------
	Complex sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.math;

public class Complex {
	public static Complex add(double re1, double im1, double re2, double im2) //?leride gizlenecek
	{
		return new Complex(re1 + re2, im1 + im2);		
	}
		
	public static Complex subtract(double re1, double im1, double re2, double im2) //?leride gizlenecek
	{
		return add(re1, im1, -re2, -im2);
	}	
	
	public static Complex multiply(double re1, double im1, double re2, double im2) //?leride gizlenecek
	{
		return new Complex(re1 * re2 - im1 * im2, re1 * im2 + re2 * im1);
	}	
	
	public static Complex divide(double re1, double im1, double re2, double im2) //?leride gizlenecek
	{
		//TODO:
		return new Complex();
	}
		
	public double re, im;
	
	public Complex()
	{		
	}
	
	public Complex(double a)
	{
		re = a;
	}
	
	public Complex(double a, double b)
	{
		re = a;
		im = b;
	}	
	
	public double getLength()
	{
		return Math.sqrt(re * re + im  * im);
	}	
	
	public double getNorm()
	{
		return getLength();
	}
	
	public Complex getConjugate()
	{
		return new Complex(re, -im);
	}
	
	//add methods
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.re, z.im);	
	}
	
	public Complex add(Complex other)
	{
		return add(re, im, other.re, other.im);
	}
	
	public Complex add(double val)
	{
		return add(re, im, val, 0);
	}
	
	//subtract methods
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.re, z.im);	
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(re, im, other.re, other.im);
	}
	
	public Complex subtract(double val)
	{
		return subtract(re, im, val, 0);
	}
	
	//multiply methods
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.re, z.im);	
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(re, im, other.re, other.im);
	}
	
	public Complex multiply(double val)
	{
		return multiply(re, im, val, 0);
	}
	
	//divide methods
	public static Complex divide(double val, Complex z)
	{
		return divide(val, 0, z.re, z.im);	
	}
	
	public Complex divide(Complex other)
	{
		return divide(re, im, other.re, other.im);
	}
	
	public Complex divide(double val)
	{
		return divide(re, im, val, 0);
	}	
	
	//offset methods	
	public void offset(double dri)
	{
		offset(dri, dri);
	}
	
	public void offset(double dr, double di)
	{
		re += dr;
		im += di;
	}	
	
	public String toString()
	{
		return String.format("|%.2f %c %.2fi| = %f", re, im > 0 ? '+' : '-', Math.abs(im), getLength());
	}	
}