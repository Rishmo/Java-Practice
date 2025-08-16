class swapping_of_two_variable
{
public static void main(String args[])
{
int a=4,b=2;
System.out.println("before swapping value of a: "+a);
System.out.println("before swapping value of b: "+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("after swapping value of a: "+a);
System.out.println("after swapping value of b: "+b);
}
}