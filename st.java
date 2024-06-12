class Student{
  String name;
  int age;
  int rollNo;

  int phoneNo;
  String schoolName;

  Student(String name,int age, int rollNo,int phoneNo, String schoolname){
    this.name=name;
    this.age=age;
    this.rollNo=rollNo;
    this.phoneNo=phoneNo;
    this.schoolName=schoolname;

  }

  void printSt(){
    System.out.println("Name= "+name);
    System.out.println("Age= "+age);
    System.out.println("Roll No.= "+rollNo);
    System.out.println("Phone No= "+phoneNo);
    System.out.println("School Name= "+schoolName);
  }
}



public class st {

  public static void main(String[] args) {
   Student s1 = new Student("Ram", 15, 2, 987654321, "Lpu");
   s1.printSt();
  }
}
