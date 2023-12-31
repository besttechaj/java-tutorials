
 class Test2 {
  public static void main(String[] args) {
    int paid = 9;

    // creating component's object to access their values
    Component com = new Component();
    
    com.playMusic();


    String result = com.getMeAPen(paid);
    System.out.println(result);
    
  }
}

// creating another component( similarly in React ) ie Class 
class Component{

  // defining method which return nothing 
  public void playMusic(){
    
    System.out.println("Playing Music...");
  } 

  // Defining method which return a value
  public String getMeAPen(int receivedAmount){
    if(receivedAmount==10){
    return "TAKE THIS PEN";

    }else{
      return "Invalid Amount";
    }
  }
}
