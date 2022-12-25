import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Integer cardList[] = new Integer[n];
			int sumAlice =0;
			int sumBob =0;

			for(int i=0;i<n;i++){
				cardList[i]=sc.nextInt();
			}

			Arrays.sort(cardList,Collections.reverseOrder());

			for(int i=0;i<n;i+=2){
				sumAlice += cardList[i];
			}

			for(int i=1;i<n;i+=2){
				sumBob += cardList[i];
			}

		System.out.println(sumAlice-sumBob);
	}
}

