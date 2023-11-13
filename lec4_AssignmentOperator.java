class Hello {
  public static void main(String[] args) {
    System.out.println("Hello java");
    System.out.println("PRE - INCREMENT");
    int num = 10 ;
    //  pre - increment ie ++num
    // while using ++num operator with assignment operator (=) :: first increment then fetch the value
    int result1 = ++num; // due to first increment 11 will be stored
    System.out.println(num);
    System.out.println("result is "+result1);
    System.out.println("**************************************");
    System.out.println("POST - INCREMENT");
    // num++ ie  post - increment
    int num2 = 100;
    // while using num2++ operator with assignment operator (=) :: first fetch the value then increment
    int result2 =num2++; //due to first fetching 100 will be stored
    System.out.println(num2);
    System.out.println(result2);

    //Note : both num++ and ++num works same if they are used individual but works differently when using with some operators 

    // To check whether two variable's literal is same or not use "==" comparison operator 
  }
}
