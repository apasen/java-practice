package A_HomeWork;

public class ass155 {
public static void main(String[] args) {
	int n1 = 0;
	int n2 = 1;
	int n3 = 0;
	System.out.print(n1 + " ");
	System.out.print(n2 + " ");
	do {
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		System.out.println(n3 + " ");
		
	} while (true);
	
}
}
