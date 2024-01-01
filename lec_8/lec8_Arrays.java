/*
ARRAYS : [] means it can holds multiple values

1-Dimensional Array

Declaring  ARRAY, If we know the values already 
int num [] = { 3,4,5 }

Declaring Array, If we don't know the value but providing the size of the array
int num [] = new int [ 4 ]
num[0]=10;
num[1]=10;
num[2]=10;
num[3]=10;
*/

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

  // 2-dimensional/ multidimensional array
  int num1 [][]= new int[3][4];// we have 3 arrays inside that each will have 4 elements: 3*4=12elements

// Providing the values to 2-dimensional/ multidimensional array
for (int i = 0; i < num1.length; i++) {
    for (int j = 0; j < 4; j++) {
      num1[i][j]=(int)(Math.random()*10);//math.random give decimal values less than 1
      // System.out.println(num1[i][j]);
    }
  }

  // printing the 2-dimensional/ multidimensional array
  for (int i = 0; i < num1.length; i++) {
    for (int j = 0; j < 4; j++) {
      // System.out.print(num1[i][j]+" ");
    }
    System.out.println();
  }

  //NEW WAY TO GET 2-dimensional/ multidimensional ARRAY
  for (int m[]  : num1) {
    System.out.println();//returns the arrays
    for(int n: m){
      System.out.print(n + "    ");//returns the arrays element
    }
  }
 

    // 2-dimensional/ multidimensional : Jagged array (only specifies the no. of array needed but not the size of each array)
int num2 [] [] = new int[3][];
// specifying the size of each array: 
//first-array
num2[0]=new int[3];
//second-array
num2[1]=new int[4];
//third-array
num2[2]=new int[2];

// Providing the values to 2-dimensional/ multidimensional
for (int i = 0; i < num2.length; i++) {
    for (int j = 0; j < num2[i].length; j++) {
      num2[i][j]=(int)(Math.random()*10);
    }
  }

  //NEW WAY TO PRINT 2-dimensional/ multidimensional
  for (int m[]  : num2) {
    System.out.println();//returns the arrays
    for(int n: m){
      System.out.print(n + "    ");//returns the arrays element
    }
  }


//3-Dimensional/ multidimensional array
int num3 [] [] []= new int[3][4][5];//[3]:3 row array, [4]:4 sub-array, [5]:no. of elements in each array


// Providing the values to 2-dimensional/ multidimensional
for (int i = 0; i < num3.length; i++) {
    for (int j = 0; j < 4; j++) {
      for(int k=0; k<5; k++){
              num3[i][j][k]=(int)(Math.random()*10);
      }
    }
  }

for (int i = 0; i < num3.length; i++) {

    for (int j = 0; j < 4; j++) {

      for(int k=0; k<5; k++){
              System.out.print(num3[i][j][k]+" ");
      }
      System.out.println();
    }
    System.out.println();
  }

  //NEW WAY TO PRINT 2-dimensional/ multidimensional
  for (int m[][]  : num3) {
    
    for(int n[]: m){
          
      for(int k : n){
        System.out.print(k+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
}}

