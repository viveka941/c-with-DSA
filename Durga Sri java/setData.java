import java.util.HashSet;
import java.util.Set;

public class setData {
  public static void main(String[] args) {
    
    
    Set<Integer> un = new HashSet<>();
    un.add(4);
    un.add(45);
    un.add(8);
    un.add(40);
    for (int i : un) {
      System.out.print(i+" ");
    }
  }
}
