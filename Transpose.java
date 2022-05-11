class Transpose
{
public static void main(String args[])
{
int a[][]={{10,20,22},{20,30,40},{40,50,56}};
int b[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(a[i][j]+" ");
}
System.out.println();
}
System.out.println("After transpose the elements are:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
b[i][j]=0;
b[i][j]=a[j][i];

System.out.println(b[i][j]+" ");
}
System.out.println();
}
}
}