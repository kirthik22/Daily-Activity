class Addmatrix
{
public static void main(String args[])
{
int a[][]={{10,20,30},{40,50,60}};
int b[][]={{70,80,90},{11,12,13}};
int sum[][]=new int[2][3];
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
sum[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Addition of matrices are:");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(sum[i][j]+" ");
}
System.out.println();
}
}
}