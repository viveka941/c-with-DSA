class first {
  public static void intor(String str, int age) {
    System.out.println("Name is " + str + " age " + age);
  }

  public static int factorial(int num) {
    int res = 1;
    for (int i = 1; i < num; i++) {
      res = res * i;

      
    }
  return res;
  }

  public static int nCr(int n ,int r) {
    int num = factorial(n);
    int dum = factorial(r) * factorial(n-r);
    return num/dum;
  }

  public static void main(String[] args) {

    // System.out.println(factorial(4));
    System.out.println(nCr(5, 2));

  }
}