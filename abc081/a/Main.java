import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b;
        

        a=a.replace("0","");
        b = a.length();

        System.out.println(b);

    }
}
