/*----------------------------------------------------------------------------------------------------------------------
	Complex sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.math;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.String.format;

public class Complex {
	private static Complex add(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 + re2, im1 + im2);		
	}
		
	private static Complex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}	
	
	private static Complex multiply(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 * re2 - im1 * im2, re1 * im2 + re2 * im1);
	}	
	
	private static Complex divide(double re1, double im1, double re2, double im2)
	{
		//TODO:
		return new Complex();
	}
		
	public double re, im;
	
	public Complex()
	{		
	}
	
	public Complex(double re)
	{
		this.re = re;
	}
	
	public Complex(double re, double im)
	{
		this.re = re;
		this.im = im;
	}	
	
	public double getLength()
	{
		return sqrt(re * re + im  * im);
	}	
	
	public double getNorm()
	{
		return this.getLength();
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
		this.offset(dri, dri);
	}
	
	public void offset(double dr, double di)
	{
		re += dr;
		im += di;
	}	
	
	public String toString()
	{
		return format("|%.2f %c %.2fi| = %f", re, im > 0 ? '+' : '-', abs(im), getLength());
	}	
}