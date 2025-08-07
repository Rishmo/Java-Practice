class Fraction {
	public static void main(String[] args) {
		int x,y,c,d,i,gcd = 0;
		int n1=Integer.parseInt(args[0]);
		int d1=Integer.parseInt(args[1]);
		int n2=Integer.parseInt(args[2]);
		int d2=Integer.parseInt(args[3]);

		x=(n1*d2)+(d1*n2); 
		y=d1*d2; 

		for(i=1; i <= x && i <= y; ++i)
		{
			if(x%i==0 && y%i==0)
				gcd = i;
		}
		c=(n1*d2)-(d1*n2); 
		d=d1*d2; 

		for(i=1; i <= c && i <= d; ++i)
		{
			if(c%i==0 && d%i==0)
				gcd = i;
		}
		System.out.println("\nThe added fraction is "+ x/gcd + "/" + y/gcd);
		System.out.println("\nThe subtracted fraction is "+ c/gcd + "/" + d/gcd);

	}
}