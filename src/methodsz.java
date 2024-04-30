import java.util.Scanner;

public class methodsz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numA,numB,numC;

        System.out.println("First number : ");
        numA=scanner.nextInt();

        System.out.println("Second number : ");
        numB=scanner.nextInt();
        numC=numA+numB;
        System.out.println("Sum number : "+numC);


    }
}
