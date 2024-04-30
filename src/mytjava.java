import java.util.Scanner;

public class mytjava {
    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter temp in C: ");
//        float tempC=sc.nextInt();
//        float tempf=(tempC*9/5)+32;
//        System.out.println(tempf);
        sppedofcar();
    }
    static void sppedofcar()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Distance of Car ");
        int Distane=in.nextInt();
        System.out.println("Enter the Time of car");
        int time=in.nextInt();

        int soc=Distane/time;
        System.out.println("The Distance of the car is "+soc);

    }
}
