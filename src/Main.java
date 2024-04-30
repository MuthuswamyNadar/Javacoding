import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int a1=scanner.nextInt();
        int a2=scanner.nextInt();
        int a3=scanner.nextInt();

        if(a1>a2)
        {
            System.out.println(a1);
        }else
        {
            System.out.println(a2);
        }
    }
}