package javaAtoZ;



class Overriding
{
void methodOfParentClass()
{
 System.out.println("Parent's method()");
}
}
//Inherited class
class Child extends Overriding
{
// This method overrides methodOfParentClass() of Parent
@Override
void methodOfParentClass()
{
 System.out.println("Child's method()");
}
}


// Driver class
class MethodOverriding {
public static void main(String[] args)
{
 // If a Parent type reference refers
 // to a Parent object, then Parent's
 // methodOfParentClass is called
	Overriding obj1 = new Overriding();
    obj1.methodOfParentClass();
 // If a Parent type reference refers
 // to a Child object Child's methodOfParentClass()
 // is called. This is called RUN TIME
 // POLYMORPHISM.
 Overriding obj2 = new Child();
 obj2.methodOfParentClass();
}
}