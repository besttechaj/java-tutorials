class Hello2 {
  public static void main(String[] args) {
    System.out.println("Hello java");
    System.out.println("PRE - INCREMENT");
    int num = 1000 ;
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




    // some of the other operators are as follows :
    // a) AND operator --> && 
    // b) OR operator --> ||
    // c) NOT operator --> !

    // conditional operators 
    // a) if(condition){} else{} 
    // b) if(condition){} else if(condition){} else if(condition){} else{}



    // Ternary Operator  **********************************
    int n = 12;
    int final_result = 0 ;
    final_result=n%2==0? 10 : 20 ;
    // after updating the value your result is ... 
    System.out.println(final_result);



  // Switch operator based on different cases ************************
  int n2 = 3;
  switch(n2) {
    case 1:
    System.out.println("case -1 matched ");
    break;
    case 2:
    System.out.println("case -2 matched ");
    break;
    case 3:
    System.out.println("case -3 matched ");
    break; // MANDATORY ELSE GO THE NEXT LINE TO PRINT TILL THE END POINT
    case 4:
    System.out.println("case -4 matched ");
    break;
    case 5:
    System.out.println(" case -5 matched ");
    break;
    default:
    System.out.println("No record found");
      break;
  } 



  //LOOPS --> FOR LOOP , WHILE LOOP, DO WHILE LOOP
  
  // 2hr 52min
  }
}
