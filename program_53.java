// Write a program fractional binary conversion from decimal.

import java.util.*;
public class Main
{
	static String decimalToBinary(double num, int k_prec)
	{
		String binary = "";
		int Integral = (int) num;

		double fractional = num - Integral;

		while (Integral > 0)
		{
			int rem = Integral % 2;
			binary += ((char)(rem + '0'));

			Integral /= 2;
		}

		binary = reverse(binary);

		binary += ('.');

		while (k_prec-- > 0)
		{
			fractional *= 2;
			int fract_bit = (int) fractional;

			if (fract_bit == 1)
			{
				fractional -= fract_bit;
				binary += (char)(1 + '0');
			}
			else
			{
				binary += (char)(0 + '0');
			}
		}

		return binary;
	}

	static String reverse(String input)
	{
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--)
		{
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}
		return String.valueOf(temparray);
	}

	public static void main(String[] args)
	{
	    Scanner scn = new Scanner(System.in);
		double n = scn.nextDouble();
		int k = scn.nextInt();
		System.out.println(decimalToBinary(n, k));
	}
}


//Input : 4.47 3
//Output : 100.011
