 class calculate{
  
  double length;
  double breadth;
  double height;
calculate(double length, double breadth, double height){
  this.length=length;
  this.breadth = breadth;
  this.height=height;

}
  double calculateArea (){
    return length * breadth;
  }

  double calculateVolume(){
    return length * breadth *height;
  }
}
public class classCalcuation {
  public static void main(String[] args) {
   calculate c1 = new calculate(5,6,7);

   System.out.println("Area "+c1.calculateArea());
   System.out.println("Volume "+c1.calculateVolume());
  }
}
