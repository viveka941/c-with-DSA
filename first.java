class first {
  public static void intor(String str, int age) {
    System.out.println("Name is " + str + " age " + age);
  }

  public static void factorial(int num) {
    int res = 1;
    for (int i = 1; i < num; i++) {
      res = res * i;

      
    }
    System.out.println(res);
  }

  public static void main(String[] args) {

    factorial(5);

  }
}