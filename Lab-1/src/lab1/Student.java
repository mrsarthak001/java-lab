9package lab1;

public class Student {
    int studentage;
public Student(String name) {
     System.out.println("Nameis :" + name );
  }
  public void setAge( int age ) {
     studentage = age;
  }
  public int getAge( ) {
     System.out.println("Student's age is :" + studentage );
     return studentage;
  }
  public static void main(String[] args) {
     Student s = new Student( "EJ" );
     s.setAge( 20 );
     s.getAge( );
     System.out.println("Variable Value :" + s.studentage );
   }

}
