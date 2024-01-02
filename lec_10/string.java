
public class string {
  public static void main(String[] args) {

    // declaration of string
    String str = new String("AJAY");
    System.out.println(str);

    // similar declaration is mention below
    String str2 = "Mishra";
    System.out.println(str2);

    String fname = "vishal";
    System.out.println("before updating: " + fname.hashCode());
    // It will create a new memory, original memory will remain unchanged: all this
    // because of string constant pool concept which checks if the provided string
    // literals/ value is already present or not. If it present then give the same
    // reference to another variable or else create another new memory for string
    // literal inside string constant pool

    fname = fname.concat("mishra");
    System.out.println(fname);
    System.out.println("after updating: " + fname.hashCode());

    // Only one object is created inside the heap area not two. Both will refer to
    // the same memory location
    String s1 = "navin";
    String s2 = "navin";
    System.out.println("hashcode for s1 is " + s1.hashCode());
    System.out.println("hashcode for s2 is " + s2.hashCode());
  }
}

/*
 * In Java, string is basically an object that represents sequence of char
 * values. An array of characters works same as Java string. For example:
 * 
 * char[] ch={'j','a','v','a','t','p','o','i','n','t'};
 * String s=new String(ch);
 * is same as:
 * 
 * String s="javatpoint";
 * Java String class provides a lot of methods to perform operations on strings
 * such as compare(), concat(), equals(), split(), length(), replace(),
 * compareTo(), intern(), substring() etc.
 */