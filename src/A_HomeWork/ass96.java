package A_HomeWork;
import java.util.*;
public class ass96 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);
    while (start >= end) {
      System.out.print(start);
      start--;
    }
    
    
    
}
}
