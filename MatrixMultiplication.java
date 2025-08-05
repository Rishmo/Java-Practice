import java.util.*;
public class MatrixMultiplication
{
public static void main(String args[])
{
int row, col,i,j;
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the number of rows: ");
row = in.nextInt();
 
System.out.println("Enter the number columns: ");
col = in.nextInt();
 
int mat1[][] = new int[row][col];
int mat2[][] = new int[row][col];
int result[][] = new int[row][col];
 
System.out.println("Enter elements for matrix 1: ");
 
for (i=0; i <row; i++ )
{ 
 
for (j= 0; j<col; j++ )
mat1[i][j] = in.nextInt();
 
System.out.println();
}
System.out.println("Enter elements for matrix 2: ");
 
for ( i= 0 ; i < row ; i++ )
{
 
for ( j= 0 ; j < col ;j++ )
mat2[i][j] = in.nextInt();
 
System.out.println();
}
 
for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < col ;j++ )
{
result[i][j]=0;
for(int k=0;k<row;k++)
{
result[i][j] = result[i][j]+mat1[i][k]*mat2[k][j] ; 
}
}
}
 
System.out.println("Multiplication of a matrix:- ");
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(result[i][j]+"\t");
 
System.out.println();
}
 
}
}
