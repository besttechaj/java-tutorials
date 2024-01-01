 class Student {
int rollNo;
int marks;
String name;  
}

  class Array22 {
  //main method
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.marks=90;
    s1.name="priya";
    s1.rollNo=31;

    Student s2 = new Student();
    s2.marks=50;
    s2.name="meenu";
    s2.rollNo=11;

    Student s3 = new Student();
    s3.marks=30;
    s3.name="tina";
    s3.rollNo=21;

    //creating array of student 
    Student stud[]= new Student[3];
    stud[0]=s1;
    stud[1]=s2;
    stud[2]=s3;

    for (int i = 0; i < stud.length; i++) {
      System.out.println(stud[i].rollNo+" : "+stud[i].name+" : "+stud[i].marks);
    }
  }
}



