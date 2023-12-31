// data type range for conversion
// byte	: 1 byte	Stores whole numbers from -128 to 127
// short	: 2 bytes	Stores whole numbers from -32,768 to 32,767
// int	: 4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long : 8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	: 4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	: 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
// boolean	: 1 bit	Stores true or false values
// char	: 2 bytes	Stores a single character/letter or ASCII values


    // syntax for type casting :  new_variable = ( type ) target_name

class Hello3{

  public static void main(String args[]){
    // TYPE CONVERSION AND CASTING

    byte b = 127;
    int a = 256;
    // since int value is bigger than byte range hence conversion is not possible 
    // b=a;

// ## CASTING ##  ............. Explicit conversion (Also known as Narrowing .... results in few data loss)
byte b2= (byte)a;
System.out.println("after narrowing ie explicit from int to byte: "+b2);

// implicit conversion (ie widening) from byte to int
int a2 = b;
System.out.println("after widening ie implicit  from byte to int: "+a2);

// converting int into byte
    byte c = 127;
    int d = 12;
    // since int value is lesser than the byte's range hence conversion is possible with the help of explicit conversion (ie need to be done manually)
    // syntax for type casting :  new_variable = ( type ) target_name
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
 System.out.println(f1); //1 --> while converting int to byte it will divide the targeted value with the max. range of byte datatype:  257%256=1
 //Byte is 8 bit. 8 bit can represent 256 numbers.(2 raise to 8=256).Now first bit is used for sign. [if positive then first bit=0, if negative first bit= 1].let's say you want to convert integer 1099 to byte. just divide 1099 by 256. remainder is your byte representation of int
  }
}

//task --> memory units and their conversion