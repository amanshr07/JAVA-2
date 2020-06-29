import java.util.Scanner;
class DEMO
{
String abc;
DEMO(String abc)
{
this.abc=abc;
class MyLocal
{
void sayHello(String XXX)
{
System.out.println("Hello "+XXX);
}
}
MyLocal obj1=new MyLocal();
obj1.sayHello(abc);
}
}
class TestLocal
{
public static void main(String...args)
{
Scanner input= new Scanner(System.in);
String name;
System.out.println("Enter your name");
name=input.nextLine();
DEMO obj=new DEMO(name);
}
}