import java.util.*;
public class add
{
public static void main(String[] args) {
int x,y,i,gcd = 0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);

//Scanner sc = new Scanner(System.in);
//System.out.println("\nEnter the numerator for 1st number : ");
//a = sc.nextInt();
//System.out.println("\nEnter the denominator for 1st number : ");
//b = sc.nextInt();
//System.out.println("\nEnter the numerator for 2nd number : ");
//c = sc.nextInt();
//System.out.println("\nEnter the denominator for 2nd number : ");
//d = sc.nextInt();

x=(a*d)+(b*c); //numerator
y=b*d; //denominator
// Trick part. Reduce it to the simplest form by using gcd.
for(i=1; i <= x && i <= y; ++i)
{
if(x%i==0 && y%i==0)
gcd = i;
}
System.out.println("\nThe added fraction is "+ x/gcd + "/" + y/gcd);
System.out.println();
}
}