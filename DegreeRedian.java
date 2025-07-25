class DegreeRedian
{
static final double PI=3.14159265;
public static void main(String[] args)
{

int degree=Integer.parseInt(args[0]);

double radian= degree*(PI/180);

System.out.println(Math.sin(radian));

double result=Math.pow(Math.sin(radian),2)+ Math.pow(Math.cos(radian),2);

System.out.println(result);
}
}