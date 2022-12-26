import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Y = sc.nextInt();
		int x = -1;
		int y = -1;
		int z = -1;

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1 - i; j++) {
					if (10000 * i + 5000 * j + 1000 * (n-i-j) == Y) {
						x = i;
						y = j;
						z = (n-i-j) ;
						System.out.println(x + " " + y + " " + z);
						return;
					} 
				}
			
		}

		System.out.println(x + " " + y + " " + z);
	}
}
