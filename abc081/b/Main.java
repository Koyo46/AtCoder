import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        int count[]=new int[n];
        int divided=0;

        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++) {
            divided = A[i];
            int d=divided%2;
            for(;d==0;){
                count[i]++;
                A[i]/=2;
                d = A[i]%2;
             }
        }

        int min = count[0];
        for(int i = 1; i < n-1 ;i++){
            if(min > count[i]){
                min = count[i];
            }
        }
        
        System.out.println(min);

    }
}
