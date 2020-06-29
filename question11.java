@FunctionalInterface
interface Predicate
{
boolean test(String t);
}
class MAIN
{
public static void main(String...args)
{
Predicate obj=(String t)->t.contains("c");
System.out.println(obj.test("Decmo"));
}
}