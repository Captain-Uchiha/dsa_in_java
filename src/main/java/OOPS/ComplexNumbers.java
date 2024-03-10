package OOPS;

import java.util.Scanner;

public class ComplexNumbers {

	int imaginaryPart;
	int realPart;

	ComplexNumbers(int r, int i)
	{
		imaginaryPart = i;
		realPart = r;
	}

	
	void print()
	{
		System.out.println(realPart + " + i"+imaginaryPart);
	}
	
	void plus(ComplexNumbers c2)
	{
		this.realPart+=c2.realPart;
		this.imaginaryPart+=c2.imaginaryPart;
	}

	void multiply(ComplexNumbers c2)
	{
		int rlPart = (realPart*c2.realPart)-(imaginaryPart*c2.imaginaryPart);
		imaginaryPart = realPart*c2.imaginaryPart + imaginaryPart*c2.realPart;
		realPart = rlPart;
	}


}
 class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();


		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}

// sample input 1
/**
 * 4 5
 * 6 7
 * 1
 *
 * sample input 2
 *
 * 4 5
 * 6 7
 * 2
 */