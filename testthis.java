class Employee1
{
int empid;
String ename,department;
int sal;
Employee1(int empid,string ename,int sal)
{
this.empid=empid;
this.ename=ename;
this.sal==sal;
}
Employee1(int empid,string ename,int sal,string department)
{
this(empid,ename,sal);//this()must be first statement only 
this.department=department;
}
void disp()
{
system.out.println(empid+" "+ename+" "+sal+" "+department);
}
}
class Testthis1
{
public static void main(string args[])
{
Employee1 e=new Employee1(1,"Sam",30000);
Employee e1=new Employee1(02,"Samiksha".50000,"IT");
e.disp();
e1.disp();
}
}