import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a500 = sc.nextInt();
        int b100 = sc.nextInt();
        int c50 = sc.nextInt();
        int sum = sc.nextInt();
        int suma =sum;
        int sumb =sum;
        int sumc =sum;
        int counta =0;
        int countb =0;
        int countc =0;
        int patern =0;

        for(int i=1;i<=a500;i++){

            if(sum/(i*500)>0){
                counta++;
            }else{
                break;
            }

        }

        for(int i=1;i<=b100;i++){

            if(sum/(i*100)>0){
                countb++;
            }else{
                break;
            }

        }

        for(int i=1;i<=c50;i++){

            if(sum/(i*50)>0){
                countc++;
            }else{
                break;
            }

        }

        

        for(int i=0;i<=counta;i++){
            if((sum-500*i)==0){
                patern++;
            }
            suma=sum-i*500;
            if(suma>0){
                for(int j=0;j<=countb;j++){
                    if((suma-100*j)==0){
                        patern++;
                    }
                    sumb= suma-j*100;
                    if(sumb>0){

                        for(int k=0;k<=countc;k++){
                            if((sumb-50*k)==0){
                                patern++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(patern);
    }
}