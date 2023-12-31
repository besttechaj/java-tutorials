//steps to run the java code: 

// step-1 : compiler  convert your code(.java file) to byte code(ie .class file) which is given to jvm (which looks for public static main(String args[]){}(ie. signature) method to initialize your code) --> to compile your code : javac file_Name (this will create a .class byte code file) 

// step-2 : to run your .class file code : java class_Name

// jvm : java virtual machine is used to execute the java code. jvm is mainly biassed to code conversion and performs other minor functions ie memory management and security. it converts byte code into low -level machine code. ie Assembly language. jvm becomes operational when the byte code needs to be inter-preted into machine language. jvm only takes byte code file as input. SINCE JAVA IS PLATFORM INDEPENDENT BUT JVM IS PLATFORM DEPENDENT BECAUSE FOR EVERY OPERATING SYSTEM (WINDOWS, MAC, LINUX) JVM IS WRITTEN DIFFERENTLY.

// jre : java runtime environment contains jvm and other java's libraries which support to run your java code. jre is an run time environment which provide abstraction(ie. isolated environment) instead of running your code directly on operating system (ie windows,linux,mac : which are installed on your hardware machine eg. computer,laptop) that makes java more secure programming language as compared to others.jre creates a runtime environment in which the program can run effectively.EVERY USERS IN THIS WORLD WILL HAVE JVM AND JRE BY DEFAULT INSTALLED ON THEIR LAPTOP/COMPUTER. BUT FOR DEVELOPERS THEY NEED TO INSTALL JDK FOR DEVELOPMENT PURPOSES.JDK WILL HAVE UPGRADED VERSION TO WRITE JAVA APPLICATIONS.

// note --> jre identifies all the helpful class libraries needed for execution, while jvm is a subclass of jre that decodes the byte code into machine language and other minor tasks. jvm and jre do not participate in the development processes like debugging and compiling;jdk is used for them. 
// jdk : java development kit consists of jvm and jre. you need to install jdk on your machine to write code in java so that jre and jvm automatically installed on your machine.

// java is also known as WORA language (write once run anywhere) : this means programmer can develop java code on one system and can expect it to run on any other java-enabled system without any adjustment(ie on any other different hardware's operating system).this is all possible because of jvm.eg in traditional programming languages like c,c++ when programs were compiled, they used to be converted into the code  understood by the particular underlying hardware, so if  we try to run the same code at another machine with different hardware, which understands different code will cause an error, so you have to re-compile the code to be understood by the new hardware. In java, the program is not converted to code directly understood by hardware, rather it is converted to bytecode(.class file), which is interpreted by jvm, so once compiled it generates bytecode file, which can be run anywhere ( any machine ) which has JVM by default and hence it gets the nature of WORA language. hence java is platform independent whereas jvm and jre are platform dependent.

// java is strongly typed language (sensitive) ie. For different types of data we have different data types. Also we need to follow all the rules while writing the code in java else it will throw you an error.

class Test{
  public static void main(String a[]){
    System.out.println("hello Programmer !!");
    System.out.print("How are you?");
  }

} 