/* Hamne 4 interface banaya, sab functionalInterface type ka(Phele Functioninterface padh lena).
   ek rule h, bus ek hi abstract method hota h functional interface me. Uske method ka koi body ni hota h. */

@FunctionalInterface
interface A
{
void myName(String s);

}
interface B
{
double sum(int a, int b);
}
interface C
{
void show(int a, double b);
}
interface D
{
int Length(int [] a);
}
class main
{
public static void main(String...args)
{
/*jaise ki upar sabhi function ka body nhi h, toh hamne lambda use karke sabko define kiya. "->" isko lambda bolte h. 
   Question acche se padhna,jaha jaha display bola h waha display direct kar diya h, jaha jaha return bola h waha return kiya h*/

A obj1=(String S)->System.out.println(S);  
B obj2=(int a,int b)->(a+b);              
C obj3=(int a,double b)->System.out.println("A: "+a+" B: "+b);
D obj4=(int [] a)->(a.length);
obj1.myName("DEMO");
System.out.println(obj2.sum(5,7)); //this is how we print returned statement
obj3.show(4,5.5);
int[] arr={1,2,3,4,5,6,7};
System.out.println(obj4.Length(arr));
}
}