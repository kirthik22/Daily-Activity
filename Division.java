class Student
{
int rollno=10;
}
class Division extends Student
{
int rollno=15;
void disp()
{
System.out.println(rollno);
}
public static void main(String args[])
{
Division d=new Division();
d.disp();
}
}