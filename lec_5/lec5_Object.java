
/*
OBJECT ************************8

What is an object in Java
object in Java
An entity that has state and behavior is known as an object e.g., chair, bike, marker, pen, table, car, etc. It can be physical or logical (tangible and intangible). The example of an intangible object is the banking system.

An object has three characteristics:

A) State: represents the data (value) of an object.
b) Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
c) Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.
Characteristics of Object in Java
For Example, Pen is an object. Its name is Reynolds; color is white, known as its state. It is used to write, so writing is its behavior.

An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

With the help of single class template/blueprint you can create n no. of objects from it.

Real life example of class and object is like: 
if there are n no. of people who want to reserve their seat for the travel journey via train. To control all the process you need a template/ blueprint like a reservation form that is work like your class. And from that class/ form you can create n no. of objects to store every users information.


Object Definitions:

An object is a real-world entity.
An object is a runtime entity.
The object is an entity which has state and behavior.
The object is an instance of a class.


CLASS  ****************************

What is a class in Java
A class is a group of objects which have common properties. Class is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

A class in Java can contain:

Fields
Methods
Constructors
Blocks
Nested class and interface
Class in Java
Syntax to declare a class:
class <class_name>{  
    field;  
    method;  
}  

 */

class Test1 {
  public static void main(String[] args) {

    int a= 100;
    int b= 200;

    //Creating an object
    Calculator calc = new Calculator();

    int result = calc.add(a,b);
    System.out.println("answer is : "+ result);
    
  }
}

class Calculator {
  public int add(int num1, int num2){
    System.out.println("Initiating Add method");
return num1 + num2 ;  


  //  public int add(int var1, int var2) {
  //     return var1 + var2;
  //  }

  //  public int add(int var1, int var2, int var3) {
  //     return var1 + var2 + var3;
  //  }

  //  public double add(double var1, int var3) {
  //     return var1 + (double)var3;
  //  }
}
}