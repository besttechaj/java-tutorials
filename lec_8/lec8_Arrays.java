/*
ARRAYS : [] means it can holds multiple values

Declaring  ARRAY, If we know the values already 
int num [] = { 3,4,5 }

Declaring Array, If we don't know the value but providing the size of the array
int num [] = new int [ 4 ]
num[0]=10;
num[1]=10;
num[2]=10;
num[3]=10;
*/

// 3 hr 51min

public class lec8_Arrays {
public static void main(String[] args) {

  
  // directly putting the values 
  int num []= {21,22,34,45,67};

  //to get the first element inside array
// System.out.println(num[0]);

  // to print the array's elements
for (int i = 0; i < num.length; i++) {
  // System.out.println(num[i]); 
}

  // multidimensional array
  int num1 [][]= new int[3][4];// we have 3 arrays inside that each will have 4 elements: 3*4=12elements

// Providing the values to multi-dimensional array
for (int i = 0; i < num1.length; i++) {
    for (int j = 0; j < 4; j++) {
      num1[i][j]=(int)(Math.random()*10);//math.random give decimal values less than 1
      // System.out.println(num1[i][j]);
    }
  }

  // printing the multi-dimensional array
  for (int i = 0; i < num1.length; i++) {
    for (int j = 0; j < 4; j++) {
      // System.out.print(num1[i][j]+" ");
    }
    System.out.println();
  }

  //NEW WAY TO GET MULTI-DIMENSIONAL ARRAY
  for (int m[]  : num1) {
    System.out.println();//returns the arrays
    for(int n: m){
      System.out.print(n + "    ");//returns the arrays element
    }
  }

}}

