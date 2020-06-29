import java.util.*; 
import java.io.*; 
import java.util.Scanner;
class person
{
String name;
int age;
person()
{}
person(String name,int age)
{
this.name=name;
this.age=age;
}
}
class student extends person
{
int regno;
String course;
student(String name,int age, int regno, String course)
{
super(name,age);
this.regno=regno;
this.course=course;
}
void display()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Regno: "+regno);
System.out.println("Course: "+course);
}
}
class Demo
{
public static void main(String...args)
{
Scanner input= new Scanner(System.in);
String name,course;
int age,regno;
System.out.println("Enter your name");
name=input.nextLine();
System.out.println("Enter your Course");
course=input.nextLine();
System.out.println("Enter your age");
age=input.nextInt();
System.out.println("Enter your regno");
regno=input.nextInt();
student obj= new student(name,age,regno,course);
obj.display();
}
}