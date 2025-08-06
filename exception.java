public class exception{
  public static void main(String[] args){
	int a[]={2,3};
	int b=2;
	int c=10;	
	try{
		int num=0;
		num=Integer.parseInt(args[0]);
		a[2]=4;
		int y=c/(b-b);
	}
	catch(NumberFormatException e)
	{ 
		System.out.println("number format error occured"); 
	}
	catch(ArrayIndexOutOfBoundsException e)
	{ 
		System.out.println("array bound error occured"); 
	}
	catch(ArithmeticException e)
	{ 
		System.out.println("divided by zero error occured"); 
	}
  }
}