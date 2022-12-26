import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
	    int all[] =new int[n];
		ArrayList<Integer> sameNumber = new ArrayList<>();


		for(int i=0;i<n;i++){
			all[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++){
			if(sameNumber.contains(i)){
				continue;
			}
			for(int k=i+1;k<n;k++){
				if(all[i]==all[k]){
					sameNumber.add(k);
				}
			}
			count++;
		}
	    
		System.out.println(count);
	}
}

