import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();
			int sumDigits=0;
			int sum=0;
			
			for(int i=1;i<=n;i++){
				sumDigits=0;
				for(int j=i ;j!=0;){
					sumDigits += j%10;
					j/=10;
				}
			
				if(sumDigits>=a&sumDigits<=b){
					sum +=i;
				}
			}
			System.out.println(sum);

		}
}

