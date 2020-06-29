import java.util.Scanner; //this is very important program. kafi sara concept check karta h ye
interface Testing
{
boolean checkString(String str);
}
class Input implements Testing
{
String data;
char ch;
int c=0;
Scanner input=new Scanner(System.in);
String getInput()
{
System.out.println("Enter a string");
data=input.nextLine();
return "";
}
public boolean checkString(String str)
{
for(int i=0;i<data.length();i++)
{
data=str;
ch=data.charAt(i);
if(ch=='a' || ch=='A' || ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'|| ch=='o'|| ch=='O'|| ch=='u'|| ch=='U')
c=c+1;
}
if(c >= 5)
{
return true;
}
else
{
return false;
}
}
public static void main(String...args)
{
Input obj=new Input();
int i=0;
while(i==0){
obj.getInput();
if(obj.checkString(obj.data)==true)
{
i=1;
}
else
{
System.out.println("The inputed String does not have all the vowels");
i=0;
}}
System.out.println("String Accepted");
}
}
