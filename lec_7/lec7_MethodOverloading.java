/*
METHOD OVERLOADING : 

Methods having same name but different in length of parameter or different in data types.

suppose add method takes 2 parameter as input. In some situation If user need to enter 3 parameters, we can create another method with the same name with different length of parameters or different data types.
*/

class Test3 {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    System.out.println(calc.add(20, 40));
    System.out.println(calc.num);
  }
}


class Calculator{
  // instance variable 
  int num = 500;

    // Original Method declaration
  public int add(int n1, int n2){
    return n1 + n2 ;
  }

    // Method having the same name but different in length of parameters
  public int add(int n1, int n2, int n3){
    return n1 + n2 + n3 ;
  }
  
    // Method having the same name but different in Data Types
  public double add(double n1, int n2){
    return n1 + n2 ;
  }

}

