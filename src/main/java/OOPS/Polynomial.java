package OOPS;

public class Polynomial {

	private int[] degreeCoefficient = new int[10];

	Polynomial()
	{

	}
	Polynomial(int[] arr){
		degreeCoefficient = arr;
	}

	private void increaseLength(int newLength)
	{
		int[] temp = degreeCoefficient;
		degreeCoefficient = new int[newLength+ 5];
		for(int i = 0;i<temp.length;i++)
		{
			degreeCoefficient[i] = temp[i];
		}
	}

	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
		if(degree>degreeCoefficient.length-1)
		{
			increaseLength(degree);
			setCoefficient(degree,coeff);
		}
		else {
			degreeCoefficient[degree] = coeff;
		}
		
	}
	
	// Prints all the terms(only terms with non-zero coefficients are to be printed) in increasing order of degree.
	public void print() {
		for (int i = 0; i <degreeCoefficient.length; i++) {
			int val = degreeCoefficient[i];
			if (val != 0)
				System.out.printf("%dx%d ", val, i);
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){

		int l1 = this.degreeCoefficient.length;
		int l2 = p.degreeCoefficient.length;
		int min  = Math.min(l1,l2);
		int[] temp  = new int[Math.max(l1,l2)];

		for(int i = 0;i<min;i++)
		{
			temp[i] = degreeCoefficient[i]+p.degreeCoefficient[i];
		}
		for(int j = min;j<degreeCoefficient.length;j++){
			temp[j] = degreeCoefficient[j];
		}
		for(int j = min;j<p.degreeCoefficient.length;j++){
			temp[j] = p.degreeCoefficient[j];
		}

		return new Polynomial(temp);
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		int l1 = this.degreeCoefficient.length;
		int l2 = p.degreeCoefficient.length;
		int min  = Math.min(l1,l2);
		int[] temp  = new int[Math.max(l1,l2)];

		for(int i = 0;i<min;i++)
		{
			temp[i] = degreeCoefficient[i]- p.degreeCoefficient[i];
		}
		for(int j = min;j<degreeCoefficient.length;j++){
			temp[j] = degreeCoefficient[j];
		}
		for(int j = min;j<p.degreeCoefficient.length;j++){
			temp[j] = -p.degreeCoefficient[j];
		}

		return new Polynomial(temp);
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int l1 = this.degreeCoefficient.length;
		int l2 = p.degreeCoefficient.length;
		Polynomial result   = new Polynomial();

		for(int i = 0;i<l1;i++) {
			for(int j = 0;j<l2;j++)
			{
				setAndAddIfPresentCoefficient(i+j,degreeCoefficient[i]*p.degreeCoefficient[j],result);
			}
		}
		return result;
	}
	private  static  void setAndAddIfPresentCoefficient(int degree, int coeff,Polynomial p){
		if(degree>p.degreeCoefficient.length-1)
		{
			p.increaseLength(degree);
			p.setAndAddIfPresentCoefficient(degree,coeff,p);
		}
		else {
			p.degreeCoefficient[degree]+=coeff;
		}

	}

}