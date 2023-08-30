import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many numbers will you enter?  : ");
        int n=sc.nextInt();
        int min=0;
        int max=0;
        int number;
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+ ". Enter the number:");
            number=sc.nextInt();
            if(number<min||min==0){
                min=number;
            }
            if (number>max){
                max=number;
            }

        }
        System.out.println("The minimum number: "+min);
        System.out.println("The maximum number: "+max);
    }
}
