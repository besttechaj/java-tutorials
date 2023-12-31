// IN java data types are divided into two categories : Primitive and non primitive data types

//Primitive : subdivide into following types --> Integer(byte, short, long, int), Float(double, float), Character and boolean
// integer types : 
// a) int -> 4 bytes
// b) long -> 8 bytes (put l as a suffix while storing the value in long data type )
// long ss = 32332l;
// c) short -> 2 bytes
// d) byte -> 1 byte :: -2^7 to 2^7 -1 ie. range  -128 to 127

// float : 4 bytes (put f as a suffix while storing the value in float data type )
// float num = 3.4f;

// double : 8 bytes (by default value in java)
// double num = 3.5

// Character : 2 bytes ( java has more bytes for character data type  as compared to any other language eg c language ( based on ASCII values(limited to some character))  because java follows UNICODE (it contains all characters which are supported by all types of programming language) which contains integer,all alphabets, special character ). 
// In java double quotes denotes the string value whereas single quotes denotes the character value
// char c = 'k';

// boolean : true or false 
// bool b = false;

//Non-Primitive datatype : 

class Hello1{
  public static void main(String args[]){
    System.out.println("Different data types in java are : ");
    //                       LITERALS
    int a= 10;
    float b= 3.3f;
    char c='l';
    double d= 3.33;
    boolean e = true;
    short f=  559;
    long g= 2323l;
    System.out.print(a + " "+ b +" "+ c +" "+ d +" "+ e +" "+ f +" "+g);
    //let's print binary format
    int num1 = 0b101;//5
    System.out.println(num1);
    // hexadecimal number
    int num2 = 0x7E;//126
    System.out.println(num2);
    // you can write zeros in this form also to understood more
    int num3 = 100_000_0000;
    System.out.println(num3);
    long num4 = 100_000_0000_0l;
    System.out.println(num4);
    
    // Integer value will implicitly converted to double value
    double num5 = 404;
    System.out.println(num5);//404.0
    double num6 = 12e10;// means 12*10^10
    System.out.println(num6);

    // Char can be treated as integer 
    char p = 'j';
    p++;
    System.out.println(p);// k 

  }
}