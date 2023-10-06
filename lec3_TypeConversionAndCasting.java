class Hello{

  public static void main(String args[]){
    // TYPE CONVERSION AND CASTING

    byte b = 127;
    int a = 256;
    // since int value is bigger than byte range hence conversion is not possible 
    // b=a;

// ## CASTING ##  ............. Explicit conversion (Also known as Narrowing .... results in few data loss )


// converting int into byte
    byte c = 127;
    int d = 12;
    // since int value is lesser than the byte's range hence conversion is possible with the help of explicit conversion
    // syntax new_variable = ( type ) target_name
    c=(byte)d;
    System.out.println(c); // 12 

// ## CONVERSION ## ............ IMPLICIT CONVERSION (also known as Widening )
 byte bb = 126;
 int aa = 122;
 // since byte value is in the range of int data type hence implicit conversion ( automatically ) is possible
 aa=bb; 
 System.out.println(aa); // 126

 // MORE EXAMPLES

 //explicit conversion or narrowing or casting
 float ff = 5.6f;
 int x = (int)ff;
 System.out.println(x); // 5 --> due to explicit casting we loose value after point hence it is known as narrowing


 byte f1 = 127;
 int x1 = 257;
 f1 = (byte)x1;  
 System.out.println(f1); //1 --> while converting the 
  }
}